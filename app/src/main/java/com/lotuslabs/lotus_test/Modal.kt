package com.lotuslabs.lotus_test

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf<Hobby>(
            Hobby("SWIMMING"),
            Hobby("READING"),
            Hobby("RIDING"),
            Hobby("SWIMMING"),
            Hobby("READING"),
            Hobby("RIDING"),
            Hobby("SWIMMING"),
            Hobby("READING"),
            Hobby("RIDING")
    )
}
