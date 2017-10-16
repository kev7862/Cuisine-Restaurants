package kev7862.github.cuisinerestaurants;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mFindRestaurants;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mFindRestaurants = (Button)findViewById(R.id.findRestaurantsButton);
        TextView textView = (TextView)findViewById(R.id.textView);

        Typeface customFont = Typeface.createFromAsset(getAssets(), "fonts/cartel.ttf");
        Typeface custom = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        textView.setTypeface(customFont);
        mFindRestaurants.setTypeface(custom);

       mFindRestaurants.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               // Click Button code here.
               Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG).show();
           }
       });

    }
}
