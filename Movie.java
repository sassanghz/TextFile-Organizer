package main;
import main.Driver;
import java.io.Serializable;

public class Movie implements Serializable{

    private int year;
    private String title;
    private int duration;
    private String genres;
    private String rating;
    private int score;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;

    public Movie() {
    }

    public Movie(int year, String title, int duration, String genres, String rating, int score, String director, String actor1, String actor2, String actor3) {
        this.year = year;
        this.title = title;
        this.duration = duration;
        this.genres = genres;
        this.rating = rating;
        this.score = score;
        this.director = director;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getGenres() {
        return genres;
    }

    public String getRating() {
        return rating;
    }

    public int getScore() {
        return score;
    }

    public String getDirector() {
        return director;
    }

    public String getActor1() {
        return actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj == this) return true;

        if(getClass() != obj.getClass()) return false;

        Movie movie = (Movie) obj;

        return (this.year == movie.year) && 
        (this.duration == movie.duration) &&
        (this.score == movie.score) &&
        (this.genres.equals(movie.genres)) &&
        (this.rating.equals(movie.rating)) &&
        (this.director.equals(movie.director)) &&
        (this.actor1.equals(movie.actor1)) &&
        (this.actor2.equals(movie.actor2)) &&
        (this.actor3.equals(movie.actor3)) &&
        (this.title.equals(movie.title));
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", genres='" + genres + '\'' +
                ", rating='" + rating + '\'' +
                ", score=" + score +
                ", director='" + director + '\'' +
                ", actor1='" + actor1 + '\'' +
                ", actor2='" + actor2 + '\'' +
                ", actor3='" + actor3 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        String part1_manifest = "part1_manifest.txt";
        String part2_manifest = Driver.do_part1(part1_manifest);
        String part3_manifest = Driver.do_part2(part2_manifest);
        Driver.do_part3(part3_manifest);
        return;
    }
}