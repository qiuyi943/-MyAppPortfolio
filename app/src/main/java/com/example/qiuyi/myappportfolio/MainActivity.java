package com.example.qiuyi.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.qiuyi.myappportfolio.R.id.BuildItBiggerButton;

public class MainActivity extends AppCompatActivity {
    Button popularMovieButton;
    Button buildItBiggerButton;
    Button gapstoneButton;
    Button goUbiquitousButton;
    Button makeYourAppMaterialButton;
    Button stockHawkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appButtonOnClickListener buttonListener = new appButtonOnClickListener();

        popularMovieButton = (Button)findViewById(R.id.PopularMovieButton);
        stockHawkButton = (Button)findViewById(R.id.StockHawkButton);
        buildItBiggerButton = (Button) findViewById(R.id.BuildItBiggerButton);
        gapstoneButton = (Button)findViewById(R.id.GapstoneButton);
        goUbiquitousButton = (Button)findViewById(R.id.GoUbiquitousButton);
        makeYourAppMaterialButton = (Button)findViewById(R.id.MakeYourAppMaterialButton);

        popularMovieButton.setOnClickListener(buttonListener);
        stockHawkButton.setOnClickListener(buttonListener);
        buildItBiggerButton.setOnClickListener(buttonListener);
        gapstoneButton.setOnClickListener(buttonListener);
        goUbiquitousButton.setOnClickListener(buttonListener);
        makeYourAppMaterialButton.setOnClickListener(buttonListener);
    }

    class appButtonOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.PopularMovieButton:
                    showToastPopularMovie(view);
                    break;
                case BuildItBiggerButton:
                    break;
                case R.id.GapstoneButton:
                    break;
                case R.id.GoUbiquitousButton:
                    break;
                case R.id.MakeYourAppMaterialButton:
                    break;
                case R.id.StockHawkButton:
                    break;
                default:
                    break;
            }
        }

        private void showToastPopularMovie(View view) {
            Toast toast = Toast.makeText(getApplicationContext(), "Popular Movie Message",
                    Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
