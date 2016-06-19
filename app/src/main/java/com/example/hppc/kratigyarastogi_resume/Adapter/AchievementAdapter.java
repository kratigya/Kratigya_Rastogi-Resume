package com.example.hppc.kratigyarastogi_resume.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.Holder.AchievementHolder;
import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 12-Jun-16.
 */
public class AchievementAdapter extends RecyclerView.Adapter {

    private String[] arr = {"Scholarship worth INR 25000 under Merit Scholarship Programme at The LNM Institute of Information Technology",
            "AIR 93 in 7th National Cyber Olympiad",
            "AIR 242 in 8th National Cyber Olympiad",
            "Olympiad Rank 733 in International Informatics Olympiad - 2008",
            "Olympiad Rank 48 in International Informatics Olympiad - 2009"};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.achievement, parent, false);
        return new AchievementHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        AchievementHolder achievementHolder = (AchievementHolder) holder;
        achievementHolder.getTextView().setText(arr[position]);
    }

    @Override
    public int getItemCount() {
        return arr.length;
    }
}