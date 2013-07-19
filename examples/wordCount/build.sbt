name := "ScoobiWordCount"

version := "1.0"

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-deprecation")

<<<<<<< HEAD
libraryDependencies += "com.nicta" %% "scoobi" % "0.6.0-cdh3-SNAPSHOT"

resolvers ++= Seq("cloudera" at "https://repository.cloudera.com/content/repositories/releases",
                  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots")
=======
libraryDependencies ++= Seq("com.nicta" %% "scoobi" % "0.7.0-cdh4")

resolvers ++= Seq("sonatype releases" at "http://oss.sonatype.org/content/repositories/releases",
                  "sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "cloudera" at "https://repository.cloudera.com/content/repositories/releases")
>>>>>>> a94af430886a1a2105157b7102b66d077b874514
