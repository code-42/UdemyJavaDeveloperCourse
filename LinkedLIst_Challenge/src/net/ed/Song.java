package net.ed;

// Create a Song class having Title and Duration for a song.

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
