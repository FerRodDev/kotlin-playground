package com.FerRodDev

sealed class Status() {

    object Success : Status()
    object Error : Status()

}