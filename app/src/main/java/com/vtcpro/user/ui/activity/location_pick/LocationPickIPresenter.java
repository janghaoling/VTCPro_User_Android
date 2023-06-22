package com.vtcpro.user.ui.activity.location_pick;

import com.vtcpro.user.base.MvpPresenter;

public interface LocationPickIPresenter<V extends LocationPickIView> extends MvpPresenter<V> {
    void address();
}
