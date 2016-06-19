package com.example.hppc.kratigyarastogi_resume.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 13-Jun-16.
 */
public class PositionHolder extends RecyclerView.ViewHolder {

    private TextView posTitle, duration, posDescription;

    public PositionHolder(View itemView) {
        super(itemView);

        posTitle = (TextView) itemView.findViewById(R.id.posTitle);
        duration = (TextView) itemView.findViewById(R.id.duration);
        posDescription = (TextView) itemView.findViewById(R.id.posDescription);
    }

    public TextView getPosTitle() {
        return posTitle;
    }

    public TextView getDuration() {
        return duration;
    }

    public TextView getPosDescription() {
        return posDescription;
    }

    public void setDuration(TextView duration) {
        this.duration = duration;
    }

    public void setPosDescription(TextView posDescription) {
        this.posDescription = posDescription;
    }

    public void setPosTitle(TextView posTitle) {
        this.posTitle = posTitle;
    }
}
