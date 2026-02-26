package com.abualzahra.child.services

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification

class MyNotificationListener : NotificationListenerService() {
    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        // التقاط الإشعارات الواردة
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {}
}
