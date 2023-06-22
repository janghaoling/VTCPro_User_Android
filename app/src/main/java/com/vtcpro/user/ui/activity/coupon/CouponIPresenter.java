package com.vtcpro.user.ui.activity.coupon;

import com.vtcpro.user.base.MvpPresenter;

public interface CouponIPresenter<V extends CouponIView> extends MvpPresenter<V> {
    void coupon();
}
