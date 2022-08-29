plugins {
    kotlin("jvm") version "1.7.10"
    `java-library`
     id("org.jmailen.kotlinter") version "3.11.1"
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")
}
