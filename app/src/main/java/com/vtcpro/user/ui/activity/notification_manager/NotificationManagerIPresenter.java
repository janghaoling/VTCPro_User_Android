package com.vtcpro.user.ui.activity.notification_manager;

import com.vtcpro.user.base.MvpPresenter;

public interface NotificationManagerIPresenter<V extends NotificationManagerIView> extends MvpPresenter<V> {
    void getNotificationManager();
}
