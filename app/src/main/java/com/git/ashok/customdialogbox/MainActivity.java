package com.git.ashok.customdialogbox;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {
    Button b;
    FragmentManager fm = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button3);
    }

    public void show(View v) {
        Log.w("", "button");
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        CustomDialogFragment alertdFragment = new CustomDialogFragment();
        String s = "Message";
        String t = "Title";
        alertdFragment.CustomDialogFragment(s, t);
        alertdFragment.setCancelable(false);
        alertdFragment.show(fm, "");
        Log.w("", "end of button");
    }
}
