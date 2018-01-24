package com.zhongwang.cloud.platform.service.org.entity;

import com.zhongwang.cloud.platform.service.org.entity.base.OrgTreeEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 岗位
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-25 17:11
 */
@Data
@EqualsAndHashCode
@ToString
public class OrgPost extends OrgTreeEntityBase {
	
	/**
	 * 岗位名称
	 */
	private String postName;
	
	/**
	 * 岗位编码
	 */
	private String postCode;
	
	/**
	 * 岗位类型
	 */
	private Short postType;
	
	/**
	 * 所有者类型， 1.集团 2.公司 3.部门 4.组 5.个人 6,其他
	 */
	private Short bond;
	
	/**
	 * 所有者ID，bond + own_id 确定关联关系
	 */
	private String ownerId;
	
	/**
	 * 下发状态位, 是否下发标识，下发不允许更改 0 未下发 1 已下发
	 */
	private Short flagPublic;
}
