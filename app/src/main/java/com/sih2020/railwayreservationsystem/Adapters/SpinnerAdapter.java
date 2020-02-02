package com.sih2020.railwayreservationsystem.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import com.sih2020.railwayreservationsystem.Models.SpinnerModel;
import com.sih2020.railwayreservationsystem.R;

import java.util.List;

public class SpinnerAdapter extends ArrayAdapter<SpinnerModel> {
    private Context mContext;
    private List<SpinnerModel> mList;
    private LayoutInflater mInflater;

    public SpinnerAdapter(Activity activity, @NonNull Context context, @NonNull List<SpinnerModel> objects) {
        super(context, 1, objects);
        mContext = context;
        mList = objects;
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {
        View row = mInflater.inflate(R.layout.layout_spinner, parent, false);
        TextView mFull = row.findViewById(R.id.full);
        TextView mAbb = row.findViewById(R.id.card_tv);

        mFull.setText(mList.get(position).getmFullForm());
        mAbb.setText(mList.get(position).getmAbbreviation());
        return row;
    }
}