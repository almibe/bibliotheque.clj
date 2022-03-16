# Library Weasel
A REPL for working with Library Data.

Library Weasel is a batteries included Scala application that attempts to provide support for working with formats and standards used in libraries or related areas.
This project's goal is to go beyond simply wrapping Java libraries with a Scala api (in fact this project uses some of those) but instead focus on integrating those libraries with a shared api and provide commonly needed functionality.

## Included Features


## Why Scala? / Why the JVM?

Scala has a bit of a reputation for being challenging to learn, and I think there is some truth to that.
However I feel most of that difficulty comes from working on large applications
and from learning how to use pure functional libraries like Cats.
When it comes to running small scripts,
I feel that Scala code looks very similar to many modern programming languages.

The JVM has a large number of software libraries available including many relevant to librarians.
Its dynamic runtime also makes it a good fit for an extensible tool like a REPL.

## How to Use Library Weasel

Library Weasel is still a very new project so,
until I start making releases you will need a local development environment.
This includes having a recent JDK that can be downloaded from https://adoptium.net/.
And also the SBT build tool https://www.scala-sbt.org/.

Once you have those installed the basic commands to work with this project are:

`sbt test` - run all the tests
`sbt run` - run the application

You can also just enter `sbt` to start the sbt shell.
If you do that then you just need to type `test` or `run`.

## Common Tasks

### Opening a MARC File

### Writing a MARC File

### 

## Some History

