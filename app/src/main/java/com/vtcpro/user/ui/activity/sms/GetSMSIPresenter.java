package com.vtcpro.user.ui.activity.sms;

import com.vtcpro.user.base.MvpPresenter;

import java.util.Map;

import retrofit2.http.PartMap;

public interface GetSMSIPresenter<V extends GetSMSIView> extends MvpPresenter<V> {

    void requestSMS(@PartMap Map<String, String> params);

}
