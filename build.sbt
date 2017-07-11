
lazy val demo =
  project
    .in(file("."))
    .enablePlugins(ScalaJSPlugin)
    .settings(
      name := "example",
      organization := "demo",
      scalaVersion := "2.12.2",
      scalacOptions := Seq("-feature", "-language:_", "-deprecation"),
      scalaJSUseMainModuleInitializer in Global := true,
      scalaJSModuleKind := ModuleKind.CommonJSModule,
      skip in packageJSDependencies := false
    )
