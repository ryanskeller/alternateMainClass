name := """alternateMainClass"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

mainClass in (Compile,run) :=Some("worker.Worker")

mainClass in (Compile, packageBin) :=Some("worker.Worker")

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)
