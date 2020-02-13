package com.app.businessapp.Helper;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.app.businessapp.R;
import com.google.android.material.snackbar.Snackbar;

public class Constant {
    public static void showMessage(Activity context, String message) {

        Snackbar snackbar;

        snackbar = Snackbar.make(context.getWindow().getDecorView().findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG);
        View snackBarView = snackbar.getView();
        snackBarView.setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
        TextView textView = (TextView) snackBarView.findViewById(com.google.android.material.R.id.snackbar_text);
        textView.setTextColor(context.getResources().getColor(R.color.white));
        snackbar.show();
    }
}
