package com.example.hppc.kratigyarastogi_resume.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 11-Jun-16.
 */
public class SkillHolder extends RecyclerView.ViewHolder {

    private TextView skill;
    private RatingBar ratingBar;

    public SkillHolder(View itemView) {
        super(itemView);

        skill = (TextView) itemView.findViewById(R.id.skillText);
        ratingBar = (RatingBar) itemView.findViewById(R.id.skillRatingBar);
    }

    public RatingBar getRatingBar() {
        return ratingBar;
    }

    public TextView getSkill() {
        return skill;
    }

    public void setRatingBar(RatingBar ratingBar) {
        this.ratingBar = ratingBar;
    }

    public void setSkill(TextView skill) {
        this.skill = skill;
    }
}
