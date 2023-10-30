package com.weshare.mbg.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Moncoder
 * @since 2023-10-30 18:56:23
 */
@Getter
@Setter
public class Note implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户昵称
     */
    private String userNickname;

    /**
     * 网站url
     */
    private String url;

    /**
     * 笔记内容
     */
    private String content;

    /**
     * 点赞数
     */
    private Integer likedNum;

    /**
     * 公开或者私密
     */
    private Byte isPublic;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
