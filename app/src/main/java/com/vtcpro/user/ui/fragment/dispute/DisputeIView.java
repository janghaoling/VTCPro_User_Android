package com.vtcpro.user.ui.fragment.dispute;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.DisputeResponse;
import com.vtcpro.user.data.network.model.Help;

import java.util.List;

public interface DisputeIView extends MvpView {

    void onSuccess(Object object);

    void onSuccessDispute(List<DisputeResponse> responseList);

    void onError(Throwable e);

    void onSuccess(Help help);
}
