package PageLogin

import java.awt.Color

import java.awt.Font

import java.awt.event.ActionEvent

import java.awt.event.ActionListener

import java.sql.ResultSet

import java.sql.SQLException

import java.sql.Statement

import javax.swing.ImageIcon

import javax.swing.JButton

import javax.swing.JFrame

import javax.swing.JLabel

import javax.swing.JOptionPane

import javax.swing.JPanel

import javax.swing.JPasswordField

import javax.swing.JTextField

import PageAcceuil.index_accueil

import login._

object login {

  def main(args: Array[String]): Unit = {
    val fen: login = new login()
    fen.setVisible(true)
  }

}

class login extends JFrame {

  var txtlog: JTextField = new JTextField()

  var txtpwd: JPasswordField = new JPasswordField()

  var con: JButton = new JButton("Connexion")

  var ann: JButton = new JButton("Terminer")

  var st: Statement = _

  var rt: ResultSet = _

  var kk: connexion = new connexion()

  this.title = "Utilisateurs"

  this.setSize(400, 300)

  this.locationRelativeTo = null

  this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

  val p: JPanel = new JPanel()

  p.setLayout(null)

  val txt: JLabel = new JLabel("IDENTIFICATION")

  txt.setIcon(
    new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\ic_secure.png"))

  val lblog: JLabel = new JLabel()

  lblog.setIcon(
    new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\Originals\\log.png"))

  val lbpwd: JLabel = new JLabel("")

  lbpwd.setIcon(
    new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\Originals\\pwdd.jpg"))

  val fer: Font = new Font("BOLD", 0, 16)

  lblog.setFont(fer)

  lbpwd.setFont(fer)

  con.setFont(fer)

  ann.setFont(fer)

  txt.setFont(fer)

  val ac: JLabel = new JLabel("")

  ac.setIcon(new ImageIcon("C:\\Users\\badiane\\Desktop\\img\\well.gif"))

  ac.setBounds(5, 90, 160, 90)

//positionnement des lable et boutons
  p.add(ac)

  txt.setBounds(150, 50, 200, 30)

  p.add(txt)

  txt.setSize(150, 20)

  lblog.setBounds(120, 100, 150, 23)

  p.add(lblog)

  txtlog.setBounds(230, 100, 130, 23)

  p.add(txtlog)

  lbpwd.setBounds(130, 140, 170, 23)

  p.add(lbpwd)

  txtpwd.setBounds(230, 140, 130, 23)

  p.add(txtpwd)

  con.setBounds(130, 200, 110, 20)

  p.add(con)

  ann.setBounds(250, 200, 110, 20)

  p.add(ann)

  con.addActionListener(new ActionListener() {
    override def actionPerformed(arg0: ActionEvent): Unit = {
      var c: String = null
      var p: String = null
      c = txtlog.getText
      p = txtpwd.getText
      val query: String = "SELECT * FROM users WHERE login='" + c + "' and password='" +
          p +
          "'"
      try {
        st = kk.etablirconnection().createStatement()
        rt = st.executeQuery(query)
        if (rt.next()) {
          if (c.equalsIgnoreCase(rt.getString("login")) && p.equalsIgnoreCase(
                rt.getString("password"))) {
            val f: index_accueil = new index_accueil()
            f.setVisible(true)
            dispose()
          }
        } else
          JOptionPane.showMessageDialog(
            null,
            "Mot de passe oublier")
      } catch {
        case e: SQLException => {}

      }
    }
  })

  ann.addActionListener(new ActionListener() {
    override def actionPerformed(arg0: ActionEvent): Unit = {
      dispose()
    }
  })

  this.contentPane = p

}
