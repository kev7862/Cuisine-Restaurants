package kev7862.github.cuisinerestaurants;

import android.content.Intent;
import android.graphics.Typeface;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mFindRestaurants;
    private EditText mLocation;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // finding view by its id.
        final EditText mLocation = (EditText)findViewById(R.id.locationEditText);
        Button mFindRestaurants = (Button)findViewById(R.id.findRestaurantsButton);
//       TextView textView = (TextView)findViewById(R.id.textView);

// Custom Fonts code
        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/cartel.ttf");
        Typeface custom = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
//        textView.setTypeface(customFont);
        mFindRestaurants.setTypeface(custom);

       mFindRestaurants.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // Click Button code here.
               String location = mLocation.getText().toString();
               Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
               intent.putExtra("location", location);
               startActivity(intent);
           }
       });

    }
}
