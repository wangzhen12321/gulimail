package com.wz.ware.dao;

import com.wz.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-21 09:28:57
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
