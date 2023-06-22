package com.vtcpro.user.ui.activity.sms;

import com.vtcpro.user.base.BasePresenter;
import com.vtcpro.user.data.network.APIClient;

import java.util.Map;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class GetSMSPresenter<V extends GetSMSIView> extends BasePresenter<V> implements GetSMSIPresenter<V> {

    @Override
    public void requestSMS(Map<String, String> params) {
        getCompositeDisposable().add(
                APIClient
                        .getAPIClient()
                        .requestSMS(params)
                        .subscribeOn(Schedulers.computation())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(getMvpView()::onSuccess, getMvpView()::onError));
    }

}
