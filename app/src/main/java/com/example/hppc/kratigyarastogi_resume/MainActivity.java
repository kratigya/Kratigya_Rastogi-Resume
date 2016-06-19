package com.example.hppc.kratigyarastogi_resume;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.example.hppc.kratigyarastogi_resume.Fragment.AboutMeFragment;
import com.example.hppc.kratigyarastogi_resume.Fragment.AchievementsFragment;
import com.example.hppc.kratigyarastogi_resume.Fragment.PositionFragment;
import com.example.hppc.kratigyarastogi_resume.Fragment.ProjectFragment;
import com.example.hppc.kratigyarastogi_resume.Fragment.QualificationFragment;
import com.example.hppc.kratigyarastogi_resume.Fragment.SkillsFragment;
import com.example.hppc.kratigyarastogi_resume.Fragment.VolunteerFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, QualificationFragment.OnFragmentInteractionListener,
        ProjectFragment.OnProjectFragmentInteractionListener {

    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        if (drawer != null) {
            drawer.setDrawerListener(toggle);
        }
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }

        Fragment aboutMeFragment = new AboutMeFragment();
        transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_1, aboutMeFragment, "About Me");
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        ActionBar actionBar = getSupportActionBar();
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        }

        if (id == R.id.aboutme) {
            Fragment aboutMeFragment = new AboutMeFragment();
            fragmentTransaction.replace(R.id.fragment_1, aboutMeFragment, "About Me");
            if (actionBar != null) {
                actionBar.setTitle(R.string.about_me);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3F51B5")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(Color.parseColor("#303F9F"));
                }
            }

        } else if (id == R.id.eduqual) {
            Fragment qualificationFragment = new QualificationFragment();
            fragmentTransaction.replace(R.id.fragment_1, qualificationFragment, "Education");
            if (actionBar != null) {
                actionBar.setTitle(R.string.educational_qualifications);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#009688")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(getResources().getColor(R.color.dark_teal));
                }
            }

        } else if (id == R.id.skills) {
            Fragment skillFragment = new SkillsFragment();
            fragmentTransaction.replace(R.id.fragment_1, skillFragment, "Technical Skills");
            if (actionBar != null) {
                actionBar.setTitle(R.string.technical_skills);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF9800")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(Color.parseColor("#F57C00"));
                }
            }

        } else if (id == R.id.projets) {
            Fragment projectFragment = new ProjectFragment();
            fragmentTransaction.replace(R.id.fragment_1, projectFragment, "Projects");
            if (actionBar != null) {
                actionBar.setTitle(R.string.projects);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#7A1EA1")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(Color.parseColor("#691A99"));
                }
            }

        } else if (id == R.id.volunteer) {
            Fragment volunteerFragment = new VolunteerFragment();
            fragmentTransaction.replace(R.id.fragment_1, volunteerFragment, "Volunteer Experience");
            if (actionBar != null) {
                actionBar.setTitle(R.string.volunteer_experience);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#8BC34A")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(Color.parseColor("#689F38"));
                }
            }

        } else if (id == R.id.achievements) {
            Fragment achievementsFragment = new AchievementsFragment();
            fragmentTransaction.replace(R.id.fragment_1, achievementsFragment, "Achievements");
            if (actionBar != null) {
                actionBar.setTitle(R.string.achievements);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E91E63")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(Color.parseColor("#C2185B"));
                }
            }
        } else if (id == R.id.position) {
            Fragment positionFragment = new PositionFragment();
            fragmentTransaction.replace(R.id.fragment_1, positionFragment, "Position Of Responsibility");
            if (actionBar != null) {
                actionBar.setTitle(R.string.position_of_responsibility);
                actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#F44336")));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    window.setStatusBarColor(Color.parseColor("#D32F2F"));
                }
            }

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer != null) {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onProjectFragmentInteraction(Uri uri) {

    }
}