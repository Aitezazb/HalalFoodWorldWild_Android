package com.example.a.halalfoodworldwide.Helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.a.halalfoodworldwide.Models.RatingListViewModel;
import com.example.a.halalfoodworldwide.R;

import java.util.ArrayList;

public class RatingItemAdapter extends ArrayAdapter<RatingListViewModel> {
     Context context;
//    String restaurantName[];
//    String ratings[];
    ArrayList<RatingListViewModel> ratingListViewModels;

    public RatingItemAdapter(Context context, ArrayList<RatingListViewModel> ratingListViewModels){
        super(context, R.layout.rating_list_item,R.id.RatingItem_RestaurantName,ratingListViewModels);
        this.context = context;
        this.ratingListViewModels = ratingListViewModels;
    }
//   public RatingItemAdapter(Context context,String restaurantName[],String ratings[]){
//        super(context, R.layout.rating_list_item,R.id.RatingItem_RestaurantName,restaurantName);
//        this.context = context;
//        this.restaurantName = restaurantName;
//        this.ratings = ratings;
//    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View ratingListView = layoutInflater.inflate(R.layout.rating_list_item,parent,false);
        TextView restaurantNameTextView = (TextView) ratingListView.findViewById(R.id.RatingItem_RestaurantName);
        TextView ratingTextView = (TextView) ratingListView.findViewById(R.id.RatingItem_RestaurantRate);

        restaurantNameTextView.setText(ratingListViewModels.get(position).getRestaurantName());
        ratingTextView.setText(ratingListViewModels.get(position).getStar());

        return ratingListView;
    }
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        LayoutInflater layoutInflater = (LayoutInflater)context.getApplicationContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
//        View ratingListView = layoutInflater.inflate(R.layout.rating_list_item,parent,false);
//        TextView restaurantNameTextView = (TextView) ratingListView.findViewById(R.id.RatingItem_RestaurantName);
//        TextView ratingTextView = (TextView) ratingListView.findViewById(R.id.RatingItem_RestaurantRate);
//
//        restaurantNameTextView.setText(restaurantName[position]);
//        ratingTextView.setText(ratings[position]);
//
//        return ratingListView;
//    }
}
