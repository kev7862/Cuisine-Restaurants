package kev7862.github.cuisinerestaurants;

import android.os.Build;
import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by matite on 11/1/17.
 */

// Added Annotations to enable our tests to run natively in the JVM instead of the android device
@Config(manifest = "app/src/main/AndroidManifest.xml", constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class RestaurantActivityTest {

    private ListView mRestaurantListView;
    private RestaurantsActivity activity;

// We're Configuring the RestaurantActivity Class to know from where we're running the test from
    @Before
    public void setup(){
        activity = Robolectric.setupActivity(RestaurantsActivity.class);
        mRestaurantListView = (ListView) activity.findViewById(R.id.restaurant);
    }

    @Test
    public void restaurantListViewPopulates(){
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(), 26);
    }


}
