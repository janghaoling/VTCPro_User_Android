package com.vtcpro.user.ui.activity.invite_friend;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.User;

public interface InviteFriendIView extends MvpView {

    void onSuccess(User user);

    void onError(Throwable e);

}
