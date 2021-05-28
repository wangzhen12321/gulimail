package com.wz.coupon.dao;

import com.wz.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-27 21:55:50
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
