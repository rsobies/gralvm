package com.gralvm.gralvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class GralvmApplication

fun main(args: Array<String>) {
	runApplication<GralvmApplication>(*args)
}


@RestController
class Tmp {

	@GetMapping("/")
	fun index(): String {
		return "Hello World"
	}
}