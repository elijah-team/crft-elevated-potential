plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"

//    id("com.huanshankeji.maven-publish-conventions") version "0.5.1"
//    `maven-publish`
}

rootProject.name = "crft-elevated-potential"

//!!include(":dlog")

//include(":tripleo.elijah.stateful-processor") // !!

include(":annotation-user")
include(":annotation-processing")
include(":annotations")

// FIXME these depend on elijah apis
//include(":typeinf")
//include(":elijah-compiler-gen")

//toolchainManagement {
//    jvm {
//        javaRepositories {
//            repository("foojay") {
//                resolverClass.set(org.gradle.toolchains.foojay.FoojayToolchainResolver::class.java)
//            }
//        }
//    }
//}
