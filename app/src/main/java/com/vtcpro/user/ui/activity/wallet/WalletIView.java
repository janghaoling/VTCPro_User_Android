package com.vtcpro.user.ui.activity.wallet;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.AddWallet;
import com.vtcpro.user.data.network.model.BrainTreeResponse;

public interface WalletIView extends MvpView {
    void onSuccess(AddWallet object);

    void onSuccess(BrainTreeResponse response);

    void onError(Throwable e);
}
