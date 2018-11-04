package com.lianglianglee.webflux.entity


data class CityEntity(var id: Long?=0L,
                      var name: String = "",
                      var privinceId: Long = 0L,
                      var description:String =""){

}

