package com.example.projecttry;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


import com.squareup.picasso.Picasso;


import controller.DatabaseHandller;

public class DetailsActivity extends AppCompatActivity {


    String title, desc, content, imageUrl, url, state, email;
    TextView titleTV, subTV, contentTV;
    ImageView cardIV;
    Button readMoreBtn;
    ImageButton favouriteStarIB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle bundle = getIntent().getExtras();
        title = bundle.getString("title");
        desc = bundle.getString("subTitle");
        content = bundle.getString("content");
        imageUrl = bundle.getString("image");
        url = bundle.getString("url");
        state = bundle.getString("state");
        Log.i("state", state);

        titleTV = findViewById(R.id.idTVTitle);
        cardIV = findViewById(R.id.idIVItemImage);
        subTV = findViewById(R.id.idTVSubDesc);
        contentTV = findViewById(R.id.idTVContent);
        readMoreBtn = findViewById(R.id.idBtnReadMore);
        favouriteStarIB = findViewById(R.id.idIBFavouriteStar);
        titleTV.setText(title);
        subTV.setText(desc);
        contentTV.setText(content);
        Picasso.get().load(imageUrl).into(cardIV);
        String email = getSharedPreferences("com.example.projecttry", MODE_PRIVATE).getString("email", "");
        DatabaseHandller dbH = new DatabaseHandller(this);
        String found = dbH.getFavouriteGameToDetails(email, title);
        if (found != null) {
            favouriteStarIB.setImageResource(R.drawable.ic_added_favourite);
            favouriteStarIB.setActivated(true);
        } else {
            favouriteStarIB.setImageResource(R.drawable.ic_favourite1);
            favouriteStarIB.setActivated(false);
        }

        readMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent launchIntent = getPackageManager().getLaunchIntentForPackage(state);

                if (launchIntent == null) {
                    launchIntent = new Intent(Intent.ACTION_VIEW);
                    launchIntent.setData(Uri.parse(url));
                }

                startActivity(launchIntent);
            }
        });
    }

    public void ChangeState(View view) {
        DatabaseHandller dbH = new DatabaseHandller(this);
        String email = getSharedPreferences("com.example.projecttry", MODE_PRIVATE).getString("email", "");

        if (favouriteStarIB.isActivated()) {
            favouriteStarIB.setActivated(false);
            favouriteStarIB.setImageResource(R.drawable.ic_favourite1);
            String msg = dbH.deleteGame(email, title);
            MainActivity.message(msg, this);
        } else {
            favouriteStarIB.setActivated(true);
            favouriteStarIB.setImageResource(R.drawable.ic_added_favourite);
            String msg = dbH.addGameFavourite(email, title);
            MainActivity.message(msg, this);
        }

    }
}