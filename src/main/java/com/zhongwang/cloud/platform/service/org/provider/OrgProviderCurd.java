package com.zhongwang.cloud.platform.service.org.provider;

import org.springframework.data.domain.Page;

import java.util.Date;

/**
 * 提供者执行接口
 *
 * @Author :  zhujinhua
 * @Date : 2017-12-29 8:43
 */
public interface OrgProviderCurd<T> {
	
	/**
	 * @param page           页数
	 * @param size           每页数量
	 * @param lastUpdateTime 最后更新时间，可用此值取更新的数据
	 * @return page T
	 */
	Page<T> find(int page, int size, Date lastUpdateTime);
}
