package com.wz.member.dao;

import com.wz.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangzhen
 * @email wangzhen404@163.com
 * @date 2021-05-21 09:31:50
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
