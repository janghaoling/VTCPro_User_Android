package com.vtcpro.user.ui.activity.sms;


import com.vtcpro.user.base.MvpPresenter;

import java.util.Map;

import retrofit2.http.PartMap;

public interface VerifySMSIPresenter<V extends VerifySMSIView> extends MvpPresenter<V> {

    void verifySMS(@PartMap Map<String, String> params);

}
