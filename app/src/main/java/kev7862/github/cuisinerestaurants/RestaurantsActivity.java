package kev7862.github.cuisinerestaurants;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RestaurantsActivity extends AppCompatActivity {

    TextView mLocationView;
    ListView mListView;
    private String[] restaurants = new String[] {"Movical", "Tribeka", "Mojos", "Rafikiz", "Reminisce", "Psys", "Totillaz", "Ramadhan", "Hilton", "Serena", "White Sands", "Sarova", "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        // locating my textView by its specific id
        TextView mLocationView = (TextView)findViewById(R.id.restaurantsText);
        ListView mListview = (ListView)findViewById(R.id.restaurant);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
        mListview.setAdapter(adapter);

        mListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String restaurants = ((TextView) view).getText().toString();
                Toast.makeText(RestaurantsActivity.this, restaurants, Toast.LENGTH_LONG).show();
            }
        });

       Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationView.setText("Here are all the restaurants near: " + location);

    }
}
