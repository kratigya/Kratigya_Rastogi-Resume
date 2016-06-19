package com.example.hppc.kratigyarastogi_resume.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.R;
import com.example.hppc.kratigyarastogi_resume.Holder.SkillHolder;

/**
 * Created by hppc on 11-Jun-16.
 */
public class SkillAdapter extends RecyclerView.Adapter {

    String[] skill = {"Android Development", "XML", "JSON", "REST API", "Eclipse (IDE)", "Android Studio (IDE)",
            "Java", "C Programming", "C#", "Python", "HTML", "CSS", "Linux", "Data Structures", "Algorithms"};
    float[] rating = {3, 3, 2, 2, 4, 4, 3, 3, 2, 2, 1, 1, 3, 3, 3};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.skills, parent, false);
        return new SkillHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        SkillHolder skillHolder = (SkillHolder) holder;
        skillHolder.getSkill().setText(skill[position]);
        skillHolder.getRatingBar().setRating(rating[position]);

    }

    @Override
    public int getItemCount() {
        return skill.length;
    }
}
