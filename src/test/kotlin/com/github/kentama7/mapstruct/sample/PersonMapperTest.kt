package com.github.kentama7.mapstruct.sample

import org.junit.Test
import org.mapstruct.factory.Mappers
import kotlin.test.assertEquals

class PersonMapperTest {
    private val mapper = Mappers.getMapper(PersonMapper::class.java)

    @Test
    fun map() {
        val result = mapper.map(PersonDto("家康", "徳川"))
        assertEquals(Person("家康", "徳川"), result)
    }

    @Test
    fun inverse() {
        val result = mapper.map(Person("家康", "徳川"))
        assertEquals(PersonDto("家康", "徳川"), result)
    }
}