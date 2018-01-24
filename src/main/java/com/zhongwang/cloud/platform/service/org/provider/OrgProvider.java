package com.zhongwang.cloud.platform.service.org.provider;

/**
 * 数据提取接口标记
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-27 14:38
 */
public interface OrgProvider {
	
	/**
	 * 获得提取数据所属维度
	 *
	 * @return OrgDimension.Const.value
	 */
	String dimension();
	
	/**
	 * 获得用户提供者
	 *
	 * @return OrgUserProvider
	 */
	OrgUserProvider orgUserProvider();
	
	/**
	 * 获得部门提供者
	 *
	 * @return OrgUserProvider
	 */
	OrgDepartmentProvider orgDepartmentProvider();
	
	/**
	 * 获得岗位提供者
	 *
	 * @return OrgUserProvider
	 */
	OrgPostProvider orgPostProvider();
	
	/**
	 * 获得关系表提供者
	 *
	 * @return OrgUserProvider
	 */
	OrgRelationshipProvider orgRelationshipProvider();
	
}
