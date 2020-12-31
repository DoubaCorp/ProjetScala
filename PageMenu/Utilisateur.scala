package PageMenu

import java.sql._

import javax.swing.JButton

import javax.swing.JFrame

import javax.swing.table.DefaultTableModel

import PageLogin.connexion

import Utilisateur._

object Utilisateur {

  /**
    * @param args the command line arguments
    */
  def main(args: Array[String]): Unit = {
    try for (info <- javax.swing.UIManager.getInstalledLookAndFeels
             if "Nimbus" == info.getName) {
      javax.swing.UIManager.setLookAndFeel(info.getClassName)
//break
    } catch {
      case ex: ClassNotFoundException =>
        java.util.logging.Logger
          .getLogger(classOf[Utilisateur].getName)
          .log(java.util.logging.Level.SEVERE, null, ex)

      case ex: InstantiationException =>
        java.util.logging.Logger
          .getLogger(classOf[Utilisateur].getName)
          .log(java.util.logging.Level.SEVERE, null, ex)

      case ex: IllegalAccessException =>
        java.util.logging.Logger
          .getLogger(classOf[Utilisateur].getName)
          .log(java.util.logging.Level.SEVERE, null, ex)

      case ex: javax.swing.UnsupportedLookAndFeelException =>
        java.util.logging.Logger
          .getLogger(classOf[Utilisateur].getName)
          .log(java.util.logging.Level.SEVERE, null, ex)

    }
  }
Variables declaration - do not modify

}

class Utilisateur extends javax.swing.JFrame {

  private var bfer: JButton = new JButton("Fermer")

//public class FenetreListeProduit extends javax.swing.JFrame {
  var stListe: Statement = _

  var maconnexion: connexion = new connexion()

  initComponents()

  this.setLocation(500, 200)

  this.defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE

  val model: DefaultTableModel = new DefaultTableModel()

  model.addColumn("Speudo ")

  model.addColumn("Password")


  TABLEPRO.setModel(model)

  val requeteListe: String = "select * from users"

  try {
    stListe = maconnexion.etablirconnection().createStatement()
    val resultat: ResultSet = stListe.executeQuery(requeteListe)
    while (resultat.next()) model.addRow(
      Array(resultat.getString("login"), resultat.getString("password")))
  } catch {
    case ex: SQLException => println(ex)

  }

  bfer.setBounds(75, 150, 100, 30)

  private def initComponents(): Unit = {
    jLabel1 = new javax.swing.JLabel()
    TABLE = new javax.swing.JScrollPane()
    TABLEPRO = new javax.swing.JTable()
    this.defaultCloseOperation = javax.swing.WindowConstants.DISPOSE_ON_CLOSE
// NOI18N
    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24))
    jLabel1.setText("LISTE DES UTILISATEURS")
    TABLEPRO.setModel(
      new javax.swing.table.DefaultTableModel(
        Array(Array(null, null, null, null, null),
              Array(null, null, null, null, null),
              Array(null, null, null, null, null),
              Array(null, null, null, null, null)),
        Array("Title 1", "Title 2", "Title 3")
      ))
    TABLE.setViewportView(TABLEPRO)
    val layout: javax.swing.GroupLayout =
      new javax.swing.GroupLayout(getContentPane)
    getContentPane.setLayout(layout)
    layout.setHorizontalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addGroup(
              layout
                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jLabel1,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  282,
                                  javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(
                  layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(TABLE,
                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                  375,
                                  javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(15, java.lang.Short.MAX_VALUE)))
    layout.setVerticalGroup(
      layout
        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(
          layout
            .createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          29,
                          javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(
              javax.swing.LayoutStyle.ComponentPlacement.RELATED,
              javax.swing.GroupLayout.DEFAULT_SIZE,
              java.lang.Short.MAX_VALUE)
            .addComponent(TABLE,
                          javax.swing.GroupLayout.PREFERRED_SIZE,
                          275,
                          javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap()))
    pack()
  }

  private var TABLE: javax.swing.JScrollPane = _

  private var TABLEPRO: javax.swing.JTable = _

  private var jLabel1: javax.swing.JLabel = _

}
