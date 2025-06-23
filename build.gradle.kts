version = "1.1.50"
group = "com.github.m9w"

plugins { `maven-publish`; kotlin("jvm") version "2.2.0" }

kotlin { jvmToolchain(21) }

repositories { mavenCentral() }

publishing {
    java.withSourcesJar()

    publications.create<MavenPublication>("maven") {
        from(components["kotlin"])
    }
}
