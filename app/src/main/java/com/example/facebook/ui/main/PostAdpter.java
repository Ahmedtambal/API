package com.example.facebook.ui.main;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.facebook.R;
import com.example.facebook.dj.PostModel;

import java.util.ArrayList;
import java.util.List;

public class PostAdpter extends RecyclerView.Adapter<PostAdpter.PostViewHolder> {
    private List<PostModel> moviesList = new ArrayList<>();

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.postitem, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.titleTv.setText(moviesList.get(position).getTitle());
        holder.userTv.setText(moviesList.get(position).getUserId()+"");
        holder.bodyTv.setText(moviesList.get(position).getBody());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void setList(List<PostModel> moviesList) {
        this.moviesList = moviesList;
        notifyDataSetChanged();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        TextView titleTv , userTv , bodyTv;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTv = itemView.findViewById(R.id.titleTV);
            userTv =  itemView.findViewById(R.id.userIdTV);
            bodyTv = itemView.findViewById(R.id.bodyTV);

        }

    }
}
