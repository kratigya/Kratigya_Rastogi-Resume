package com.example.hppc.kratigyarastogi_resume.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.Holder.ProjectHolder;
import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 11-Jun-16.
 */
public class ProjectAdapter extends RecyclerView.Adapter {

    String[] projTitle = {"SMS App", "DBJ Explorer (GUI for MySql)", "Two Pass Assembler for self-designed 32-bit ISA"};

    String[] projDuration = {"April, 2016","March, 2016 - April, 2016", "March, 2016"};

    String[] projDescription = {"The app can be used to send, receive and display all the messages received by the user.\n" +
            "The user can perform a search through all his messages which are grouped by the sender",
            "It provides a GUI for MySQL for naïve users to rescue them from learning commands and syntax of MySQL. " +
                    "It also provides a feature to import data from an excel sheet and store it in the database." +
                    "It is developed using Java, JDBC, and Apache POI library.",
            "It converts assembly language code to machine language code and " +
                    "then executes the code to give the desired output using C programming language. "};

    String[] projTeam = {"Self","Prafful Mehrotra and Gaurav Hans", "Prafful Mehrotra, Gaurav Hans and Garima Jain"};

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.project, parent, false);

        return new ProjectHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ProjectHolder projectHolder = (ProjectHolder) holder;
        projectHolder.getTitle().setText(projTitle[position]);
        projectHolder.getDate().setText(projDuration[position]);
        projectHolder.getDescription().setText(projDescription[position]);
        projectHolder.getTeam().setText("Team Members: "+projTeam[position]);
    }

    @Override
    public int getItemCount() {
        return projTitle.length;
    }
}
