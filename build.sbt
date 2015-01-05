import NativePackagerKeys._

name := """play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

maintainer in Docker := "Ralph Zitz"

dockerExposedPorts in Docker := Seq(9000, 9443)
