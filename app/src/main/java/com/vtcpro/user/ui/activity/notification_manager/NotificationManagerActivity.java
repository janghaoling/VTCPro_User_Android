package com.vtcpro.user.ui.activity.notification_manager;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.widget.TextView;

import com.vtcpro.user.R;
import com.vtcpro.user.base.BaseActivity;
import com.vtcpro.user.data.network.model.NotificationManager;
import com.vtcpro.user.ui.adapter.NotificationAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NotificationManagerActivity extends BaseActivity implements NotificationManagerIView {

    @BindView(R.id.rvNotificationManager)
    RecyclerView rvNotificationManager;
    @BindView(R.id.txt_notification)
    TextView txt_notification;

    private NotificationManagerPresenter<NotificationManagerActivity> presenter = new NotificationManagerPresenter<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_notification_manager;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        presenter.attachView(this);
        setTitle(getString(R.string.notification_manager));

        presenter.getNotificationManager();
    }

    @Override
    public void onSuccess(List<NotificationManager> managers) {
        rvNotificationManager.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvNotificationManager.setAdapter(new NotificationAdapter(managers));
        txt_notification.setVisibility(managers.size() > 0 ? View.GONE : View.VISIBLE);
    }

    @Override
    public void onError(Throwable e) {
        handleError(e);
    }

    @Override
    protected void onDestroy() {
        presenter.onDetach();
        super.onDestroy();
    }
}
