package com.zyd.music.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyd.music.domain.Song;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SongMapper extends BaseMapper<Song> {

}
