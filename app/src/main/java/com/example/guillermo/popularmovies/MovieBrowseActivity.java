package com.example.guillermo.popularmovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

public class MovieBrowseActivity extends AppCompatActivity {
    private final String LOG_TAG = MovieBrowseActivity.class.getSimpleName();
    private static final String MOVIEBROWSERFRAGMENT_TAG = "MBF_TAG";

    private GridView mGridView;
    private MovieBrowseAdapter mMovieBrowseAdapter;
    private boolean mTwoPane;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mMovieBrowseAdapter = new MovieBrowseAdapter(this);
        mGridView = (GridView) findViewById(R.id.grid_view_movie_browse);
        mGridView.setAdapter(mMovieBrowseAdapter);
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
