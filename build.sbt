import com.typesafe.sbt._
import com.typesafe.sbt.packager._
import com.typesafe.sbt.SbtNativePackager._

name := "header-extractor"

organization := "im.chic.devtools"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.5"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.3.0"

libraryDependencies += "com.google.guava" % "guava" % "18.0"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.10" % "test"

libraryDependencies += "junit" % "junit" % "4.12" % "test"

compileOrder := CompileOrder.Mixed

javacOptions ++= Seq( "-source", "1.6", "-target", "1.6" )

packageArchetype.java_application
