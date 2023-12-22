plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("com.google.code.findbugs:jsr305:3.0.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
    testImplementation("org.easymock:easymock:5.1.0")
}

application {
    mainClass = "easymock.App"
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "easymock.App"
        )
    }
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}
