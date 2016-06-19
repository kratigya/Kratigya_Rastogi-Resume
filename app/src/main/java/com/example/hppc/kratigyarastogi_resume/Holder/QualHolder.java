package com.example.hppc.kratigyarastogi_resume.Holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hppc.kratigyarastogi_resume.R;

/**
 * Created by hppc on 09-Jun-16.
 */
public class QualHolder extends RecyclerView.ViewHolder {

    private ImageView schlImage;
    private TextView schlName, degree, marks;

    public QualHolder(View itemView) {
        super(itemView);
        schlImage = (ImageView) itemView.findViewById(R.id.sclImg);
        schlName = (TextView) itemView.findViewById(R.id.sclName);
        degree = (TextView) itemView.findViewById(R.id.degree);
        marks = (TextView) itemView.findViewById(R.id.marks);
    }

    public ImageView getSchlImage() {
        return schlImage;
    }

    public TextView getSchlName() {
        return schlName;
    }

    public TextView getDegree() {
        return degree;
    }

    public TextView getMarks() {
        return marks;
    }

    public void setDegree(TextView degree) {
        this.degree = degree;
    }

    public void setMarks(TextView marks) {
        this.marks = marks;
    }

    public void setSchlImage(ImageView schlImage) {
        this.schlImage = schlImage;
    }

    public void setSchlName(TextView schlName) {
        this.schlName = schlName;
    }
}
