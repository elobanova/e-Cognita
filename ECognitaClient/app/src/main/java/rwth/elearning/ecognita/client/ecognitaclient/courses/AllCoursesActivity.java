package rwth.elearning.ecognita.client.ecognitaclient.courses;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;

import rwth.elearning.ecognita.client.ecognitaclient.R;

/**
 * Created by ekaterina on 12.06.2015.
 */
public class AllCoursesActivity extends MyCoursesActivity {
    private static final String ALL_TAB_TAG = "ALL";
    private static final String NEW_TAB_TAG = "NEW";

    private FragmentTabHost fragmentTabHost;

    @Override
    protected void initActivity(Bundle savedInstanceState) {
        setContentView(R.layout.activity_all_courses);
        prepareSlidingMenu(R.id.all_availbale_courses_frame_container);

        fragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        fragmentTabHost.setup(this, getSupportFragmentManager(), R.id.realcoursetabcontent);

        //TODO: create NewCoursesFragment for the first tab, fo now showing all courses from both tabs
        fragmentTabHost.addTab(fragmentTabHost.newTabSpec(NEW_TAB_TAG).setIndicator(getString(R.string.new_courses_tab_label)),
                AllCoursesFragment.class, null);
        fragmentTabHost.addTab(fragmentTabHost.newTabSpec(ALL_TAB_TAG).setIndicator(getString(R.string.all_courses_tab_label)),
                AllCoursesFragment.class, null);

    }
}
