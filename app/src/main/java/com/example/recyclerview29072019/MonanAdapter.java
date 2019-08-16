package com.example.recyclerview29072019;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MonanAdapter extends RecyclerView.Adapter<MonanAdapter.MonanHolder> {

    ArrayList<Monan> mangmonan;

    public MonanAdapter(ArrayList<Monan> mangmonan) {
        this.mangmonan = mangmonan;
    }

    @NonNull
    @Override
    public MonanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_monan, null);
        return new MonanHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MonanHolder holder, int position) {
        Monan monan = mangmonan.get(position);
        holder.txtTen.setText(monan.getTen());
        holder.txtGia.setText(monan.getGia() +"");
        holder.imgHinhanh.setImageResource(monan.getHinhanh());
    }

    @Override
    public int getItemCount() {
        return mangmonan.size() > 0 ? mangmonan.size() : 0;
    }


    class MonanHolder extends RecyclerView.ViewHolder {
        TextView txtTen, txtGia;
        ImageView imgHinhanh;

        public MonanHolder(@NonNull View itemView) {
            super(itemView);
            txtGia = itemView.findViewById(R.id.textviewGia);
            txtTen = itemView.findViewById(R.id.textviewTen);
            imgHinhanh = itemView.findViewById(R.id.imageItemMonan);
        }
    }
}