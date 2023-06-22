package com.vtcpro.user.ui.activity.upcoming_trip_detail;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.Datum;

import java.util.List;

public interface UpcomingTripDetailsIView extends MvpView {

    void onSuccess(List<Datum> upcomingTripDetails);

    void onSuccess(Object o);

    void onError(Throwable e);
}
