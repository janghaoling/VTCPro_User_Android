package com.vtcpro.user.ui.fragment.schedule;

import com.vtcpro.user.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface ScheduleIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);
}
