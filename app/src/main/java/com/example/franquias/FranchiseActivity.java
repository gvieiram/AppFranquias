package com.example.franquias;

import static com.example.franquias.data.Data.*;
import static com.example.franquias.model.Franchise.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.franquias.data.Data;
import com.example.franquias.model.Franchise;

public class FranchiseActivity extends AppCompatActivity {
    private FranchiseRecyclerView franchiseRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.franchise_activity);

        Toolbar toolbar = findViewById(R.id.toolbarFranchise);
        setSupportActionBar(toolbar);

        this.franchiseRecyclerView = new FranchiseRecyclerView(initialLoad());
        RecyclerView rv = this.findViewById(R.id.recyclerViewFranchise);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(franchiseRecyclerView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                franchiseRecyclerView.getFilter().filter(newText);
                return false;
            }
        });
        return true;
    }
}