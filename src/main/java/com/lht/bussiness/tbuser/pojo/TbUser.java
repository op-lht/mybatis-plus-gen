package com.lht.bussiness.tbuser.pojo;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户
 * 
 * @author Dravid
 * @since 2018-12-27
 */
@Data
@Accessors(chain = true)
@TableName("tb_user")
public class TbUser implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "user_id", type = IdType.AUTO)
	private Long userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 手机号
	 */
	private String mobile;

	/**
	 * 密码
	 */
	private String password;

	/**
	 * 创建时间
	 */
	private LocalDateTime createTime;

}
