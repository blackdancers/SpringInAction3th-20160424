package com.springinaction.springidol;

/**
 * Created by dujiang on 2016/4/25.
 */
public class SongSelector {

    private Song song;

    Song selectSong(){
        return song;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}
