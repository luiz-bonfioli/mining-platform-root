rootProject.name = "mining-platform-root"

include(":mining-platform-core")
project(":mining-platform-core").projectDir = file("../mining-platform-core")

include(":mining-platform-organization")
project(":mining-platform-organization").projectDir = file("../mining-platform-organization")