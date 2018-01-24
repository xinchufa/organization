package com.zhongwang.cloud.platform.service.org.entity;

import com.zhongwang.cloud.platform.service.org.entity.base.OrgEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * 用户
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-25 17:07
 */
@Data
@EqualsAndHashCode
@ToString
public class OrgUser extends OrgEntityBase {
	
	/**
	 * 姓名
	 */
	private String userName;
	
	/**
	 * 登录名
	 */
	private String userCode;
	
	/**
	 * 是否可登录,1:可登录.0,不可登录.
	 */
	private Short flagLoginable;
	
	/**
	 * 性别，1：男，2 ：女
	 */
	private Short sex;
	
	/**
	 * 生日
	 */
	private Date birthday;
	
	/**
	 * 办公电话
	 */
	private String officePhone;
	
	/**
	 * 手机
	 */
	private String userMobile;
	
	/**
	 * 电子邮件
	 */
	private String userEmail;
	
	/**
	 * 密码
	 */
	private String userPassword;
	
	/**
	 * 盐
	 */
	private String salt;
	
	/**
	 * 身份证号
	 */
	private String idCard;
	
	/**
	 * 联系地址
	 */
	private String address;
	
	
	/**
	 * 头像路径
	 */
	private String headImageUrl;
	
	/**
	 * qq
	 */
	private String qq;
	
	/**
	 * 微信号
	 */
	private String weiXin;
	
}
