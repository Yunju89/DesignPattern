package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.example.designpattern.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

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

    private void singleTon(){
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if(obj1 == obj2){
            Log.d("yj : singleton", "obj1과 obj2는 같은 인스턴스입니다.");
        }else{
            Log.d("yj : singleton", "obj1과 obj2는 다른 인스턴스입니다.");
        }
    }

    private void builder(){
        BuilderPattern builderPattern = new BuilderPattern.Builder("지어소프트")
                .setName("이윤주")
                .setPosition("Android")
                .setGender("여")
                .build();

        Log.d("yj : builder" , builderPattern.toStringTest());
    }
}