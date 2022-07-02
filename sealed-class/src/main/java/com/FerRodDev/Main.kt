package com.FerRodDev

fun main(args: Array<String>) {


    val errorList = listOf(
        Error("Request was successfully", ErrorStatus.Success),
        Error("Something failed", ErrorStatus.InternalServerError)

    )

    errorList.forEach { error ->

        when (error.status) {

            ErrorStatus.Success -> println(error.message)
            ErrorStatus.InternalServerError -> println(error.message)

        }
    }
}




