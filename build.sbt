name := "sbt-assignment2"
version := "1.0.0"
scalaVersion := "2.12.6"
import sbt._
import Keys._
lazy val welcomeimpl = project.settings(libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test").dependsOn(util)
lazy val util = project
