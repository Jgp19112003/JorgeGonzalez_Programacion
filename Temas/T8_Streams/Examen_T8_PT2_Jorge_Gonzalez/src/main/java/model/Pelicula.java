package model;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String original_tittle,poster_path,overview,release_date;

    public Pelicula(String original_tittle, String poster_path, String overview, String release_date) {
        this.original_tittle = original_tittle;
        this.poster_path = poster_path;
        this.overview = overview;
        this.release_date = release_date;
    }

    public String getOriginal_tittle() {
        return original_tittle;
    }

    public void setOriginal_tittle(String original_tittle) {
        this.original_tittle = original_tittle;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "original_tittle='" + original_tittle + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", overview='" + overview + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
