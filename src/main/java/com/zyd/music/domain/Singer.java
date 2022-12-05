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
 * 歌手
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("singer")
public class Singer implements Serializable {

    /** 主键*/
    @TableId(type = IdType.AUTO)
    private Integer id;
    /** 账号*/
    private String name;
    /** 性别*/
    private Byte sex;
    private String pic;
    private Date birth;
    private String location;
    private String introduction;

}
