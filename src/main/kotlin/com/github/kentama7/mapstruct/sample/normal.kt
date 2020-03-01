package com.github.kentama7.mapstruct.sample

import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers

data class Person(
    var firstName: String?,
    var lastName: String?
) {
    constructor() : this(null, null)
}

data class PersonDto(
    var firstName: String?,
    var lastName: String?
) {
    constructor() : this(null, null)
}

@Mapper
interface PersonMapper {
    fun map(dto: PersonDto): Person
    fun map(person: Person): PersonDto
}

fun main() {
    val mapper = Mappers.getMapper(PersonMapper::class.java)
    val dto = PersonDto("家康", "徳川")

    val person = mapper.map(dto)
    println(person)

    val personDto = mapper.map(person)
    println(personDto)
}