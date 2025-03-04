package io.github.splitfy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SplitfyApplication

fun main(args: Array<String>) {
	runApplication<SplitfyApplication>(*args)
}
