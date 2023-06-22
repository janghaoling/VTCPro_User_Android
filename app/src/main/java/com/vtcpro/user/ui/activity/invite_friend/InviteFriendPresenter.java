package com.vtcpro.user.ui.activity.invite_friend;

import com.vtcpro.user.base.BasePresenter;
import com.vtcpro.user.data.network.APIClient;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class InviteFriendPresenter<V extends InviteFriendIView> extends BasePresenter<V> implements InviteFriendIPresenter<V> {
    @Override
    public void profile() {
        getCompositeDisposable().add(APIClient
                .getAPIClient()
                .profile()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(getMvpView()::onSuccess, getMvpView()::onError));
    }
}
