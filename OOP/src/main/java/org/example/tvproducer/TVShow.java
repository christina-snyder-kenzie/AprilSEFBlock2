package org.example.tvproducer;

import java.util.ArrayList;

public class TVShow {
    private String title, genre, summary, rating;
    private ArrayList<Episode> episodes;
    private ArrayList<CastMember> cast;

    public TVShow(String title, String genre, String summary, String rating, ArrayList<Episode> episodes, ArrayList<CastMember> cast) {
        this.title = title;
        this.genre = genre;
        this.summary = summary;
        this.rating = rating;
        this.episodes = episodes;
        this.cast = cast;
    }

    //fire method!
    //hire method
    //

    @Override
    public String toString() {
        return "TVShow\n{" +
                "title='" + title + "'" +
                ", genre='" + genre + '\'' +
                ", summary='" + summary + '\'' +
                ", rating='" + rating + '\'' +
                ", episodes=" + episodes +
                ", cast=" + cast +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }

    public ArrayList<CastMember> getCast() {
        return cast;
    }

    public void setCast(ArrayList<CastMember> cast) {
        this.cast = cast;
    }
}
