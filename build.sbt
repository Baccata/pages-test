enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.8"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
mainClass := Some("tutorial.webapp.Tutorial")
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"

