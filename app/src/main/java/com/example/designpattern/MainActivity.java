package com.example.designpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.designpattern.adapter.adaptermail.Adapter;
import com.example.designpattern.adapter.adaptermail.MailSenderA;
import com.example.designpattern.adapter.adaptermail.SolutionA;
import com.example.designpattern.adapter.adaptermail.SolutionB;
import com.example.designpattern.adapter.AirConditioner;
import com.example.designpattern.adapter.Cleaner;
import com.example.designpattern.adapter.Electronic110v;
import com.example.designpattern.adapter.ElectronicAdapter;
import com.example.designpattern.adapter.HairDryer;
import com.example.designpattern.builder.BuilderPattern;
import com.example.designpattern.databinding.ActivityMainBinding;
import com.example.designpattern.observer.NumberObserver;
import com.example.designpattern.observer.GraphObserver;
import com.example.designpattern.observer.NumberGenerator;
import com.example.designpattern.observer.Observer;
import com.example.designpattern.singleton.Singleton;
import com.example.designpattern.templatemethod.IceAmericano;
import com.example.designpattern.templatemethod.IceLatte;

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

        binding.buttonTemplateMethod.setOnClickListener(view -> {
            templateMethod();
        });

        binding.buttonObserver.setOnClickListener(view -> {
            observer();
        });

        binding.buttonAdapter.setOnClickListener(view -> {
            adapter();
            adapterMail();
        });
    }

    private void singleTon() {
        Singleton obj1 = Singleton.getInstance();
        Log.d("yj : singleton", "obj1 생성");
        Singleton obj2 = Singleton.getInstance();
        Log.d("yj : singleton", "obj2 생성");
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

    private void templateMethod() {
        IceAmericano iceAmericano = new IceAmericano();
        IceLatte iceLatte = new IceLatte();

        iceAmericano.makeCoffee();
        iceLatte.makeCoffee();
    }

    private void observer(){
        NumberGenerator generator = new NumberGenerator();
        Observer observer1 = new NumberObserver();      // 다형성
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }

    private void adapter(){
        Electronic110v hairDryer = new HairDryer();
        Electronic110v cleaner = new ElectronicAdapter(new Cleaner());
        Electronic110v airConditioner = new ElectronicAdapter(new AirConditioner());

        hairDryer.powerOn();
        cleaner.powerOn();
        airConditioner.powerOn();
    }

    private void adapterMail(){
        MailSenderA senderA = new SolutionA();
        senderA.send("A 발송 메일");

        senderA = new Adapter(new SolutionB()); // SolutionA에서 B 실행 가능
        senderA.send("B 발송 메일");
    }

}