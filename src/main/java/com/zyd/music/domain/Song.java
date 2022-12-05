package com.zyd.music.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 歌曲
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("song")
public class Song implements Serializable {

    /** 主键*/
    @TableId(type = IdType.AUTO)
    private Integer id;
    /** 歌手id*/
    private Integer singerId;
    /** 歌名*/
    private String name;
    private String introduction;
    private Date createTime;
    private Date updateTime;
    private String pic;
    private String lyric;
    private String url;

}
