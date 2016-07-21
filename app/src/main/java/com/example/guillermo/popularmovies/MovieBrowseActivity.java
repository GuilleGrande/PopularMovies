package com.example.guillermo.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MovieBrowseActivity extends AppCompatActivity
{
    private final String LOG_TAG = MovieBrowseActivity.class.getSimpleName();
    private static final String MOVIEBROWSERFRAGMENT_TAG = "MBF_TAG";

    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "CREATE");
        setContentView(R.layout.activity_movie_browse);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(LOG_TAG, "DESTROY");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(LOG_TAG, "START");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(LOG_TAG, "STOP");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(LOG_TAG, "PAUSE");
    }
}
