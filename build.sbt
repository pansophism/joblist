name := "jobList"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.18",
  "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final",
  "com.google.inject" % "guice" % "3.0",
  "com.google.guava" % "guava" % "17.0"
)

play.Project.playJavaSettings
