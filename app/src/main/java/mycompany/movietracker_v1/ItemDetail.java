package mycompany.movietracker_v1;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



public class ItemDetail extends Activity {

    public static final Integer[] images = {R.drawable.proposal,
            R.drawable.bat, R.drawable.alvin, R.drawable.myb, R.drawable.kapoor};

    public static final Integer[] imagesHome = {R.drawable.home_alone2,
            R.drawable.danny, R.drawable.rodeo, R.drawable.stallion, R.drawable.horse};


    public static final Integer[] imagesEng = {R.drawable.avatar,
            R.drawable.spectre, R.drawable.inside, R.drawable.frozen, R.drawable.year};

    public static final Integer[] imagesInter = {R.drawable.a_moment,
            R.drawable.human, R.drawable.god, R.drawable.taxi, R.drawable.wonder};


    String[] movieName;
    String[] movieNameHome;
    String[] movieNameEng;
    String[] movieNameInter;

    String[] movieWhen;
    String[] movieWhere;
    Integer moviePosition;


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
        moviePosition = (Integer) getIntent().getExtras().get("movieId");
        String movieType = (String) getIntent().getExtras().get("movieType");

        switch (movieType) {
            case "Home":
                movieName = getResources().getStringArray(R.array.movieNameHome);
                imgMovieIcon.setImageResource(imagesHome[moviePosition]);
                break;
            case "Eng":
                movieName = getResources().getStringArray(R.array.movieNameEng);
                imgMovieIcon.setImageResource(imagesEng[moviePosition]);
                break;
            case "Inter":
                movieName = getResources().getStringArray(R.array.movieNameInter);
                imgMovieIcon.setImageResource(imagesInter[moviePosition]);
                break;

            default:
                movieName = getResources().getStringArray(R.array.movieName);
                imgMovieIcon.setImageResource(images[moviePosition]);
        }
        String dataMovieName = movieName[moviePosition];
        String dataMovieWhen = movieWhen[moviePosition];
        String dataMovieWhere = movieWhere[moviePosition];


        // displaying selected Movie name
        txtMovieName.setText(dataMovieName);
        txtMovieWhen.setText(dataMovieWhen);
        txtMovieWhere.setText(dataMovieWhere);
        // imgMovieIcon.setImageResource(images[moviePosition]);


    }


    // Method to send SMS using SMS Manager
    public void onSMSClick(View view) {
        //Declare the button and the tetviews to input number and the message
        ImageView smsIcon = (ImageView) findViewById(R.id.smsIcon);
        EditText txtphoneNo = (EditText) findViewById(R.id.editTextPhoneNo);
        EditText txtMessage = (EditText) findViewById(R.id.editTextSMS);

        Log.i("Send SMS", "");

        String phoneNo = txtphoneNo.getText().toString();
        String message = txtMessage.getText().toString();

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "SMS faild, please try again.",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


    public void onClickGoogleSrch(View arg0) {
        // Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.putExtra(SearchManager.QUERY, movieName[moviePosition]); // query contains search string
        startActivity(intent);
        // startActivity(browserIntent);
    }

    public void onClickHome(View arg0) {
        Intent intent = new Intent(ItemDetail.this, Category.class);
        startActivity(intent);
        finish();
    }


    public void onClickLocation(View arg0) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + movieWhere[moviePosition]);
        // Uri gmmIntentUri = Uri.parse("geo:0,0?q=Princeton,NJ");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

        // Uri geoLocation = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway%2C+CA");
        // Intent intent1 = new Intent(Intent.ACTION_VIEW,geoLocation);
        // Intent intent1 = intent.setData(geoLocation);
        // intent1.setPackage("com.google.android.apps.maps");
        // if (intent1.resolveActivity(getPackageManager()) != null) {
        //  startActivity(intent1);
        // }

        // String geoLocation = "http://maps.google.com/maps?q=" + movieWhere[moviePosition];
        // Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoLocation));
        // startActivity(mapIntent);
    }
}