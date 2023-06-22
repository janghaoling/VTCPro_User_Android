package com.vtcpro.user.common;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

import com.vtcpro.user.R;


public class CustomDialog extends Dialog {

    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setCancelable(false);
    }
}