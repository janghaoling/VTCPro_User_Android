package com.vtcpro.user.ui.fragment.book_ride;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.PromoResponse;


public interface BookRideIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);

    void onSuccessCoupon(PromoResponse promoResponse);
}
