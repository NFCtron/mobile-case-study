package name.patrikspano.mobilecasestudy

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform