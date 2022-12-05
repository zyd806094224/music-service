package com.zyd.music.service;

import com.zyd.music.domain.Singer;

import java.util.List;

/**
 * 歌手service接口
 */
public interface SingerService {

    public boolean insert(Singer singer);

    public boolean update(Singer singer);

    public boolean delete(Integer id);

    public Singer selectByPrimaryKey(Integer id);

    public List<Singer> allSinger();

    public List<Singer> singerOfName(String name);

    public List<Singer> singerOfSex(Integer sex);

}
