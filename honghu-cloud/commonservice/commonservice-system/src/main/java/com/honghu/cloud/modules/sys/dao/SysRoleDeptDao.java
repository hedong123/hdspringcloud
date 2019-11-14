package com.honghu.cloud.modules.sys.dao;

import org.apache.ibatis.annotations.Mapper;

import com.honghu.cloud.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;

/**
 * 角色与部门对应关系
 * 
 * @author honghu cloud
 * @technology +QQ： 2170983087
 * @date 2017年6月21日 23:33:46
 */
@Mapper
public interface SysRoleDeptDao extends BaseDao<SysRoleDeptEntity> {
	
	/**
	 * 根据角色ID，获取部门ID列表
	 */
	List<Long> queryDeptIdList(Long roleId);
}
