name := "PageRank"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= 
  Seq("com.nicta" %% "scoobi" % "0.7.0-cdh4") 

<<<<<<< HEAD
libraryDependencies += "com.nicta" %% "scoobi" % "0.6.0-cdh3-SNAPSHOT"
=======
scalacOptions ++= Seq("-deprecation")
>>>>>>> a94af430886a1a2105157b7102b66d077b874514

resolvers ++= Seq("sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "cloudera" at "https://repository.cloudera.com/content/repositories/releases")
