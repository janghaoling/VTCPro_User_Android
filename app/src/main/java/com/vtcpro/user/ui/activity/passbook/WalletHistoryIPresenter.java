package com.vtcpro.user.ui.activity.passbook;

import com.vtcpro.user.base.MvpPresenter;

public interface WalletHistoryIPresenter<V extends WalletHistoryIView> extends MvpPresenter<V> {
    void wallet();
}
