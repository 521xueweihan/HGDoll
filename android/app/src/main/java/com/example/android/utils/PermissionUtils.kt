package com.example.android.utils

import android.content.Context

object PermissionUtils {
    private const val TAG = "PermissionUtils"

    fun hasAllPermissions(context: Context): Boolean {
        return true
    }


    fun getPermissionMessage(context: Context): String {
        return "所有权限已获取"
    }
} 