package com.zhongwang.cloud.platform.service.org.entity;

import com.zhongwang.cloud.platform.service.org.entity.base.OrgTreeEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 部门
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-25 17:13
 */
@Data
@EqualsAndHashCode
@ToString
public class OrgDepartment extends OrgTreeEntityBase {
	
	/**
	 * 名称
	 */
	private String deptName;
	
	/**
	 * 部门简称
	 */
	private String deptShortName;
	
	/**
	 * 部门编码
	 */
	private String deptCode;
	
}
