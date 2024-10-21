package com.example.e_comic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.e_comic.databinding.ActivityBerandaBinding;
import com.example.e_comic.databinding.ActivityMainBinding;

public class beranda extends AppCompatActivity {

    ActivityBerandaBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityBerandaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    replaceFragment(new HomeFragment());
                    break;
                case R.id.trending:
                    replaceFragment(new HotFragment());
                    break;
                case R.id.bookmark:
                    replaceFragment(new BookmarkFragment());
                    break;
                case R.id.prof:
                    replaceFragment(new ProfileFragment());
                    break;
            }


            return true;
        });
    }
    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.beranda,fragment);
        fragmentTransaction.commit();
    }
}