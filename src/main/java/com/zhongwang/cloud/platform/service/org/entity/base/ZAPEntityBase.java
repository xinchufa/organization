package com.zhongwang.cloud.platform.service.org.entity.base;

import lombok.Data;

import java.util.Date;


@Data
public abstract class ZAPEntityBase extends EntityBase {
	
	/**
	 * 有效状态（封存状态、启用状态） 0-无效；1-有效。
	 */
	private Short flagStatus;
	
	/**
	 * 排序字段，整数, 需要手工排序时使用，项目组可以根据特殊情况设置特殊算法，预留足够大字段
	 */
	private Long flagSort;
	
	/**
	 * 逻辑删除标志, 0-正常；1-逻辑删除
	 */
	private Short flagDelete;
	
	/**
	 * 并发修改版本号，bigint型
	 */
	private Long flagVersion;
	
	/**
	 * 记录制作人，记录人员的pk_id
	 */
	private String makeUser;
	
	/**
	 * 记录创建时间
	 */
	private Date makeTime;
	
	/**
	 * 记录最后修改人
	 */
	private String modifyUser;
	
	/**
	 * 记录最后修改时间
	 */
	private Date modifyTime;
	
	/**
	 * 业务所属公司或组织ID
	 */
	private String compPkid;
	
}
