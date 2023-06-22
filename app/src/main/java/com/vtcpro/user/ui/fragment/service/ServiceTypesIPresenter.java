package com.vtcpro.user.ui.fragment.service;

import com.vtcpro.user.base.MvpPresenter;
import com.vtcpro.user.data.network.model.Datum;

import java.util.HashMap;

public interface ServiceTypesIPresenter<V extends ServiceTypesIView> extends MvpPresenter<V> {

    void services();

    void rideNow(HashMap<String, Object> obj);

    void checkPoiPriceLogic(HashMap<String, Object> obj);

    void checkPoiDistanceInfo(HashMap<String, Object> obj);

    void getServiceType(HashMap<String, Object> obj);

}
