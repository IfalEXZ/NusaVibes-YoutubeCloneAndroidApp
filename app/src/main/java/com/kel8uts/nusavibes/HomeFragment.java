package com.kel8uts.nusavibes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private List<VideoItem> videoList;
    private RecyclerView homeRecyclerView;
    private VideoAdapter videoAdapter;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        videoList = generateVideoItems();

        homeRecyclerView = rootView.findViewById(R.id.homeRecyclerView);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        videoAdapter = new VideoAdapter(videoList);
        homeRecyclerView.setAdapter(videoAdapter);

        return rootView;
    }

    private List<VideoItem> generateVideoItems(){
        List<VideoItem> videoItems = new ArrayList<>();
        videoItems.add(new VideoItem(R.drawable.thumbnail1, "How to ACTUALLY learn to code... 7 Roadmaps for 2023", "Fireship ∙ 1,5 jt x ditonton ∙ 10 bulan yang lalu", R.drawable.channel1));
        videoItems.add(new VideoItem(R.drawable.thumbnail2, "AKU PAKAI 3 FIGTHER ANDALANKU DI MCL! Mobile Legends", "Windah Basudara ∙ 1,4 jt x ditonton ∙ 7 bulan yang lalu", R.drawable.channel2));
        videoItems.add(new VideoItem(R.drawable.thumbnail3, "【2ND ORIGINAL SONG MV】 Oh! Asmara - Kobo Kanaeru 【hololive Indonesia 3rd Gen】", "Kobo Kanaeru ∙ 6,5 jt x ditonton ∙ 7 bulan yang lalu", R.drawable.channel3));
        videoItems.add(new VideoItem(R.drawable.thumbnail4, "How programmer flex on each other", "Fireship ∙ 1,5 jt x ditonton ∙ 3 bulan yang lalu", R.drawable.channel1));
        videoItems.add(new VideoItem(R.drawable.thumbnail5, "TANK PURBA AKHIRNYA BERGUNA", "HEROISGOD ∙ 451 rb x ditonton ∙ 4 hari yang lalu", R.drawable.channel5));

        return videoItems;
    }
}