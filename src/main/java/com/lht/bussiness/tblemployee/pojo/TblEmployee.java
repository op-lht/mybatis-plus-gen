package com.lht.bussiness.tblemployee.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 员工表 测试添加的注释
 * 
 * @author Dravid
 * @since 2018-12-27
 */
@Data
@Accessors(chain = true)
@TableName("tbl_employee")
public class TblEmployee implements Serializable {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	/**
	 * 员工的名字
	 */
	private String lastName;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 性别
	 */
	private String gender;

	/**
	 * 年龄
	 */
	private Integer age;

}
