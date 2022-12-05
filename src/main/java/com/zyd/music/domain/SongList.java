package com.zyd.music.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * 歌单
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("song_list")
public class SongList implements Serializable {

    /** 主键*/
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String title;
    private String pic;
    private String introduction;
    private String style;

}
