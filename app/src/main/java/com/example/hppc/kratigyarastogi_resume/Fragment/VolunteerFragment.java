package com.example.hppc.kratigyarastogi_resume.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hppc.kratigyarastogi_resume.Adapter.VolunteerAdapter;
import com.example.hppc.kratigyarastogi_resume.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VolunteerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VolunteerFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private RecyclerView volRecyclerView;
    private RecyclerView.Adapter volAdapter;
    private RecyclerView.LayoutManager volLayoutManager;

    public VolunteerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VolunteerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VolunteerFragment newInstance(String param1, String param2) {
        VolunteerFragment fragment = new VolunteerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_volunteer, container, false);

        volRecyclerView = (RecyclerView) view.findViewById(R.id.volRecView);
        volRecyclerView.setHasFixedSize(true);
        volLayoutManager = new LinearLayoutManager(getActivity());
        volRecyclerView.setLayoutManager(volLayoutManager);
        volAdapter = new VolunteerAdapter();
        volRecyclerView.setAdapter(volAdapter);

        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
