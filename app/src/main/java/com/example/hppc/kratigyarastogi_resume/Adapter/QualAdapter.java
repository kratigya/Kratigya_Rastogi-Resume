package com.example.hppc.kratigyarastogi_resume.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.Holder.QualHolder;
import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 09-Jun-16.
 */
public class QualAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int[] img = {R.drawable.lnmiit, R.drawable.tms, R.drawable.tms};
    String[] name = {"The LNM Institute Of Information Technology", "The Modern School", "The Modern School"};
    String[] degree = {"Bachelor of Technology,\nComputer Science Engineering", "Class XII (ISC)", "Class X (ICSE)"};
    String[] marks = {"9.38/10","88%", "97.2%"};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.qualification, parent, false);
        return new QualHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        QualHolder qualHolder = (QualHolder) holder;
        qualHolder.getSchlImage().setImageResource(img[position]);
        qualHolder.getSchlName().setText(name[position]);
        qualHolder.getDegree().setText(degree[position]);
        qualHolder.getMarks().setText(marks[position]);

    }

    @Override
    public int getItemCount() {
        return img.length;
    }
}
