package com.vtcpro.user.ui.fragment.cancel_ride;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.CancelResponse;

import java.util.List;

public interface CancelRideIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);

    void onSuccess(List<CancelResponse> response);

    void onReasonError(Throwable e);
}
