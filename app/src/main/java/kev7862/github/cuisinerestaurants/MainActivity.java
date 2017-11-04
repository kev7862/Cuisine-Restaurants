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

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.findRestaurantsButton) Button mFindRestaurants;
    @Bind(R.id.locationEditText) EditText mLocation;
    @Bind(R.id.textView) TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// Using ButtterKnife to locate our view by there specific ids
        ButterKnife.bind(this);

// Custom Fonts code
Typeface custom = Typeface.createFromAsset(getAssets(), "fonts/cartel.ttf");
        mTextView.setTypeface(custom);

mFindRestaurants.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        String location = mLocation.getText().toString();
        Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
        intent.putExtra("location", location);
        startActivity(intent);
    }
});

    }
}
