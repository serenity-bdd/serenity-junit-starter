# Serenity Cucumber Starter project


This is the simplest possible build script setup for Serenity BDD using Java. 

This is a very minimal sample project using Cucumber and Serenity BDD in Java. 
You can use this project as a quick starting point for your own projects.

There is a single feature file with one scenario. The scenario has three steps, the last of which is pending. 

## Get the code

Git:

    git clone https://github.com/serenity-bdd/serenity-junit-starter.git
    cd serenity-junit-starter


Or simply [download a zip](https://github.com/serenity-bdd/serenity-junit-starter/archive/master.zip) file.

## Use Maven

Open a command window and run:

    mvn clean verify

## Use Gradle

Open a command window and run:

    gradlew test 


## Viewing the reports

Both of the commands provided above will produce a Serenity test report in the `target/site/serenity` directory. Go take a look!

