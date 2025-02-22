package io.github.splitfy

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<SplitfyApplication>().with(TestcontainersConfiguration::class).run(*args)
}
