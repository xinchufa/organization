package com.zhongwang.cloud.platform.service.org.entity.base;

import lombok.Data;

/**
 * 组织机构父类
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-26 13:51
 */
@Data
public abstract class OrgEntityBase extends ZAPEntityBase {
	
	/**
	 * 描述、备注，默认长度500，如果特殊表长度不够用，可自己酌情调整。
	 */
	private String remark;
	
	/**
	 * 扩展字段，所属维度
	 */
	private String dimension;
	
	/**
	 * 扩展字段
	 */
	private Object extValue;
}
