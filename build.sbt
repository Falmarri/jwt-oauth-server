import com.github.retronym.SbtOneJar._

name := "trellisapi"

organization := "com.falmarri"

version := "0.0.1"

scalaVersion := "2.10.3"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

resolvers += "Sonatype OSS" at "http://oss.sonatype.org/content/repositories/snapshots/"

exportJars := true

libraryDependencies ++= Seq(  "com.github.scopt" %% "scopt" % "3.2.0",
                              "io.argonaut" %% "argonaut" % "6.+",
                              "com.twitter" %% "finagle-http" % "6.+",
                              "com.falmarri" %% "scala-uri" % "0.4.2-SNAPSHOT" changing(),
                              "com.falmarri" %% "jwt" % "latest.integration" changing()
                              )
