package com.zyd.music.service;

import com.zyd.music.domain.SongList;
import java.util.List;

public interface SongListService {

    public boolean insert(SongList songList);

    public boolean update(SongList songList);

    public boolean delete(Integer id);

    public SongList selectByPrimaryKey(Integer id);

    public List<SongList> allSongList();

    public List<SongList> songListOfTitle(String title);

    public List<SongList> likeTitle(String title);

    public List<SongList> likeStyle(String style);
}
