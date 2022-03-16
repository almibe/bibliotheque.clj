val scala3Version = "3.1.1"

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "dev.ligature"
ThisBuild / organizationName := "ligature"

val vertxWeb = "io.vertx" % "vertx-web" % "4.1.5"
val vertxWebClient = "io.vertx" % "vertx-web-client" % "4.1.5"
val gson = "com.google.code.gson" % "gson" % "2.8.6"

lazy val root = project
  .in(file("."))
  .settings(
    name := "library-weasel",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M1" % Test
  )

// lazy val ligature = crossProject(JSPlatform, JVMPlatform)
//   .in(file("ligature"))
//   .settings(
//     name := "ligature",
//     scalaVersion := scala3Version,
//     libraryDependencies += "co.fs2" %%% "fs2-core" % "3.2.3",
//     libraryDependencies += "org.scalameta" %%% "munit" % "1.0.0-M1" % Test
//   )

//addCommandAlias("run", "slonky/run")
