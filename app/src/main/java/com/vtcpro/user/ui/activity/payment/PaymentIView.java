package com.vtcpro.user.ui.activity.payment;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.BrainTreeResponse;
import com.vtcpro.user.data.network.model.Card;
import com.vtcpro.user.data.network.model.CheckSumData;

import java.util.List;

public interface PaymentIView extends MvpView {

    void onSuccess(Object card);

    void onSuccess(BrainTreeResponse response);

    void onSuccess(List<Card> cards);

    void onAddCardSuccess(Object cards);

    void onError(Throwable e);

    void onPayumoneyCheckSumSucess(CheckSumData checkSumData);

}
