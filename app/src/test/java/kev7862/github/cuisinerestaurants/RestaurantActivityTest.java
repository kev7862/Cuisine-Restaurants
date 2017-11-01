package kev7862.github.cuisinerestaurants;

import android.os.Build;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by matite on 11/1/17.
 */

// Adedd Annotations to enable our tests to run natively in the JVM instead of the android device
@Config(manifest = "app/src/main/AndroidManifest.xml", constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)

public class RestaurantActivityTest {


}
