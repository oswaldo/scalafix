addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.23")
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "2.0.0-RC3-3")
(Compile / unmanagedSources) += baseDirectory.value / ".." / "Dependencies.scala"
