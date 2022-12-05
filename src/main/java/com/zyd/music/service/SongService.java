package com.zyd.music.service;

import com.zyd.music.domain.Song;

import java.util.List;

/**
 * 歌曲service接口
 */
public interface SongService {

    public boolean insert(Song song);

    public boolean update(Song song);

    public boolean delete(Integer id);

    public Song selectByPrimaryKey(Integer id);

    public List<Song> allSong();

    public List<Song> songOfName(String name);

    public List<Song> songOfSingerId(Integer singerId);

}
