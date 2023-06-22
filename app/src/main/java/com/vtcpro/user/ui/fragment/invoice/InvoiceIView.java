package com.vtcpro.user.ui.fragment.invoice;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.BrainTreeResponse;
import com.vtcpro.user.data.network.model.CheckSumData;
import com.vtcpro.user.data.network.model.Message;

public interface InvoiceIView extends MvpView {
    void onSuccess(Message message);

    void onSuccess(Object o);

    void onSuccessPayment(Object o);

    void onError(Throwable e);

    void onSuccess(BrainTreeResponse response);

    void onPayumoneyCheckSumSucess(CheckSumData checkSumData);
}
