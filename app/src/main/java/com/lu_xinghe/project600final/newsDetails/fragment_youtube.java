package com.lu_xinghe.project600final.newsDetails;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.lu_xinghe.project600final.R;

import java.util.HashMap;

/**
 * Created by Charles on 6/15/2015.
 */
public class fragment_youtube extends Fragment implements YouTubePlayer.OnInitializedListener{
    private static final String ARG_NEWS="news";
    private int RECOVERY_DIALOG_REQUEST = 1;
    //MovieDataJsonLocal movieData;
    YouTubePlayer mPlayer;
    String mVideoId;
    HashMap news;
    public static fragment_youtube newInstance(HashMap<String, String> news){
        fragment_youtube fragment = new fragment_youtube();
        Bundle args = new Bundle();
        args.putSerializable(ARG_NEWS, news);
        fragment.setArguments(args);
        return fragment;
    }
    public fragment_youtube(){
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
       // movieData=new MovieDataJsonLocal();
       // movieData.loadLocalMovieDataJson(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView;
//        HashMap moviedata=(HashMap)getArguments().getSerializable(ARG_MOVIE_DATA);

//        getActivity().setTitle("Movie Show");
        rootView=inflater.inflate(R.layout.fragment_youtube, container, false);
        if(getArguments()!=null){
            news=(HashMap<String, String>)getArguments().getSerializable(ARG_NEWS);
        }
        mVideoId = (String)news.get("youTubeMovieId");
//        mVideoId = "8b3yNKSBDEg";
        YouTubePlayerSupportFragment playerFragment =
                (YouTubePlayerSupportFragment) getChildFragmentManager().findFragmentById(R.id.moviePlayer);
        playerFragment.initialize(getString(R.string.google_maps_key),this);

//        String moviedescription = (String)moviedata.get("description");
//        String movieName = (String)moviedata.get("name");
//        String length = (String)moviedata.get("length");
//        double dRating = (double)moviedata.get("rating");

//        float fRating = (float)dRating/2.0f;
//        RatingBar movierating = (RatingBar) rootView.findViewById(R.id.ratingBar);
//        movierating.setRating(fRating);
//
//        TextView moviedsp=(TextView)rootView.findViewById(R.id.desc);
//        moviedsp.setText(moviedescription);
//
//        TextView len =(TextView)rootView.findViewById(R.id.length);
//        len.setText(length);
//
//        TextView title = (TextView)rootView.findViewById(R.id.title);
//        title.setText(movieName);

        return rootView;
    }
    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean restored) {

        mPlayer=youTubePlayer;
        //Here we can set some flags on the player

        //This flag tells the player to switch to landscape when in fullscreen, it will also return to portrait
        //when leaving fullscreen
        mPlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION);

        //This flag tells the player to automatically enter fullscreen when in landscape. Since we don't have
        //landscape layout for this activity, this is a good way to allow the user rotate the video player.
        mPlayer.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);

        //This flag controls the system UI such as the status and navigation bar, hiding and showing them
        //alongside the player UI
        mPlayer.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_SYSTEM_UI);

        if (mVideoId != null) {
            if (restored) {
                mPlayer.play();
            } else {
                mPlayer.loadVideo(mVideoId);
            }
        }
    }
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if (youTubeInitializationResult.isUserRecoverableError()) {
            youTubeInitializationResult.getErrorDialog(getActivity(), RECOVERY_DIALOG_REQUEST).show();
        } else {
            //Handle the failure
            Toast.makeText(getActivity(), "onInitializationFailure", Toast.LENGTH_LONG).show();
        }
    }
}
