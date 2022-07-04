package com.FerRodDev

fun main(args: Array<String>) {


    val responses = listOf(
        Response("Request was successfully", Status.Success), Response("Something failed", Status.Error)

    )

    responses.forEach { res ->

        when (res.status) {

            Status.Success -> println(res.message)
            Status.Error -> println(res.message)

        }
    }
}




