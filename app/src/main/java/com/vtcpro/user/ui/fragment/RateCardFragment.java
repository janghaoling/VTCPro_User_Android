package com.vtcpro.user.ui.fragment;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.vtcpro.user.R;
import com.vtcpro.user.base.BaseFragment;
import com.vtcpro.user.common.Constants;
import com.vtcpro.user.data.SharedHelper;
import com.vtcpro.user.data.network.model.Service;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class RateCardFragment extends BaseFragment {

    public static Service SERVICE = new Service();
    @BindView(R.id.image)
    ImageView image;
    @BindView(R.id.capacity)
    TextView capacity;
    @BindView(R.id.base_fare)
    TextView baseFare;
    @BindView(R.id.fare_type)
    TextView fareType;
    @BindView(R.id.fare_km)
    TextView fareKm;
    @BindView(R.id.tvFareDistance)
    TextView tvFareDistance;
    @BindView(R.id.luggage_capacity)
    TextView luggage_capacity;
    Unbinder unbinder;

    public static String base_price = "";
    public static String tax_price = "";

    public RateCardFragment() {
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_rate_card;
    }

    @Override
    public View initView(View view) {
        unbinder = ButterKnife.bind(this, view);
        initView(SERVICE);
        return view;
    }

    @SuppressLint("SetTextI18n")
    void initView(@NonNull Service service) {
        Log.d("111111111111111", "Service prices:::::" + base_price + ":::" + tax_price);
        capacity.setText(String.valueOf(service.getCapacity()));
//        baseFare.setText(getNewNumberFormat(service.getFixed()));
//        fareKm.setText(getNewNumberFormat(service.getPrice()));
        baseFare.setText(getNewNumberFormat(Double.parseDouble(base_price)));
        fareKm.setText(getNewNumberFormat(Double.parseDouble(tax_price)));

        luggage_capacity.setText(String.valueOf(service.getLuggage_capacity()));
//        baseFare.setText(SharedHelper.getKey(Objects.requireNonNull(getContext()), "currency") + " " +
//                getNewNumberFormat(service.getFixed()));
//        fareKm.setText(SharedHelper.getKey(getContext(), "currency") + " " +
//                getNewNumberFormat(service.getPrice()));

        //      MIN,    HOUR,   DISTANCE,   DISTANCEMIN,    DISTANCEHOUR
        switch (service.getCalculator()) {
            case Constants.InvoiceFare.MINUTE:
                fareType.setText(getString(R.string.min));
                break;
            case Constants.InvoiceFare.HOUR:
                fareType.setText(getString(R.string.hour));
                break;
            case Constants.InvoiceFare.DISTANCE:
                fareType.setText(getString(R.string.distance));
                break;
            case Constants.InvoiceFare.DISTANCE_MIN:
                fareType.setText(getString(R.string.distancemin));
                break;
            case Constants.InvoiceFare.DISTANCE_HOUR:
                fareType.setText(getString(R.string.distancehour));
                break;
            default:
                fareType.setText(getString(R.string.min));
                break;
        }

        if (SharedHelper.getKey(getContext(), "measurementType").equalsIgnoreCase(Constants.MeasurementType.KM))
            tvFareDistance.setText(getString(R.string.fare_km));
        else tvFareDistance.setText(getString(R.string.fare_miles));

        YoYo.with(Techniques.BounceInRight)
                .duration(1000)
                .pivot(YoYo.CENTER_PIVOT, YoYo.CENTER_PIVOT)
                .interpolate(new AccelerateDecelerateInterpolator())
                .playOn(image);
        Glide.with(baseActivity())
                .load(service.getImage())
                .apply(RequestOptions
                        .placeholderOf(R.drawable.ic_car)
                        .dontAnimate()
                        .error(R.drawable.ic_car))
                .into(image);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @OnClick(R.id.done)
    public void onViewClicked() {
        getActivity().getSupportFragmentManager().popBackStack();
    }
}
