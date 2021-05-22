package com.wz.product.dao;

import com.wz.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-20 22:11:11
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
