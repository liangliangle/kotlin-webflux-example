package com.lianglianglee.webflux.dao

import com.lianglianglee.webflux.entity.CityEntity
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface CityDao {
    @Select("select id,name,privince_id,description from city ")
    fun findAll(): List<CityEntity>

    @Select("insert  into city (name,privince_id,description ) values (#{name},#{privince_id},#{description})")
    fun insert(entity: CityEntity): Int

}