package com.vtcpro.user.ui.fragment.searching;

import com.vtcpro.user.base.MvpView;

public interface SearchingIView extends MvpView {
    void onSuccess(Object object);

    void onError(Throwable e);
}
