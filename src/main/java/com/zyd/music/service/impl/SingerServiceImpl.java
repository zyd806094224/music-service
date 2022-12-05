package com.zyd.music.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyd.music.dao.SingerMapper;
import com.zyd.music.domain.Singer;
import com.zyd.music.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingerServiceImpl implements SingerService {

    @Autowired
    private SingerMapper singerMapper;

    @Override
    public boolean insert(Singer singer) {
        return singerMapper.insert(singer) > 0;
    }

    @Override
    public boolean update(Singer singer) {
        return singerMapper.updateById(singer) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return singerMapper.deleteById(id) > 0;
    }

    @Override
    public Singer selectByPrimaryKey(Integer id) {
        return singerMapper.selectById(id);
    }

    @Override
    public List<Singer> allSinger() {
        return singerMapper.selectList(null);
    }

    @Override
    public List<Singer> singerOfName(String name) {
        QueryWrapper<Singer> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name",name);
        return singerMapper.selectList(queryWrapper);
    }

    @Override
    public List<Singer> singerOfSex(Integer sex) {
        QueryWrapper<Singer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("sex",sex);
        return singerMapper.selectList(queryWrapper);
    }
}
