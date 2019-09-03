package com.thedigibro.First.Core.Microservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FirstCoreMicroserviceApplication

fun main(args: Array<String>) {
	runApplication<FirstCoreMicroserviceApplication>(*args)
}
