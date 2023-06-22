package com.vtcpro.user.ui.activity.main;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.AddressResponse;
import com.vtcpro.user.data.network.model.Advertisement;
import com.vtcpro.user.data.network.model.DataResponse;
import com.vtcpro.user.data.network.model.Datum;
import com.vtcpro.user.data.network.model.Provider;
import com.vtcpro.user.data.network.model.SettingsResponse;
import com.vtcpro.user.data.network.model.User;

import java.util.List;

public interface MainIView extends MvpView {

    void onSuccess(User user);

    void onSuccess(DataResponse dataResponse);

    void onDestinationSuccess(Object object);

    void onSuccessLogout(Object object);

    void onSuccess(AddressResponse response);

    void onSuccess(List<Provider> objects);

    void onError(Throwable e);

    void onSuccess(SettingsResponse response);

    void onSettingError(Throwable e);

    void onAdsSuccess(List<Advertisement> array);

    void onSuccessDrivingZone(Datum datum);


}
