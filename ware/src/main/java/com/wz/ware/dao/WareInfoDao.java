package com.wz.ware.dao;

import com.wz.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-21 09:28:57
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
