package com.wz.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wz.common.utils.PageUtils;
import com.wz.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-20 23:40:42
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

