package com.vtcpro.user.ui.activity.add_card;

import com.vtcpro.user.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
interface AddCardIPresenter<V extends AddCardIView> extends MvpPresenter<V> {
    void card(String stripeToken);
}
