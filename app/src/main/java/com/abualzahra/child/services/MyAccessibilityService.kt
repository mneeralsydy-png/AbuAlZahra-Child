package com.abualzahra.child.services

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class MyAccessibilityService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // هنا سيتم التقاط أحداث الشاشة لاحقاً
    }

    override fun onInterrupt() {}
}
