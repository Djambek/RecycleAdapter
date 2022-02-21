package com.example.recycleview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ResultAdapter extends BaseAdapter {
    int[] digitals;
    Context context;

    ResultAdapter(Context context, int[] digitals){
        this.context = context;
        this.digitals = digitals;
    }
    class ViewHolder{
        public TextView textView;
        ViewHolder(TextView textView){
            this.textView = textView;

        }
    }

    @Override
    public int getCount() {
        return digitals.length;
    }

    @Override
    public Object getItem(int i) {
        return digitals[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view_ = view;
        if (view_ == null){
            view_ = LayoutInflater.from(context).inflate(R.layout.adapterview, null);
            ViewHolder viewHolder = new ViewHolder(view_.findViewById(R.id.textView));
            view_.setTag(viewHolder);
        }

        TextView textView = ((ViewHolder) view_.getTag() ).textView;
        textView.setText(digitals[i]+"");
        if ((digitals[i] + "").contains("3")){
            textView.setTextColor(Color.RED);
        }else{
            textView.setTextColor(Color.BLACK);
        }
        return view_;

    }
}
