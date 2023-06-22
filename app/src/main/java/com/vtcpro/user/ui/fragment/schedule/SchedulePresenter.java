package com.vtcpro.user.ui.fragment.schedule;

import com.vtcpro.user.base.BasePresenter;
import com.vtcpro.user.data.network.APIClient;

import java.util.ArrayList;
import java.util.HashMap;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class SchedulePresenter<V extends ScheduleIView> extends BasePresenter<V> implements ScheduleIPresenter<V> {

    @Override
    public void sendRequest(HashMap<String, Object> obj) {

        getCompositeDisposable().add(APIClient.getAPIClient()
//                .sendRequest(obj)
                .sendRequests(obj)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(sendReqResponse -> getMvpView().onSuccess(sendReqResponse),
                        throwable -> getMvpView().onError(throwable)));
    }

    @Override
    public void sendRequest(HashMap<String, Object> obj, ArrayList<Integer> repeat) {
        getCompositeDisposable().add(APIClient.getAPIClient()
//                .sendRequest(obj, repeat)
                .sendRequests(obj, repeat)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(sendReqResponse -> getMvpView().onSuccess(sendReqResponse),
                        throwable -> getMvpView().onError(throwable)));
    }
}
