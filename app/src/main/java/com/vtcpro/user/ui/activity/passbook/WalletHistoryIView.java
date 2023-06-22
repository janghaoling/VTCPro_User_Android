package com.vtcpro.user.ui.activity.passbook;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.WalletResponse;

public interface WalletHistoryIView extends MvpView {
    void onSuccess(WalletResponse response);

    void onError(Throwable e);
}
