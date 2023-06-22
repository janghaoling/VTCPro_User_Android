package com.vtcpro.user.ui.activity.login;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.ForgotResponse;
import com.vtcpro.user.data.network.model.Token;

public interface LoginIView extends MvpView {
    void onSuccess(Token token);

    void onSuccess(ForgotResponse object);

    void onError(Throwable e);
}
