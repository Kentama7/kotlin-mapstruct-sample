package com.github.kentama7.mapstruct.sample

import org.junit.Test
import org.mapstruct.factory.Mappers
import kotlin.test.assertEquals

class PersonPozoMapperTest {
    private val mapper = Mappers.getMapper(PersonPozoMapper::class.java)

    @Test
    fun map() {
        val result = mapper.map(PersonPozoDto("家康", "徳川"))
        assertEquals(PersonPozo("家康", "徳川"), result)
    }

    @Test
    fun inverse() {
        val result = mapper.map(PersonPozo("家康", "徳川"))
        assertEquals(PersonPozoDto("家康", "徳川"), result)
    }
}