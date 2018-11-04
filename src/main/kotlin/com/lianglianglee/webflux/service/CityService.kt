package com.lianglianglee.webflux.service

import com.lianglianglee.webflux.dao.CityDao
import com.lianglianglee.webflux.entity.CityEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class CityService {
    @Autowired
    private lateinit var cityDao:CityDao


    fun getAll(): Flux<CityEntity> {
        var list=cityDao.findAll()
        //此处应该使用流处理，但是不知道为什么一直报错
        /**
         *
        val flux = Flux.push<CityEntity> { fluxSink ->
        list.stream().collect(data->{fluxSink.next(data) })
        fluxSink.complete()
        }
         */
        val flux = Flux.push<CityEntity> { fluxSink ->
            for (entity in list) {
                fluxSink.next(entity);
            }
            fluxSink.complete()
        }
        return flux
    }


}