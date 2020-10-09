package scala.java.maven

import scala.java.maven.javasource.JavaLibrary

/**
 * @author ${user.name}
 */
object App {
  
  def main(args : Array[String]) {
    val javaLibrary = new JavaLibrary("Do or do not. There is no try.")
    println( javaLibrary )
  }

}
