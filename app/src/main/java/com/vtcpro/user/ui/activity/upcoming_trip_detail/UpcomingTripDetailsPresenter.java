package com.vtcpro.user.ui.activity.upcoming_trip_detail;

import com.vtcpro.user.base.BasePresenter;
import com.vtcpro.user.data.network.APIClient;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class UpcomingTripDetailsPresenter<V extends UpcomingTripDetailsIView> extends BasePresenter<V>
        implements UpcomingTripDetailsIPresenter<V> {

    @Override
    public void getUpcomingTripDetails(Integer requestId) {

        getCompositeDisposable().add(APIClient.getAPIClient().upcomingTripDetails(requestId)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(data -> getMvpView().onSuccess(data),
                        throwable -> getMvpView().onError(throwable)));
    }

    @Override
    public void updateRecurrent(Integer recurrent_id, ArrayList<Integer> repeated) {

        getCompositeDisposable().add(APIClient.getAPIClient().updateRecurrent(recurrent_id, repeated)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(data -> getMvpView().onSuccess(data),
                        throwable -> getMvpView().onError(throwable)));
    }
}
