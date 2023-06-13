plugins {
    kotlin("jvm") version "1.8.21"
    application
}

group = "kr.dragon.dreaming"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(14)
}

application {
    mainClass.set("MainKt")
}