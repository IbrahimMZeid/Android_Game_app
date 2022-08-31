package com.example.projecttry;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import controller.DatabaseHandller;
import model.Games;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home_Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private RecyclerView homeRV;
    private ArrayList<HomeRVModel> homeRVModelArrayList;
    View view;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Home_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Home_Fragment newInstance(String param1, String param2) {
        Home_Fragment fragment = new Home_Fragment();
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
        homeRVModelArrayList = new ArrayList<>();
        view = inflater.inflate(R.layout.fragment_home_, container, false);
        getGames();

        homeRV = view.findViewById(R.id.idRVHome);

        HomeRVAdapter adapter = new HomeRVAdapter(homeRVModelArrayList, getActivity());
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 2);
        homeRV.setLayoutManager(layoutManager);
        homeRV.setAdapter(adapter);
//        homeRVModelArrayList = HomeRVModel.addData(homeRVModelArrayList);

        return view;

    }
    public void getGames(){
        DatabaseHandller dbH = new DatabaseHandller(getActivity());
//        String email = this.getActivity().getSharedPreferences("com.example.projecttry", getActivity().MODE_PRIVATE).getString("email", "");
        ArrayList<HomeRVModel> games = dbH.getGame();
        if (games != null) {
//            Log.i("game", games.size() + "");
            for (int i = 0; i < games.size(); i++) {
                homeRVModelArrayList.add(new HomeRVModel(
                        games.get(i).getTitle(), games.get(i).getSubTitle(), games.get(i).getHomeImageUrl(), games.get(i).getUrl(), games.get(i).getContent(), games.get(i).getState()
                ));
            }
        }
    }

}