package com.vtcpro.user.ui.activity.past_trip_detail;

import com.vtcpro.user.base.MvpPresenter;

public interface PastTripDetailsIPresenter<V extends PastTripDetailsIView> extends MvpPresenter<V> {

    void getPastTripDetails(Integer requestId);
}
