package com.example.franquias;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.franquias.model.Franchise;

import java.util.ArrayList;
import java.util.List;

public class FranchiseRecyclerView extends RecyclerView.Adapter<FranchiseRecyclerView.ViewHolder> implements Filterable {
    private final ArrayList<Franchise> franchises;
    private final ArrayList<Franchise> searchFranchises;

    public FranchiseRecyclerView(ArrayList<Franchise> dataSet) {
        this.franchises = dataSet;
        searchFranchises = new ArrayList<>(franchises);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final TextView textViewDesc;
        private final ImageView imageView;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.franchiseName);
            textViewDesc = (TextView) v.findViewById(R.id.franchiseDescription);
            this.imageView=(ImageView)v.findViewById(R.id.franchiseImage);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos = getAdapterPosition();
                    if (pos!=RecyclerView.NO_POSITION){
                         Intent intent = new Intent(view.getContext(), RestaurantActivity.class);
                        intent.putExtra("restaurants", franchises.get(pos).getRestaurants());
                        view.getContext().startActivity(intent);
                    }
                }
            });

        }
        public TextView getTextView() {
            return textView;
        }
        public TextView getTextViewDesc() { return textViewDesc;  }
        public ImageView getImageView() { return imageView; }

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.franchise_component, viewGroup, false);
        return new ViewHolder(v);
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextView().setText(franchises.get(position).getName());
        viewHolder.getTextViewDesc().setText(String.valueOf(franchises.get(position).getDescription()));
        viewHolder.getImageView().setImageDrawable(viewHolder.getImageView().getContext().getDrawable(franchises.get(position).getImage()));
    }

    @Override
    public int getItemCount() {
        return franchises.size();
    }

    @Override
    public Filter getFilter() {
        return franchiseFilter;
    }

    private final Filter franchiseFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<Franchise> filteredList = new ArrayList<>();
            if (charSequence == null || charSequence.length() == 0) {
                filteredList.addAll(searchFranchises);
            } else {
                String filterPattern = charSequence.toString().toLowerCase().trim();

                for (Franchise item : searchFranchises) {
                    if (item.getName().toLowerCase().contains(filterPattern) || item.getDescription().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @SuppressLint("NotifyDataSetChanged")
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            franchises.clear();
            franchises.addAll((List) filterResults.values);
            notifyDataSetChanged();
        }
    };
}
