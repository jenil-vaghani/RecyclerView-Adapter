package com.example.recyclerviewadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainRecyclerView;
    Integer img[] = {
            R.drawable.facebook,
            R.drawable.github,
            R.drawable.google,
            R.drawable.linkedin,
            R.drawable.quora,
            R.drawable.reddit,
            R.drawable.snapchat,
            R.drawable.twitter,
            R.drawable.facebook,
            R.drawable.github,
            R.drawable.google,
            R.drawable.linkedin,
            R.drawable.quora,
            R.drawable.reddit,
            R.drawable.snapchat,
            R.drawable.twitter,
            R.drawable.facebook,
            R.drawable.github,
            R.drawable.google,
            R.drawable.linkedin,
            R.drawable.quora,
            R.drawable.reddit,
            R.drawable.snapchat,
            R.drawable.twitter
    };

    String title[] = {
            "Facebook",
            "Github",
            "Google",
            "Linkedin",
            "Quora",
            "Reddit",
            "Snapchat",
            "Twitter",
            "Facebook",
            "Github",
            "Google",
            "Linkedin",
            "Quora",
            "Reddit",
            "Snapchat",
            "Twitter",
            "Facebook",
            "Github",
            "Google",
            "Linkedin",
            "Quora",
            "Reddit",
            "Snapchat",
            "Twitter"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(MainActivity.this, title, img);
        mainRecyclerView.setAdapter(adapter);


    }
}