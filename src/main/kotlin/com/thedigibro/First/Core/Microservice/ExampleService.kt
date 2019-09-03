package com.thedigibro.First.Core.Microservice
import org.springframework.stereotype.Service
@Service
class ExampleService {
    fun getHello(name:String)="Hello $name from Thedigibro"
}