package com.zyd.music.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyd.music.domain.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * 管理员Dao
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

    public int verifyPassword(String name,String password);

}
