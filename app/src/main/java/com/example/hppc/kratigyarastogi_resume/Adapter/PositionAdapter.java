package com.example.hppc.kratigyarastogi_resume.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.Holder.PositionHolder;
import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 13-Jun-16.
 */
public class PositionAdapter extends RecyclerView.Adapter {

    String[] pTitle = {"Coordinator - Art Club", "UG Teaching Assistant in C Programming Lab",
            "Community Teaching Assistant in Usable Security in Coursera", "House Captain - Socrates House"};

    String[] pDuration = {"April, 2015 - April, 2016", "July, 2015 - November, 2015",
            "October, 2015 - December, 2015", "July, 2012 - May, 2013"};

    String[] pDescription = {"Organizing various art and craft events such as Art Attack (Thumb Painting) in our college. \n" +
            "Managing cultural events such as Rubaroo (Fresher’s Night) and Gusto (Drama and Fashion Show).",
            "Assisting junior batch students in lab to make them practically understand the syntax and concepts of C Programming.",
            "Assisting fellow students in Coursera community to help understand concepts of efficient designs in terms of security and user experience",
            "Maintaining the discipline in the school and organizing the Annual Carnival of the school"};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.position,parent,false);
        return new PositionHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        PositionHolder positionHolder = (PositionHolder) holder;
        positionHolder.getPosTitle().setText(pTitle[position]);
        positionHolder.getDuration().setText(pDuration[position]);
        positionHolder.getPosDescription().setText(pDescription[position]);
    }

    @Override
    public int getItemCount() {
        return pTitle.length;
    }
}
