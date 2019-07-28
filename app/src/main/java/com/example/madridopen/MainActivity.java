package com.example.madridopen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.madridopen.fragments.CardsFavListFragment;
import com.example.madridopen.fragments.CardsListFragment;
import com.example.madridopen.fragments.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bnv = findViewById(R.id.navigation);
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectFragment(menuItem);
                return true;
            }
        });
        bnv.setSelectedItemId(R.id.navigation_home);
    }

    private void selectFragment(MenuItem menuItem) {
Log.d("main", "selectfraf");
        Fragment fragmentClicked = null;
        Boolean isDualOption = true;

        switch (menuItem.getItemId()) {
            case R.id.navigation_home:
                Log.d("main", "home");
                fragmentClicked = CardsListFragment.Companion.newInstance();
                isDualOption = false;
                this.loadFragment(fragmentClicked, isDualOption);
                break;
            case R.id.navigation_favorites:
                fragmentClicked = CardsFavListFragment.Companion.newInstance();
                isDualOption = false;
                this.loadFragment(fragmentClicked, isDualOption);

                break;
            case R.id.navigation_settings:
                fragmentClicked = SettingsFragment.Companion.newInstance();
                isDualOption = false;
                this.loadFragment(fragmentClicked, isDualOption);
                break;

            default:
                fragmentClicked = CardsListFragment.Companion.newInstance();
                this.loadFragment(fragmentClicked, isDualOption);
        }


    }


    private void loadFragment(Fragment fr, boolean isDual) {
Log.d("load", "1");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flContent, fr);

        FrameLayout layout = (FrameLayout) findViewById(R.id.flDetail);
        FrameLayout layout1 = (FrameLayout) findViewById(R.id.flContent);

        if (layout != null) {
            Log.d("load", "2");
            android.view.ViewGroup.LayoutParams params = layout1.getLayoutParams();
            if (!isDual) {
                Log.d("dual", "no es dual");
                layout.setVisibility(View.GONE);
                params.width = FrameLayout.LayoutParams.MATCH_PARENT;
                layout1.setLayoutParams(params);
            } else {
                Log.d("dual", "es dual");
                //params.width = 700;
                // layout1.setLayoutParams(params);
                layout.setVisibility(View.VISIBLE);
            }

        }
        Log.d("load", "3");
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit();
    }

}

