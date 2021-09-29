package com.example.franquias;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.franquias.data.Data;
import com.example.franquias.model.Restaurant;

import java.util.ArrayList;
import java.util.Objects;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_activity);

        Toolbar toolbar = findViewById(R.id.toolbarRestaurant);
        setSupportActionBar(toolbar);

        ArrayList<Restaurant> restaurants = (ArrayList<Restaurant>) getIntent().getSerializableExtra("restaurants");

        RestaurantRecyclerView restaurantRecyclerView = new RestaurantRecyclerView(restaurants);
        RecyclerView rv = this.findViewById(R.id.recyclerViewRestaurant);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(restaurantRecyclerView);
    }
}
