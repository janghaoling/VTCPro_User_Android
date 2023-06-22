package com.vtcpro.user.ui.activity.notification_manager;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.NotificationManager;

import java.util.List;

public interface NotificationManagerIView extends MvpView {

    void onSuccess(List<NotificationManager> notificationManager);

    void onError(Throwable e);

}