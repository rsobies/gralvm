to reproduce the bug just run ./gradlew bootBuildImage
if you want to change native options go to build.gradle.kts and find section tasks.getByName<BootBuildImage>("bootBuildImage")
