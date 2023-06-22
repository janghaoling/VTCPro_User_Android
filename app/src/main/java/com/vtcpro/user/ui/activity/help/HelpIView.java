package com.vtcpro.user.ui.activity.help;

import com.vtcpro.user.base.MvpView;
import com.vtcpro.user.data.network.model.Help;

public interface HelpIView extends MvpView {

    void onSuccess(Help help);

    void onError(Throwable e);
}
