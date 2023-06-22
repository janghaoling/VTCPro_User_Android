package com.vtcpro.user.ui.activity.coupon;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.PromoResponse;

public interface CouponIView extends MvpView {
    void onSuccess(PromoResponse object);

    void onError(Throwable e);
}
