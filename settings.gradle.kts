plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
}

rootProject.name = "crft-elevated-potential"

//!!include(":dlog")

include(":tripleo.elijah.stateful-processor")

include(":annotation-user")
include(":annotation-processing")

include(":annotations")

// FIXME these depend on elijah apis
//include(":typeinf")
//include(":elijah-compiler-gen")
