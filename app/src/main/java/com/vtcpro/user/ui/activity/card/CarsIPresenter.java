package com.vtcpro.user.ui.activity.card;

import com.vtcpro.user.base.MvpPresenter;


public interface CarsIPresenter<V extends CardsIView> extends MvpPresenter<V> {
    void card();
}
