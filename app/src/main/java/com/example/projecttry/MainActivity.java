package com.example.projecttry;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import controller.DatabaseHandller;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = MainActivity.class.getSimpleName();
    BottomNavigationView bottomNavigationView;
    FragmentManager fragmentManager;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor prefEditor;
    String email;
    String pass, cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences("com.example.projecttry", MODE_PRIVATE);
        prefEditor = sharedPreferences.edit();

        email = sharedPreferences.getString("email", "");
        pass = sharedPreferences.getString("pass", "");
        cnt = sharedPreferences.getString("count", "");
        if (email.equals("") || pass.equals("")) {
            startActivity(new Intent(this, SignIn.class));
            finish();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (cnt.equals("")) {
            DatabaseHandller dbH = new DatabaseHandller(this);
            ArrayList<HomeRVModel> homeRVModelArrayList = new ArrayList<>();
            homeRVModelArrayList = HomeRVModel.addData(homeRVModelArrayList);
            for (int i = 0; i < homeRVModelArrayList.size(); i++) {
                dbH.addGame(homeRVModelArrayList.get(i));
            }
        }
        prefEditor.putString("count", "1");
        prefEditor.commit();

        bottomNavigationView = findViewById(R.id.idBottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
//        bottomNavigationView.setSelectedItemId(R.id.idHomeFragment);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.idHomeFragment:
                fragment = new Home_Fragment();
                break;
            case R.id.idFavourite_Fragment:
                fragment = new Favourite_Fragment();
                break;
            case R.id.idDownloadedFragment:
                fragment = new Downloaded_Fragment();
                break;
            case R.id.idProfileFragment:
                fragment = new Profile_Fragment();
                break;

        }
        if (fragment != null) {
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.idMainFragment, fragment)
                    .commit();
            return true;
        } else {
            Log.e(TAG, "Error in creating fragment");
        }
        return false;
    }

    public static void message(String msg, Context context) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}