# CreateTypographyFromFontName

## Installation

settings.gradle.kts
```diff
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        ...

+       maven { url = uri("https://jitpack.io") }
    }
}
```

app/build.gradle.kts
```diff
dependencies {
    ...

+   implementation("com.github.yu-ko-ba:CreateTypographyFromFontName:0.0.1")
}
```

## Example

[ui/theme/Type.kt](https://github.com/yu-ko-ba/CreateTypographyFromFontName/blob/main/app/src/main/java/io/github/yukoba/createtypographyfromfontname/ui/theme/Type.kt)
```kotlin
import io.github.yukoba.createtypographyfromfontname.createTypographyFromFontName

val Typography = createTypographyFromFontName(fontName = "Yomogi")
```
