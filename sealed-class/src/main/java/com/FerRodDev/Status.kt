package com.FerRodDev

data class Response(val message: String, val status: Status)

sealed class Status() {

    object Success : Status()
    object Error : Status()

}