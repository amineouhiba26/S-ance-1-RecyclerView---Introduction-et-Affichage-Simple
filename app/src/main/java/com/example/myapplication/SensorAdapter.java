package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SensorAdapter extends RecyclerView.Adapter<SensorAdapter.ViewHolder> {

    private final List<SensorData> data;

    public SensorAdapter(List<SensorData> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.sensor, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SensorData item = data.get(position);

        holder.sensorImageView.setImageResource(item.getImageResId());
        holder.sensorNameTextView.setText(item.getName());
        holder.sensorValueTextView.setText("Valeur: " + item.getValue() + " " + item.getUnit());

        int progressValue = (int) Math.round(Math.max(0, Math.min(100, item.getValue())));
        holder.progressBar.setProgress(progressValue);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sensorImageView;
        TextView sensorNameTextView;
        TextView sensorValueTextView;
        ProgressBar progressBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            sensorImageView = itemView.findViewById(R.id.imageView3);
            sensorNameTextView = itemView.findViewById(R.id.textView12);
            sensorValueTextView = itemView.findViewById(R.id.textView11);
            progressBar = itemView.findViewById(R.id.progressBar);
            progressBar.setMax(100);
        }
    }
}
