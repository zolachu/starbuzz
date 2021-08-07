package com.zolachu.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINKNO = "drink_no";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkNo = getIntent().getExtras().getInt(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        String drinkName = drink.getName();
        String drinkDescription = drink.getDescription();
        int drinkImageResourceId = drink.getImageResourceId();

        TextView tvName = findViewById(R.id.name);
        TextView tvDescription = findViewById(R.id.description);
        ImageView ivPhoto = findViewById(R.id.photo);

        tvName.setText(drinkName);
        tvDescription.setText(drinkDescription);
        ivPhoto.setImageResource(drinkImageResourceId);

        ivPhoto.setContentDescription(drink.getName());
    }
}