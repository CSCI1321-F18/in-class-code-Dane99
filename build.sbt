name := "InClass"
version := "1.0"
scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.5.8",
	"com.typesafe.akka" %% "akka-testkit" % "2.5.8" % Test,
	"org.scala-lang.modules" %% "scala-xml" % "1.0.6",
	"org.scalafx" %% "scalafx" % "8.0.144-R12",
	"com.novocode" % "junit-interface" % "0.11" % Test,
	"org.scalactic" %% "scalactic" % "3.0.4",
	"org.scalatest" %% "scalatest" % "3.0.4" % "test"
)


