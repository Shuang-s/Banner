package com.example.banner;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * name:高爽
 * date:2017/6/22.
 * desc:
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<Data.DataBean.InfosBean.BannersBean> list;
    private final int TYPE0 = 0;
    private final int TYPE1 = 1;

    public MyAdapter(Context context, List<Data.DataBean.InfosBean.BannersBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getPic().startsWith("http") ? TYPE1 : TYPE0;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        int type = getItemViewType(position);
        if (convertView == null) {
            holder=new ViewHolder();
            if (type == TYPE0) {
                convertView = View.inflate(context, R.layout.item0, null);
            }
            if (type == TYPE1) {
                convertView = View.inflate(context, R.layout.item1, null);
                holder.image = (ImageView) convertView.findViewById(R.id.image);
            }
            holder.tvtitle = (TextView) convertView.findViewById(R.id.tvtitle);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Data.DataBean.InfosBean.BannersBean bean = list.get(position);
        holder.tvtitle.setText(bean.getTarget_title());
        if (type == TYPE1) {
            Glide.with(context).load(bean.getPic()).into(holder.image);
        }
        return convertView;
    }

    class ViewHolder {
        TextView tvtitle;
        ImageView image;
    }
}
