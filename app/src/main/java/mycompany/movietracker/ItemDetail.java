package mycompany.movietracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;



public class ItemDetail extends Activity {

    public static final Integer[] images = {R.drawable.proposal,
            R.drawable.bat, R.drawable.alvin, R.drawable.myb, R.drawable.kapoor};
    String[] movieName;
    String[] movieWhen;
    String[] movieWhere;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.item_detail);

        TextView txtMovieName = (TextView) findViewById(R.id.movieName);
        TextView txtMovieWhen = (TextView) findViewById(R.id.movieWhen);
        TextView txtMovieWhere = (TextView) findViewById(R.id.movieWhere);
        ImageView imgMovieIcon = (ImageView) findViewById(R.id.icon);

        movieName = getResources().getStringArray(R.array.movieName);
        movieWhen = getResources().getStringArray(R.array.movieWhen);
        movieWhere = getResources().getStringArray(R.array.movieWhere);

        Intent i = getIntent();
        // getting attached intent data
        // Integer moviePosition = Integer.parseInt(i.getStringExtra("movieId"));
        Integer moviePosition = (Integer) getIntent().getExtras().get("movieId");
        /* String movieName = i.getStringExtra("movieName");
        String movieWhen = i.getStringExtra("movieWhen");
        String movieWhere = i.getStringExtra("movieWhere");
        */

        String dataMovieName = movieName[moviePosition];
        String dataMovieWhen = movieWhen[moviePosition];
        String dataMovieWhere = movieWhere[moviePosition];


        // displaying selected Movie name

        txtMovieName.setText(dataMovieName);
        txtMovieWhen.setText(dataMovieWhen);
        txtMovieWhere.setText(dataMovieWhere);
        imgMovieIcon.setImageResource(images[moviePosition]);

    }
}