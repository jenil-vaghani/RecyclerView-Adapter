package com.example.recyclerviewadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.Myclass> {

    MainActivity mainActivity;
    String[] title;
    Integer[] img;
    Animation animationAdapter;


    public Adapter(MainActivity mainActivity, String[] title, Integer[] img) {

        this.title = title;
        this.img = img;
        this.mainActivity = mainActivity;
    }

    @NonNull
    @Override
    public Myclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item_file, parent, false);
        return new Myclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myclass holder, int position) {

        holder.textView.setText(title[position]);
        holder.imageView.setBackgroundResource(img[position]);
        animationAdapter = AnimationUtils.loadAnimation(mainActivity, R.anim.adapter_animation);
        holder.card.setAnimation(animationAdapter);

    }


    @Override
    public int getItemCount() {
        return img.length;
    }

    class Myclass extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView textView;
        CardView card;


        public Myclass(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.adapterImg);
            textView = itemView.findViewById(R.id.adapterTxt);
            card=itemView.findViewById(R.id.card);

        }
    }

}
