package org.example.tvproducer;

public class Episode {
    private String title, airDate, plot;

    public Episode(String title, String airDate, String plot) {
        this.title = title;
        this.airDate = airDate;
        this.plot = plot;
    }

    public Episode(String title, String plot) {
        this.title = title;
        this.plot = plot;
        airDate = "TBD";
    }

    @Override
    public String toString() {
        return "Episode{" +
                "title='" + title + '\'' +
                ", airDate='" + airDate + '\'' +
                ", plot='" + plot + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAirDate() {
        return airDate;
    }

    public void setAirDate(String airDate) {
        this.airDate = airDate;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}
