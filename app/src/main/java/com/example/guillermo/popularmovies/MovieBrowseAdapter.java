package com.example.guillermo.popularmovies;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;

import com.example.guillermo.popularmovies.data.Movie;

import java.util.ArrayList;

/**
 * Created by Guillermo Grande on 20-Jul-16.
 */
public class MovieBrowseAdapter extends BaseAdapter{

    ArrayList<Movie> movieArrayList;

    public MovieBrowseAdapter(Context context){
        movieArrayList = new ArrayList<Movie>();
        Resources resources = context.getResources();

        String[] movieNames = resources.getStringArray(R.array.movie_names);
        int[] moviePosters =  { R.drawable.assassin_movie_poster,
                                R.drawable.batman_v_superman_movie_poster,
                                R.drawable.big_miracle_movie_poster,
                                R.drawable.captain_america_movie_poster,
                                R.drawable.fight_club_movie_poster,
                                R.drawable.grey_movie_poster,
                                R.drawable.in_the_heart_of_the_sea_movie_poster,
                                R.drawable.inception_movie_poster,
                                R.drawable.keanu_movie_poster,
                                R.drawable.lion_king_movie_poster,
                                R.drawable.salt_movie_poster,
                                R.drawable.the_martian_movie_poster,
                                R.drawable.titanic_movie_poster,
                                R.drawable.warcraft_movie_poster };

        for (int i = 0; i < 14; i++){
            Movie tempMovie = new Movie(moviePosters[i], movieNames[i]);
            movieArrayList.add(tempMovie);
        }
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public void orderByPopularity(Context context){

    }

    public void orderByTopRated(Context context){

    }
}
