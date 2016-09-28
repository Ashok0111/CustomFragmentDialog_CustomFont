package com.git.ashok.customdialogbox;

import android.app.Dialog;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class CustomDialogFragment extends android.support.v4.app.DialogFragment {

    TextView tv, tit;
    String rmsg, ti;

    public void CustomDialogFragment(String s, String t) {

        rmsg = s;
        ti = t;
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {


        Log.w("", "dialog on create");

        Dialog dialog = new Dialog(getActivity());

        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        dialog.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN);

        dialog.setContentView(R.layout.dialog_custom);
        Typeface custom_font = Typeface.createFromAsset(getActivity().getAssets(), "OpenSans-Light.ttf");


        tv = (TextView) dialog.findViewById(R.id.textmsg);
        tit = (TextView) dialog.findViewById(R.id.title);

        tv.setText(rmsg);
        tit.setText(ti);
        tv.setTypeface(custom_font);
        tit.setTypeface(custom_font);

        dialog.findViewById(R.id.positive_button).setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                dismiss();

            }

        });


        return dialog;

    }


}

