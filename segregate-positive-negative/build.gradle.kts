plugins {
    kotlin("jvm") version "1.7.20"
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")

}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

