plugins {
    java
    application
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group "org.example"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("Main")
}

javafx {
    modules("javafx.controls", "javafx.fxml", "javafx.graphics")
}

dependencies {
    implementation("one.microstream:microstream-storage-embedded:05.00.02-MS-GA")
}