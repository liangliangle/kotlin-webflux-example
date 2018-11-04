package com.lianglianglee.webflux

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
class WebfluxExampleApplication

fun main(args: Array<String>) {
    runApplication<WebfluxExampleApplication>(*args)
}
