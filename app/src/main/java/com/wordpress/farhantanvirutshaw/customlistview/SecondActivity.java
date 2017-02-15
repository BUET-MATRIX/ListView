package com.wordpress.farhantanvirutshaw.customlistview;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mToolbar = (Toolbar)findViewById(R.id.toolbar1);
        flag = (ImageView)findViewById(R.id.imageView);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null)
        {
            mToolbar.setTitle(bundle.getString("carName"));
            String carName = mToolbar.getTitle().toString();
            int carImageId =0;
            switch (carName)
            {
                case "TOYOTA":
                    carImageId = R.drawable.sample;
                    break;
                case "AUDI":
                    carImageId = R.drawable.sample2;
                    break;
                case "FORD":
                    carImageId = R.drawable.sample3;
                    break;
                case "ROLLS ROYCE":
                    carImageId = R.drawable.sample4;
                    break;
                case "BUGATTI":
                    carImageId = R.drawable.sample5;
                    break;
            }
            flag.setImageDrawable(ContextCompat.getDrawable(SecondActivity.this,carImageId));
        }

    }
}
