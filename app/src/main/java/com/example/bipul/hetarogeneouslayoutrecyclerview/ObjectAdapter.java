package com.example.bipul.hetarogeneouslayoutrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ObjectAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private ArrayList<Object>objects;
    private final int CAR_TYPE = 1;
    private final  int MOVIE_TYPR = 2;

    public ObjectAdapter(Context context, ArrayList<Object> objects) {
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType){
            case CAR_TYPE:
                View v = inflater.inflate(R.layout.car_single_row,viewGroup,false);
                viewHolder = new CarViewHolder(v);
                break;
            case  MOVIE_TYPR:
                View v1 = inflater.inflate(R.layout.movie_single_row,viewGroup,false);
                viewHolder = new MovieViewHolder(v1);
                break;
        }

        return viewHolder ;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {
        switch (holder.getItemViewType()){
            case CAR_TYPE:
                CarViewHolder ch = (CarViewHolder) holder;
              Car car = (Car) objects.get(i);
              ch.carTV.setImageResource(car.getCarImage());
              ch.carNameTV.setText(car.getCarName());
              ch.carCompanyTV.setText(car.getCompanyName());
                break;

            case MOVIE_TYPR:
                MovieViewHolder mh = (MovieViewHolder) holder;
                Movie movie = (Movie) objects.get(i);
                mh.movieNameTV.setText(movie.getMovieName());
                mh.moviecategoryTV.setText(movie.getMovieCategory());
                break;
        }

    }

    @Override
    public int getItemCount() {
        return objects.size();
    }


    public class CarViewHolder extends  RecyclerView.ViewHolder{

        ImageView carTV;
        TextView carNameTV;
        TextView carCompanyTV;
        public CarViewHolder(@NonNull View itemView) {
            super(itemView);

            carTV = itemView.findViewById(R.id.carImage);
            carNameTV = itemView.findViewById(R.id.carName);
            carCompanyTV = itemView.findViewById(R.id.carCompany);
        }
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{

        TextView movieNameTV;
        TextView moviecategoryTV;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieNameTV = itemView.findViewById(R.id.movieName);
            moviecategoryTV = itemView.findViewById(R.id.movieCategory);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (objects.get(position) instanceof Car){
            return CAR_TYPE;
        }else if(objects.get(position) instanceof Movie){
            return MOVIE_TYPR;
        }
        return -1;

    }
}
