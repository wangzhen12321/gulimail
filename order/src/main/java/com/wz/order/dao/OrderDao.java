package com.wz.order.dao;

import com.wz.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-20 23:40:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
