package com.vtcpro.user.ui.activity.sms;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.ResponseSMS;

public interface VerifySMSIView extends MvpView {

    void onSuccess(ResponseSMS result);

    void onError(Throwable e);

}
