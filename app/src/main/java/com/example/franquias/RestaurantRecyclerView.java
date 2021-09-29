package com.example.franquias;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.franquias.model.Restaurant;

import java.util.ArrayList;

public class RestaurantRecyclerView extends RecyclerView.Adapter<RestaurantRecyclerView.ViewHolder> {
    private final ArrayList<Restaurant> restaurants;

    public RestaurantRecyclerView(ArrayList<Restaurant> dataSet) {
        this.restaurants = dataSet;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final TextView textViewCity;
        private final TextView textViewAddress;
        private final ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.restaurantName);
            textViewAddress = (TextView) v.findViewById(R.id.restaurantAddress);
            textViewCity = (TextView) v.findViewById(R.id.restaurantCity);
            this.imageView=(ImageView)v.findViewById(R.id.restaurantImage);

        }
        public TextView getTextView() {
            return textView;
        }
        public TextView getTextViewCity() { return textViewCity;  }
        public TextView getTextViewAddress() { return textViewAddress;  }
        public ImageView getImageView() { return imageView; }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.restaurant_component, viewGroup, false);
        return new ViewHolder(v);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextView().setText(restaurants.get(position).getName());
        viewHolder.getTextViewCity().setText(restaurants.get(position).getCity());
        viewHolder.getTextViewAddress().setText(restaurants.get(position).getAddress());
        viewHolder.getImageView().setImageDrawable(viewHolder.getImageView().getContext().getDrawable(restaurants.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

}
