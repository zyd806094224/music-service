package com.zyd.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyd.music.dao.SongListMapper;
import com.zyd.music.domain.SongList;
import com.zyd.music.service.SongListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongListServiceImpl implements SongListService {

    @Autowired
    private SongListMapper songListMapper;

    @Override
    public boolean insert(SongList songList) {
        return songListMapper.insert(songList) > 0;
    }

    @Override
    public boolean update(SongList songList) {
        return songListMapper.updateById(songList) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return songListMapper.deleteById(id) > 0;
    }

    @Override
    public SongList selectByPrimaryKey(Integer id) {
        return songListMapper.selectById(id);
    }

    @Override
    public List<SongList> allSongList() {
        return songListMapper.selectList(null);
    }

    @Override
    public List<SongList> songListOfTitle(String title) {
        QueryWrapper<SongList> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("title",title);
        return songListMapper.selectList(queryWrapper);
    }

    @Override
    public List<SongList> likeTitle(String title) {
        QueryWrapper<SongList> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("title",title);
        return songListMapper.selectList(queryWrapper);
    }

    @Override
    public List<SongList> likeStyle(String style) {
        QueryWrapper<SongList> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("style",style);
        return songListMapper.selectList(queryWrapper);
    }
}
