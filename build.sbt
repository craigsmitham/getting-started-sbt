name := "Introduction"

version := "1.0"

scalaVersion := "2.11.0"

resolvers ++= Seq(
	"snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
	"releases" at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++= Seq("org.specs2" %% "specs2" % "1.12.3" % "test")