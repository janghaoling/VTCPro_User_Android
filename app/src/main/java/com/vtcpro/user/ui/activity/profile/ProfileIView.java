package com.vtcpro.user.ui.activity.profile;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.User;

public interface ProfileIView extends MvpView {

    void onSuccess(User user);

    void onUpdateSuccess(User user);

    void onError(Throwable e);

    void onSuccessPhoneNumber(Object object);

    void onVerifyPhoneNumberError(Throwable e);
}
