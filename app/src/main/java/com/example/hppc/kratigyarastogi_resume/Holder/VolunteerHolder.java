package com.example.hppc.kratigyarastogi_resume.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 12-Jun-16.
 */
public class VolunteerHolder extends RecyclerView.ViewHolder {

    private TextView volTitle, time, description;

    public VolunteerHolder(View itemView) {
        super(itemView);

        volTitle = (TextView) itemView.findViewById(R.id.vol_title);
        time = (TextView) itemView.findViewById(R.id.time_period);
        description = (TextView) itemView.findViewById(R.id.vol_desc);
    }

    public TextView getDescription() {
        return description;
    }

    public TextView getTime() {
        return time;
    }

    public TextView getVolTitle() {
        return volTitle;
    }

    public void setTime(TextView time) {
        this.time = time;
    }

    public void setVolTitle(TextView volTitle) {
        this.volTitle = volTitle;
    }

    public void setDescription(TextView description) {
        this.description = description;
    }
}
