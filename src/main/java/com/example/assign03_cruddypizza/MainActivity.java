package com.example.assign03_cruddypizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


//    creating button objects
    private Button smallSizeBtn , medSizeBtn  , largSizeBtn , xlSizeBtn ,
                    addCheeseBtn , subCheeseBtn , addChickenBtn , subChickenBtn,
                    addPepperoniBtn , subPepperoniBtn , addSausageBtn , subSausageBtn ,
                    addRedOnionBtn , subRedOnionBtn , addMushroomBtn , subMushroomBtn ,
                    addPineappleBtn , subPineappleBtn , addVeggiesBtn , subVeggiesBtn , orderBtn;

    private Switch toggleSwitch;

//    creating text view objects to ddisplay topping amounts
    private TextView cheeseAmntTxtView , chickenAmntTxtView , pepperoniAmntTxtView ,
                        sausageAmntTxtView , redOnionAmntTxtView , mushroomAmntTxtView ,
                        pineappleAmntTxtView , veggiesAmntTxtView;

//    creating text view objects to display prompts
    private TextView crustPromptTxtView , chooseToppingsPromptTxtView , toppingsPromptTxtView01 ,
                    toppingTxtView02 ,toppingTxtView03 , toppingTxtView04 , toppingTxtView05 ,
                    toppingTxtView06 , toppingTxtView07 , toppingTxtView08 ,
                    customerPromptTxtView01 , customerQ1PlainText , customerQ2PhoneTxt,
                    customerQ3PostalAddrTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        calling method to link all buttons and text views
        setUpAndLinkBtns();

    }



//    on click listener for the curst size
    public View.OnClickListener crustSizeListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        switch(v.getId()){

        }
    }
};

//    on click listener for topping choices
    public View.OnClickListener toppingsChoiceListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        switch(v.getId()){

        }
    }
};



//    method to link java buttons with xml
    public void setUpAndLinkBtns(){

//        linking crust size buttons
        smallSizeBtn = findViewById(R.id.smallSizeBtn);
        smallSizeBtn.setOnClickListener(crustSizeListener);

        medSizeBtn = findViewById(R.id.medSizeBtn);
        medSizeBtn.setOnClickListener(crustSizeListener);

        largSizeBtn = findViewById(R.id.largSizeBtn);
        largSizeBtn.setOnClickListener(crustSizeListener);

        xlSizeBtn = findViewById(R.id.xlSizeBtn);
        xlSizeBtn.setOnClickListener(crustSizeListener);

//        linking topping choice buttons
//        cheese
        addCheeseBtn = findViewById(R.id.addCheeseBtn);
        addCheeseBtn.setOnClickListener(toppingsChoiceListener);
        subCheeseBtn = findViewById(R.id.subCheeseBtn);
        subCheeseBtn.setOnClickListener(toppingsChoiceListener);
//        chicken
        addChickenBtn = findViewById(R.id.addChickenBtn);
        addChickenBtn.setOnClickListener(toppingsChoiceListener);
        subChickenBtn = findViewById(R.id.subChickenBtn);
        subChickenBtn.setOnClickListener(toppingsChoiceListener);
//        pepperoni
        addPepperoniBtn = findViewById(R.id.addPepperoniBtn);
        addPepperoniBtn.setOnClickListener(toppingsChoiceListener);
        subPepperoniBtn = findViewById(R.id.subPepperoniBtn);
        subPepperoniBtn.setOnClickListener(toppingsChoiceListener);
//        sausage
        addSausageBtn = findViewById(R.id.addSausageBtn);
        addSausageBtn.setOnClickListener(toppingsChoiceListener);
        subSausageBtn = findViewById(R.id.subSausageBtn);
        subSausageBtn.setOnClickListener(toppingsChoiceListener);
//        red onion
        addRedOnionBtn = findViewById(R.id.addRedOnionBtn);
        addRedOnionBtn.setOnClickListener(toppingsChoiceListener);
        subRedOnionBtn = findViewById(R.id.subRedOnionBtn);
        subRedOnionBtn.setOnClickListener(toppingsChoiceListener);
//        mushroom
        addMushroomBtn = findViewById(R.id.addMushroomBtn);
        addMushroomBtn.setOnClickListener(toppingsChoiceListener);
        subMushroomBtn = findViewById(R.id.subMushroomBtn);
        subMushroomBtn.setOnClickListener(toppingsChoiceListener);
//        pineapple
        addPineappleBtn = findViewById(R.id.addPineappleBtn);
        addPineappleBtn.setOnClickListener(toppingsChoiceListener);
        subPineappleBtn = findViewById(R.id.subPineappleBtn);
        subPineappleBtn.setOnClickListener(toppingsChoiceListener);
//        veggies
        addVeggiesBtn = findViewById(R.id.addVeggiesBtn);
        addVeggiesBtn.setOnClickListener(toppingsChoiceListener);
        subVeggiesBtn = findViewById(R.id.subVeggiesBtn);
        subVeggiesBtn.setOnClickListener(toppingsChoiceListener);
//        order button
        orderBtn = findViewById(R.id.orderBtn01);

//        linking topping amounts textViews
        cheeseAmntTxtView = findViewById(R.id.cheeseAmntTxtView);
        chickenAmntTxtView = findViewById(R.id.chickenAmntTxtView);
        pepperoniAmntTxtView = findViewById(R.id.pepperoniAmntTxtView);
        sausageAmntTxtView = findViewById(R.id.sausageAmntTxtView);
        redOnionAmntTxtView = findViewById(R.id.redOnionAmntTxtView);
        mushroomAmntTxtView = findViewById(R.id.mushroomAmntTxtView);
        pineappleAmntTxtView = findViewById(R.id.pineappleTxtView);
        veggiesAmntTxtView = findViewById(R.id.veggiesAmntTxtView);

//        linking toppings choices textViews
        crustPromptTxtView = findViewById(R.id.crustPromptTxtView01);
        chooseToppingsPromptTxtView = findViewById(R.id.toppingsPromptTxtView01);
        toppingsPromptTxtView01 = findViewById(R.id.toppingTxtView01);
        toppingTxtView02 = findViewById(R.id.toppingTxtView02);
        toppingTxtView03 = findViewById(R.id.toppingTxtView03);
        toppingTxtView04 = findViewById(R.id.toppingTxtView04);
        toppingTxtView05 = findViewById(R.id.toppingTxtView05);
        toppingTxtView06 = findViewById(R.id.toppingTxtView06);
        toppingTxtView07 = findViewById(R.id.toppingTxtView07);
        toppingTxtView08 = findViewById(R.id.toppingTxtView08);

//        linking customer promprt textViews and plain text
        customerPromptTxtView01 = findViewById(R.id.customerPromptTxtView01);
        customerQ1PlainText = findViewById(R.id.customerQ1PlainTxt01);
        customerQ2PhoneTxt = findViewById(R.id.customerQ2TxtPhone01);
        customerQ3PostalAddrTxt = findViewById(R.id.customerQ3TxtPostalAddress);

//        switch
        toggleSwitch = findViewById(R.id.toggleSwitch);

    }
}