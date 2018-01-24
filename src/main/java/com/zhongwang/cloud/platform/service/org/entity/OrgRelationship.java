package com.zhongwang.cloud.platform.service.org.entity;

import com.zhongwang.cloud.platform.service.org.entity.base.OrgEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关系表
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-25 17:15
 */
@Data
@EqualsAndHashCode
public class OrgRelationship extends OrgEntityBase {
	
	/**
	 * 关系类型
	 * type = 1 department_user 部门人员关系
	 * type = 2 deputy_department_user 副部门人员关系
	 * type = 3 post_user 岗位人员关系
	 * type = 4 deputy_post_user 副岗人员关系
	 * type = 5 level_user 职级人员关系
	 * type = 6 team_user 组人员关系
	 * type = 7 role_user角色人员关系（暂时不用）
	 * type = 8 concurrent_company_user 兼职公司人员关系（暂时不用）
	 * type = 9 company_user 公司管理员关系（暂时不用）
	 * type = 10 department_post_user 部门岗人员关系
	 * type = 11 dimension_company 维度公司关系
	 * type = 12 dimension_department 部门维度关系
	 * type = 13 dimension_post 维度岗位关系
	 * type = 14 dimension_level 维度职级关系（暂时不用）
	 * type = 15 dimension_group 维度组关系（暂时不用）
	 * type = 16 dimension _user 维度人关系
	 */
	private Short flagType;
	
	/**
	 * 引用关系1
	 */
	private String relationship1;
	
	/**
	 * 引用关系2
	 */
	private String relationship2;
	
	/**
	 * 引用关系3， 一组兼职信息的统一标识
	 */
	private String relationship3;
	
}
