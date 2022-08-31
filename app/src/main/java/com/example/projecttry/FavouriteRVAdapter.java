package com.example.projecttry;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class FavouriteRVAdapter extends RecyclerView.Adapter<FavouriteRVAdapter.ViewHolder> {

    private ArrayList<HomeRVModel> homeRVModelArrayList;
    Context context;

    public FavouriteRVAdapter(ArrayList<HomeRVModel> homeRVModels, Context context) {
        this.homeRVModelArrayList = homeRVModels;
        this.context = context;
    }

    @NonNull
    @Override
    public FavouriteRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_rv_items, parent, false);
        return new FavouriteRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FavouriteRVAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        HomeRVModel homeRVModel = homeRVModelArrayList.get(position);
        holder.titleTV.setText(homeRVModel.getTitle());
        holder.subTitleTV.setText(homeRVModel.getSubTitle());
        Picasso.get().load(homeRVModel.getHomeImageUrl()).into(holder.cardIV);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(context, DetailsActivity.class);
                i.putExtra("title", homeRVModel.getTitle());
                i.putExtra("content", homeRVModel.getContent());
                i.putExtra("subTitle", homeRVModel.getSubTitle());
                i.putExtra("image", homeRVModel.getHomeImageUrl());
                i.putExtra("url", homeRVModel.getUrl());
                i.putExtra("state", homeRVModel.getState());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return homeRVModelArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTV, subTitleTV;
        ImageView cardIV;
        ImageButton favouriteStarIB;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTV = itemView.findViewById(R.id.idTVCardHeading);
            subTitleTV = itemView.findViewById(R.id.idTVSubTitle);
            cardIV = itemView.findViewById(R.id.idIVCard);
            favouriteStarIB = itemView.findViewById(R.id.idIBFavouriteStar);
        }
    }
}
