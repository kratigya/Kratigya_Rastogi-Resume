package com.example.hppc.kratigyarastogi_resume.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 12-Jun-16.
 */
public class AchievementHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public AchievementHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.achText);
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
