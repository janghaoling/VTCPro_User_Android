package com.vtcpro.user.ui.activity.setting;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.AddressResponse;

public interface SettingsIView extends MvpView {

    void onSuccessAddress(Object object);

    void onLanguageChanged(Object object);

    void onSuccess(AddressResponse address);

    void onError(Throwable e);
}
