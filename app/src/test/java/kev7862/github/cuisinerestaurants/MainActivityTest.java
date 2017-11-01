package kev7862.github.cuisinerestaurants;

import android.content.Intent;
import android.os.Build;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static junit.framework.Assert.assertTrue;

/**
 * Created by matite on 10/16/17.
 */
// Added annotations to allow our code to run natively in the JVM  instead of the android device.
@Config(manifest = "app/src/main/AndroidManifest.xml", constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class MainActivityTest {

//configuring MainActivityTest class to know which activity we're running a test from
    private MainActivity activity;

    @Before
    public void setup() {

        activity = Robolectric.setupActivity(MainActivity.class);

    }

    @Test
    public void validateTextViewContent() {
        TextView textView  = (TextView) activity.findViewById(R.id.textView);

        assertTrue("Cuisine Restaurants".equals(textView.getText().toString()));
    }
// running a shadow test
    @Test
    public void secondActivityStarted() {
        activity.findViewById(R.id.findRestaurantsButton).performClick();
        Intent expectedIntent = new Intent(activity, RestaurantsActivity.class);
        ShadowActivity shadowActivity = org.robolectric.Shadows.shadowOf(activity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        assertTrue(actualIntent.filterEquals(expectedIntent));
    }

}
