package com.vtcpro.user.ui.activity.upcoming_trip_detail;

import com.vtcpro.user.base.MvpPresenter;

import java.util.ArrayList;

public interface UpcomingTripDetailsIPresenter<V extends UpcomingTripDetailsIView> extends MvpPresenter<V> {

    void getUpcomingTripDetails(Integer requestId);

    void updateRecurrent(Integer recurrent_id, ArrayList<Integer> repeated);
}
