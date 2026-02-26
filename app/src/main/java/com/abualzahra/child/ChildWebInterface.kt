package com.abualzahra.child

import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.webkit.JavascriptInterface
import android.widget.Toast

class ChildWebInterface(private val mContext: Context) {

    @JavascriptInterface
    fun showToast(message: String) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show()
    }

    @JavascriptInterface
    fun openAccessibilitySettings() {
        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        mContext.startActivity(intent)
    }

    @JavascriptInterface
    fun openUsageSettings() {
        val intent = Intent(Settings.ACTION_USAGE_ACCESS_SETTINGS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        mContext.startActivity(intent)
    }

    @JavascriptInterface
    fun openLocationSettings() {
        val intent = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        mContext.startActivity(intent)
    }

    @JavascriptInterface
    fun openOverlaySettings() {
        val intent = Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        mContext.startActivity(intent)
    }

    @JavascriptInterface
    fun linkDevice(code: String) {
        // هنا سيتم لاحقاً إرسال الكود للـ Backend للتحقق منه
        Toast.makeText(mContext, "جاري التحقق من الكود: $code", Toast.LENGTH_LONG).show()
    }

    @JavascriptInterface
    fun startServices() {
        // بدء خدمات المراقبة (سيتم تنفيذها لاحقاً)
    }

    @JavascriptInterface
    fun hideAppIcon() {
        // إخفاء الأيقونة (يتطلب صلاحية Device Owner أو إعدادات خاصة)
        // مؤقتاً سنكتفي بنقل التطبيق للخلفية
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        mContext.startActivity(intent)
    }
}
