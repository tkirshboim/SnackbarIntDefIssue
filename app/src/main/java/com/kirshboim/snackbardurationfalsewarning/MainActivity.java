package com.kirshboim.snackbardurationfalsewarning;

import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View container = findViewById(R.id.container);

        createSnackbar(container, "Lint is my friend.", Snackbar.LENGTH_LONG).show();
    }
    @NonNull
    private Snackbar createSnackbar(View view, String message, @Snackbar.Duration int duration) {
        return Snackbar.make(view, message, duration);
    }
}
