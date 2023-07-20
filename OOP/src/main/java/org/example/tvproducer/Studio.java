package org.example.tvproducer;

import java.util.ArrayList;

public class Studio {
    public static void main(String[] args) {
        String myTitle = "Grey's Anatomy";
        String myGenre = "Drama";
        String mySummary = "Terrible things happen to medical professionals";
        String myRating = "TV14";

        ArrayList<Episode> myEpisodes = new ArrayList<Episode>();
        Episode e1 = new Episode("The plane crash one", "There was a horrific plane crash");
        Episode e2 = new Episode("Pilot", "20 Years Ago", "Medical interns start their job");
        myEpisodes.add(e2);
        myEpisodes.add(e1);

        ArrayList<CastMember> myCast = new ArrayList<CastMember>();
        myCast.add(new CastMember("Meredith Grey", "Ellen Pompeo"));
        myCast.add(new CastMember("Christina Yang", "Sandra Oh"));

        TVShow greys = new TVShow(myTitle, myGenre, mySummary, myRating, myEpisodes, myCast);
        System.out.println(greys);


    }
}
