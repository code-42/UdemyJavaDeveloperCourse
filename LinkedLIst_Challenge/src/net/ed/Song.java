package net.ed;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        title = title;
        duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
