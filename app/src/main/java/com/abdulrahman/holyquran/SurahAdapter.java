package com.abdulrahman.holyquran;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SurahAdapter extends RecyclerView.Adapter<SurahAdapter.SurahViewHolder> {

    private final List<SurahModel> list;
    private int lastPosition = -1;

    public SurahAdapter(List<SurahModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public SurahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_surah, parent, false);
        return new SurahViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull SurahViewHolder holder, int position) {
        SurahModel surah = list.get(position);

        holder.tvSurahName.setText(surah.getSurahName());
        holder.tvDropOffLocation.setText(surah.getDropOffLocation());
        holder.tvNumberOfPages.setText(surah.getNumberOfPages() + "");
        holder.tvNumberOfVerses.setText(surah.getNumberOfVerses() + "");
        holder.tvNumberOfSurah.setText(surah.getNumberOfSurah() + "");


        setAnimation(holder.itemView, position);
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.item_animation_fall_down);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }else  {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.item_animation_fall_up);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public static class SurahViewHolder extends RecyclerView.ViewHolder {
        TextView tvSurahName, tvDropOffLocation, tvNumberOfPages, tvNumberOfVerses, tvNumberOfSurah;

        public SurahViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSurahName = itemView.findViewById(R.id.tvSurahName);
            tvDropOffLocation = itemView.findViewById(R.id.tvDropOffLocation);
            tvNumberOfPages = itemView.findViewById(R.id.tvNumberOfPages);
            tvNumberOfVerses = itemView.findViewById(R.id.tvNumberOfVerses);
            tvNumberOfSurah = itemView.findViewById(R.id.tvNumberOfSurah);


        }
    }
}
