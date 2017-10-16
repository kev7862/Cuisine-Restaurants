package kev7862.github.cuisinerestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {

    TextView mLocationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        //Initializing my view
        TextView mLocationView = (TextView)findViewById(R.id.restaurantsText);

       Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationView.setText("Here are all the restaurants near: " + location);

    }
}
