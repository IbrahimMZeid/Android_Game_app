package com.example.projecttry;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import controller.DatabaseHandller;
import model.Games;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Favourite_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Favourite_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private RecyclerView favouriteRV;
    public static ArrayList<HomeRVModel> favouriteRVModelArrayList;
    FavouriteRVAdapter adapter;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Favourite_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Cart_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Favourite_Fragment newInstance(String param1, String param2) {
        Favourite_Fragment fragment = new Favourite_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favourite_, container, false);

        favouriteRV = view.findViewById(R.id.idRVFavourite);
        favouriteRVModelArrayList = new ArrayList<>();

        getGames();
        adapter = new FavouriteRVAdapter(favouriteRVModelArrayList, getActivity());
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        favouriteRV.setLayoutManager(layoutManager);
        favouriteRV.setAdapter(adapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        favouriteRVModelArrayList.clear();
        getGames();
        adapter.notifyDataSetChanged();

    }

    public void getGames(){

        DatabaseHandller dbH = new DatabaseHandller(getActivity());
        String email = this.getActivity().getSharedPreferences("com.example.projecttry", getActivity().MODE_PRIVATE).getString("email", "");
        ArrayList<HomeRVModel> games = dbH.getFavouriteGame(email);
        if (games != null) {
//            Log.i("game", games.size() + "");
            for (int i = 0; i < games.size(); i++) {
                favouriteRVModelArrayList.add(new HomeRVModel(
                        games.get(i).getTitle(), games.get(i).getSubTitle(), games.get(i).getHomeImageUrl(), games.get(i).getUrl(), games.get(i).getContent(), games.get(i).getState()
                ));
            }
        }
    }
}