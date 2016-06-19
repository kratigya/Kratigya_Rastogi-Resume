package com.example.hppc.kratigyarastogi_resume.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 11-Jun-16.
 */
public class ProjectHolder extends RecyclerView.ViewHolder {

    private TextView title, date, description, team;

    public ProjectHolder(View itemView) {
        super(itemView);

        title = (TextView) itemView.findViewById(R.id.projTitle);
        date = (TextView) itemView.findViewById(R.id.projDate);
        description = (TextView) itemView.findViewById(R.id.projDescription);
        team = (TextView) itemView.findViewById(R.id.projTeam);
    }

    public TextView getDate() {
        return date;
    }

    public TextView getDescription() {
        return description;
    }

    public TextView getTeam() {
        return team;
    }

    public TextView getTitle() {
        return title;
    }

    public void setDate(TextView date) {
        this.date = date;
    }

    public void setDescription(TextView description) {
        this.description = description;
    }

    public void setTeam(TextView team) {
        this.team = team;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }
}
