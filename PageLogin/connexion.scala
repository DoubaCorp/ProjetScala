package PageLogin

import java.sql.Connection

import java.sql.DriverManager

class connexion {

  var con: Connection = _

  try {
    Class.forName("com.mysql.jdbc.Driver")
    con = DriverManager.getConnection("jdbc:mysql://localhost/ecole",
                                      "root",
                                      "")
    println("connection Etablie")
  } catch {
    case e: Exception => println("Base de donnee introuvable")

  }

  def etablirconnection(): Connection = con

}
