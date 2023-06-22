package com.vtcpro.user.ui.activity.past_trip_detail;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.Datum;

import java.util.List;

public interface PastTripDetailsIView extends MvpView {

    void onSuccess(List<Datum> pastTripDetails);

    void onError(Throwable e);
}
