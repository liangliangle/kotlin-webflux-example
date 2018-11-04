package com.lianglianglee.webflux.web

import com.lianglianglee.webflux.service.CityService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import reactor.core.publisher.Mono

@Controller
@RequestMapping("/")
class CityController {
    @Autowired
    private lateinit var cityService: CityService


    @GetMapping()
    fun getAll(model:Model): Mono<String> {
         var list=cityService.getAll()
        model.addAttribute("list",list)
        return Mono.create { monoSink -> monoSink.success("cityList") }
    }
}