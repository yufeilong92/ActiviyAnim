package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mData;

    public ListAdapter(Context mContext, List<String> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder mHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item, null);
            mHolder = new ViewHolder(convertView);
            convertView.setTag(mHolder);
        }else {
            mHolder= (ViewHolder) convertView.getTag();
        }
        mHolder.mTvContent.setText(mData.get(position));
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public TextView mTvContent;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.mTvContent = (TextView) rootView.findViewById(R.id.tv_content);
        }

    }
}
