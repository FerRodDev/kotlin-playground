package com.FerRodDev

data class Error(val message: String, val status: ErrorStatus)

sealed class ErrorStatus() {

    object Success : ErrorStatus()
    object InternalServerError : ErrorStatus()

}