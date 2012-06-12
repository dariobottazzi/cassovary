name := "cassovary"

version := "2.0.3-SNAPSHOT"

organization := "com.twitter"

scalaVersion := "2.8.1"

libraryDependencies += "com.twitter" % "ostrich" % "4.8.0"

libraryDependencies += "com.twitter" % "util" % "4.0.1"

libraryDependencies += "com.google.guava" % "guava" % "11.0.2" withSources()

libraryDependencies += "it.unimi.dsi" % "fastutil" % "6.4.4" % "provided"

libraryDependencies += "net.lag" % "configgy" % "2.0.2"

libraryDependencies += "org.mockito" % "mockito-all" % "1.8.5" % "test" withSources()

libraryDependencies += "org.scala-tools.testing" % "specs_2.8.1" % "1.6.6" % "test" withSources()

publishMavenStyle := true

publishTo <<= version { (v: String) =>
  val nexus = "https://oss.sonatype.org/"
  if (v.trim.endsWith("SNAPSHOT")) 
    Some("snapshots" at nexus + "content/repositories/snapshots") 
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>http://twitter.com/cassovary</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
      <comments>A business-friendly OSS license</comments>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:twitter/cassovary.git</url>
    <connection>scm:git:git@github.com:twitter/cassovary.git</connection>
  </scm>
  <developers>
    <developer>
      <id>dong</id>
      <name>Dong Wang</name>
      <url>http://twitter.com/dongwang218</url>
    </developer>
    <developer>
      <id>ajeet</id>
      <name>Ajeet Grewal</name>
      <url>http://twitter.com/ajeet</url>
    </developer>
  </developers>)
