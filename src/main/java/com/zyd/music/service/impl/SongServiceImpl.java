package com.zyd.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyd.music.dao.SongMapper;
import com.zyd.music.domain.Song;
import com.zyd.music.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    private SongMapper songMapper;

    @Override
    public boolean insert(Song song) {
        return songMapper.insert(song) > 0;
    }

    @Override
    public boolean update(Song song) {
        return songMapper.updateById(song) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return songMapper.deleteById(id) > 0;
    }

    @Override
    public Song selectByPrimaryKey(Integer id) {
        return songMapper.selectById(id);
    }

    @Override
    public List<Song> allSong() {
        return songMapper.selectList(null);
    }

    @Override
    public List<Song> songOfName(String name) {
        QueryWrapper<Song> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name",name);
        return songMapper.selectList(queryWrapper);
    }

    @Override
    public List<Song> songOfSingerId(Integer singerId) {
        QueryWrapper<Song> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("singer_id",singerId);
        return songMapper.selectList(queryWrapper);
    }

}
