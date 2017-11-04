package kev7862.github.cuisinerestaurants;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by matite on 11/3/17.
 */

public class RestaurantsActivityInstrumentationTest {

    @Rule
    public ActivityTestRule <RestaurantsActivity> activityTestRule =
            new ActivityTestRule<RestaurantsActivity>(RestaurantsActivity.class);

    @Test
    public void onItemClickToast() {
        View activityDecorView = activityTestRule.getActivity().getWindow().getDecorView();

        String restaurantName = "Movical";
        onData(anything())
                .inAdapterView(withId(R.id.restaurant))
                .atPosition(0)
                .perform(click());

        onView(withText(restaurantName)).inRoot(withDecorView(not(activityDecorView)))
                .check(matches(withText(restaurantName)));
    }
}
