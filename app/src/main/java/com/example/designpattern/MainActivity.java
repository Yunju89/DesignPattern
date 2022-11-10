package com.example.designpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.designpattern.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        onClick();
    }

    private void onClick() {
        binding.buttonSingleTon.setOnClickListener(view -> {
            singleTon();
        });

        binding.buttonBuilder.setOnClickListener(view -> {
            builder();
        });
    }

    private void singleTon() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            Log.d("yj : singleton", "obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            Log.d("yj : singleton", "obj1과 obj2는 다른 인스턴스입니다.");
        }
    }

    private void builder() {
        BuilderPattern builderPattern1 = new BuilderPattern.Builder("지어소프트")
                .setName("홍길동")
                .setPosition("App")
                .setGender("남성")
                .build();

        BuilderPattern builderPattern2 = new BuilderPattern.Builder("다른소프트")
                .setName("홍길순")
                .setPosition("Web")
                .setGender("여성")
                .build();

        Log.d("yj : builder1", builderPattern1.toStringTest());

        Log.d("yj : builder2", builderPattern2.toStringTest());
    }
}