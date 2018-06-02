name := "async_magic_tricks"

version := "1.0"

lazy val scala212 = "2.12.6"
lazy val scala211 = "2.11.12"

scalaVersion := scala212
crossScalaVersions := Seq(scala211, scala212)

scalafmtOnCompile in ThisBuild := true

libraryDependencies += "io.monix" %% "monix"         % "3.0.0-RC1"
libraryDependencies += "io.monix" %% "minitest"      % "2.1.1" % Test
libraryDependencies += "io.monix" %% "minitest-laws" % "2.1.1" % Test

testFrameworks += new TestFramework("minitest.runner.Framework")