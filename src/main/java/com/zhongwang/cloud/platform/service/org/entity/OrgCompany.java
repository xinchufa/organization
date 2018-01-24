package com.zhongwang.cloud.platform.service.org.entity;

import com.zhongwang.cloud.platform.service.org.entity.base.OrgTreeEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 公司
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-25 17:11
 */
@Data
@EqualsAndHashCode
@ToString
public class OrgCompany extends OrgTreeEntityBase {
	
	/**
	 * 公司名称
	 */
	private String compName;
	
	/**
	 * 外文名称
	 */
	private String secondName;
	
	/**
	 * 公司编码
	 */
	private String comp_code;
	
	/**
	 * 公司别名
	 */
	private String compAlias;
	
	/**
	 * 公司简称
	 */
	private String compShortName;
	
	/**
	 * 集团简称
	 */
	private String groupShortName;
	
	/**
	 * 公司类型
	 */
	private Short compType;
	
	/**
	 * 公司负责人
	 */
	private String responsiblePerson;
	
	/**
	 * 公司地址
	 */
	private String compAddress;
	
	/**
	 * 公司联系电话
	 */
	private String compPhone;
	
	/**
	 * 邮政编码
	 */
	private String postCode;
	
	/**
	 * 公司传真
	 */
	private String faxNo;
	
	/**
	 * 公司邮件地址
	 */
	private String emailAddress;
	
}
