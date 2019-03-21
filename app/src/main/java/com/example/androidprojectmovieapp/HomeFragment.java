package com.example.androidprojectmovieapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.movie_list, container, false);
        listView = rootView.findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(R.drawable.movie_after_earth, "After Earth", "2013"));
        moviesList.add(new Movie(R.drawable.movie_baby_driver, "Baby Driver", "2017"));
        moviesList.add(new Movie(R.drawable.movie_deadpool, "Deadpool", "2016"));
        moviesList.add(new Movie(R.drawable.movie_divergent, "Divergent", "2014"));

        mAdapter = new MovieAdapter(getActivity(), moviesList);
        listView.setAdapter(mAdapter);
        return rootView;
    }
}
