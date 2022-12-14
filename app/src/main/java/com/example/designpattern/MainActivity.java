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
import com.example.designpattern.factorymethod.Factory;
import com.example.designpattern.factorymethod.IdCardFactory;
import com.example.designpattern.factorymethod.Product;
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

        binding.buttonFactory.setOnClickListener(view -> {
            factory();
        });
    }

    private void singleTon() {
        Singleton obj1 = Singleton.getInstance();
        Log.d("yj : singleton", "obj1 ??????");
        Singleton obj2 = Singleton.getInstance();
        Log.d("yj : singleton", "obj2 ??????");
        if (obj1 == obj2) {
            Log.d("yj : singleton", "obj1??? obj2??? ?????? ?????????????????????.");
        } else {
            Log.d("yj : singleton", "obj1??? obj2??? ?????? ?????????????????????.");
        }
    }

    private void builder() {
        BuilderPattern builderPattern1 = new BuilderPattern.Builder("???????????????")
                .setName("?????????")
                .setPosition("App")
                .setGender("??????")
                .build();

        BuilderPattern builderPattern2 = new BuilderPattern.Builder("???????????????")
                .setName("?????????")
                .setPosition("Web")
                .setGender("??????")
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
        Observer observer1 = new NumberObserver();      // ?????????
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

        Log.d("yj : adapter", "======================================");    // ????????? ????????? ??????
    }

    private void adapterMail(){
        MailSenderA senderA = new SolutionA();
        senderA.send("?????? ?????? ??????");

        senderA = new Adapter(new SolutionB()); // SolutionA?????? B ?????? ??????
        senderA.send("?????? ?????? ??????");
    }

    private void factory(){
        IdCardFactory factory = new IdCardFactory();
        Product card1 = factory.create("?????????");  //factory ??????????????? create ??? Product ??????
        Product card2 = factory.create("?????????");
        Product card3 = factory.create("?????????");
        factory.getOwnerList();
        Product p = (Product)factory.getOwnerList().get(0);
        p.use();
        card1.use();                              
        card2.use();
        card3.use();
    }

}