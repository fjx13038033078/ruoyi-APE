package com.ruoyi.poem.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author 范佳兴
 * @date 2024/12/31 11:42
 */
@TableName("ape_feedback")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Feedback implements Serializable {

    /**
     * 反馈ID，主键，自增
     */
    @TableId(type = IdType.AUTO)
    private Long feedbackId;

    /**
     * 反馈用户ID，外键
     */
    private Long userId;

    /**
     * 用户姓名
     */
    @TableField(exist = false)
    private String userName;

    /**
     * 反馈内容
     */
    private String content;

    /**
     * 状态（0-未解答，1-已解答）
     */
    private Integer status;

    /**
     * 回复内容
     */
    private String replyContent;

    /**
     * 回复时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime replyTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}
