package com.iffy.mvcmvpjetpack.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iffy.mvcmvpjetpack.R;

import java.util.ArrayList;


/**
 * author : iffy
 * time   : 2020/03/14
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MVH> {

    private ArrayList<ItemBean> data = new ArrayList<>();

    public Adapter(ArrayList data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MVH(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MVH holder, int position) {
        holder.imageView.setImageResource(data.get(position).imageResource);
        holder.textView.setText(data.get(position).content);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MVH extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public MVH(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.text);
        }
    }
}
