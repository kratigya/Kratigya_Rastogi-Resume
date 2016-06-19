package com.example.hppc.kratigyarastogi_resume.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.R;
import com.example.hppc.kratigyarastogi_resume.Holder.VolunteerHolder;

/**
 * Created by hppc on 12-Jun-16.
 */
public class VolunteerAdapter extends RecyclerView.Adapter {

    String[] title = {"Mess Worker Education Programme (MWEP)"};
    String[] time_period = {"August, 2015 - May, 2016"};
    String[] description = {"Responsible for teaching a subject to mess workers " +
            "and developing curriculum as a member of vigilance team"};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.volunteer, parent, false);
        return new VolunteerHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        VolunteerHolder volunteerHolder = (VolunteerHolder) holder;
        volunteerHolder.getVolTitle().setText(title[position]);
        volunteerHolder.getTime().setText(time_period[position]);
        volunteerHolder.getDescription().setText(description[position]);
    }

    @Override
    public int getItemCount() {
        return title.length;
    }
}