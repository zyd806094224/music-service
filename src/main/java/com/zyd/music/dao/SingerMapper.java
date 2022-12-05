package com.zyd.music.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyd.music.domain.Singer;
import org.apache.ibatis.annotations.Mapper;

/**
 * 歌手Dao
 */
@Mapper
public interface SingerMapper extends BaseMapper<Singer> {


}
