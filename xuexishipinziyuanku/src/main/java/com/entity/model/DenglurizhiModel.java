package com.entity.model;

import com.entity.DenglurizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 登录日志
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DenglurizhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 登录详情
     */
    private String denglurizhiName;


    /**
     * 登录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：登录详情
	 */
    public String getDenglurizhiName() {
        return denglurizhiName;
    }


    /**
	 * 设置：登录详情
	 */
    public void setDenglurizhiName(String denglurizhiName) {
        this.denglurizhiName = denglurizhiName;
    }
    /**
	 * 获取：登录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：登录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
