package com.github.kentama7.mapstruct.sample

import com.github.pozo.KotlinBuilder
import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

@KotlinBuilder
data class PersonPozo(
    val firstName: String,
    val lastName: String
)

@KotlinBuilder
data class PersonPozoDto(
    val firstName: String,
    val lastName: String
)

@Mapper
interface PersonPozoMapper {
    fun map(dto: PersonPozoDto): PersonPozo
    fun map(person: PersonPozo): PersonPozoDto
}

fun main() {
    val mapper = Mappers.getMapper(PersonPozoMapper::class.java)
    val dto = PersonPozoDto("家康", "徳川")

    val person = mapper.map(dto)
    println(person)

    val personDto = mapper.map(person)
    println(personDto)
}
