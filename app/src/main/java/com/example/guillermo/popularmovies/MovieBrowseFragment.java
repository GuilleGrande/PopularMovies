package com.example.guillermo.popularmovies;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Guillermo Grande on 20-Jul-16.
 */
public class MovieBrowseFragment extends Fragment {

    private MovieBrowseAdapter mMovieBrowseAdapter;
    private GridView mGridView;

    private static final String LOG_TAG = MovieBrowseFragment.class.getSimpleName();

    public MovieBrowseFragment() {}

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // This fragment shouuld handle menu events
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        // Inflate fragment menu
        inflater.inflate(R.menu.fragment_movie_browse, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle menu events
        switch(item.getItemId())
        {
            case R.id.action_order_popularity:
                // add call to action order by popularity
            break;
            case R.id.action_order_newest:
                // add call to action order by top rated
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate movie browse fragment to the view
        View rootView = inflater.inflate(R.layout.fragment_movie_browse, container, false);


        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /*public void callToOrderBy (int id){

        if (id == 0)
        {
            MovieBrowseAdapter.orderByPopularity(getActivity());
        }
        else
        {
            MovieBrowseAdapter.orderByTopRated(getActivity());
        }
    }*/
}
