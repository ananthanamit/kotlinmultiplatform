package org.exchangeapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform