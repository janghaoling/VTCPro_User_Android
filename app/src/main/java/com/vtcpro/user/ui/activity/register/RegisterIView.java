package com.vtcpro.user.ui.activity.register;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.RegisterResponse;
import com.vtcpro.user.data.network.model.SettingsResponse;

public interface RegisterIView extends MvpView {

    void onSuccess(SettingsResponse response);

    void onSuccess(RegisterResponse object);

    void onSuccess(Object object);

    void onSuccessPhoneNumber(Object object);

    void onVerifyPhoneNumberError(Throwable e);

    void onError(Throwable e);

    void onVerifyEmailError(Throwable e);

    void onSuccessTermsConditions(Object o);
}
