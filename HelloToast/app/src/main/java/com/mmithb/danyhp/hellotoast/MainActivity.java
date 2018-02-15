package com.mmithb.danyhp.hellotoast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }


    /*
    * When the TOAST button is clicked, show a toast.
    *
    * @param view The view that triggers this onClick handler.
    * Since a toast always shows on the top, view is not used.
    * */
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }

    /*
    * When the COUNT button is clicked, increase the Count Number.
    *
    * @param view The view that triggers this onClick handler.
    * Since a toast always shows on the top, view is not used.
     */
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    /*
    * When the RESET button is clicked, Reset the Count Number.
    *
    * @param view The view that triggers this onClick handler.
    * Since a toast always shows on the top, view is not used.
     */
    public void countReset(View view) {
        mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showPoke(View view) {
        Toast poke = Toast.makeText(this, R.string.poke_message, Toast.LENGTH_LONG);
        poke.show();
    }
}
