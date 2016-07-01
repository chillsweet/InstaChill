package com.chillsweet.instachill;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.chillsweet.instachill.databinding.ActivityMainBinding;
import com.chillsweet.instachill.fragment.MainFragmentActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    private ActivityMainBinding binding;

    private Activity activity = MainActivity.this;

//    private Toolbar myToolbar;
//    private ImageButton btnInbox;

    private Fragment fragment = null;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);

        setSupportActionBar(binding.customToolbar.myToolbar);
        binding.customToolbar.myToolbar.setContentInsetsAbsolute(0, 0);

//        myToolbar.setLogo(R.drawable.insta);
//        myToolbar.setTitle("");
//
//        // Get a support ActionBar corresponding to this toolbar
//        ActionBar ab = getSupportActionBar();
//        ab.setLogo(R.drawable.insta);
//        ab.setTitle("");


        fragmentManager = getSupportFragmentManager();

        binding.customToolbar.btnInbox.setOnClickListener(this);
        binding.btnHome.setOnClickListener(this);
        binding.btnSearch.setOnClickListener(this);
        binding.btnPhoto.setOnClickListener(this);
        binding.btnFavourite.setOnClickListener(this);
        binding.btnProfile.setOnClickListener(this);

        setBottomMenu(1);

    }

    private void setBottomMenu(int itemSelect) {

        if (itemSelect == 1) {

            fragment = new MainFragmentActivity().newInstance();
            fragmentManager.beginTransaction().replace(R.id.frameLayout_pages, fragment).commit();

            binding.imgHome.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.black));
            binding.imgSearch.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
            binding.imgPhoto.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
            binding.imgFavourite.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
            binding.imgProfile.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
        }
        else if (itemSelect == 2) {
            binding.imgHome.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
            binding.imgSearch.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.black));
            binding.imgPhoto.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
            binding.imgFavourite.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
            binding.imgProfile.setColorFilter(ContextCompat.getColor(getApplicationContext(), R.color.silver));
        }
        else if (itemSelect == 3) {
            binding.imgHome.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgSearch.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgPhoto.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.black));
            binding.imgFavourite.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgProfile.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
        }
        else if (itemSelect == 4) {
            binding.imgHome.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgSearch.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgPhoto.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgFavourite.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.black));
            binding.imgProfile.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
        }
        else if (itemSelect == 5) {
            binding.imgHome.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgSearch.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgPhoto.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgFavourite.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.silver));
            binding.imgProfile.setColorFilter(ContextCompat.getColor(getBaseContext(), R.color.black));
        }

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.activity_menu, menu);
//        new Handler().post(new Runnable() {
//            @Override
//            public void run() {
//                final View v = findViewById(R.id.action_inbox);
//
//                if (v != null) {
//                    v.setOnLongClickListener(new View.OnLongClickListener() {
//                        @Override
//                        public boolean onLongClick(View v) {
//                            return false;
//                        }
//                    });
//                }
//            }
//        });
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//
//            case R.id.action_inbox:
//                // User chose the "Favorite" action, mark the current item
//                // as a favorite...
//                Log.d(TAG, "onOptionsItemSelected: Inbox");
//                return true;
//
//            default:
//                // If we got here, the user's action was not recognized.
//                // Invoke the superclass to handle it.
//                return super.onOptionsItemSelected(item);
//
//        }
//
//    }

    @Override
    public void onClick(View v) {

        if (v.equals(binding.btnHome)) {
            setBottomMenu(1);
        }
        else if (v.equals(binding.btnSearch)) {
            setBottomMenu(2);
        }
        else if (v.equals(binding.btnPhoto)) {
            setBottomMenu(3);
        }
        else if (v.equals(binding.btnFavourite)) {
            setBottomMenu(4);
        }
        else if (v.equals(binding.btnProfile)) {
            setBottomMenu(5);
        }

    }
}
