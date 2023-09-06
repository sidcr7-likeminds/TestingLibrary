package com.likeminds.mylibrary

import android.util.Log

object MyLibrary {
    fun init(message: String) {
        Log.d("PUI", message)
    }

    fun newFun(message: String) {
        Log.d("PUI", "newFun $message")
    }

    fun updateFun(message: String) {
        Log.d("PUI", "updateFun $message")
    }
}