package com.vtcpro.user.ui.activity.sms;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.ResponseSMS;

public interface GetSMSIView extends MvpView {

    void onSuccess(ResponseSMS result);

    void onError(Throwable e);

}
