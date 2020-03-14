/**
 * Copyright (c) 2013-Now http://jeesite.com All rights reserved.
 */
package com.jeesite.modules.wght.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.wght.entity.WgContractWyfcf;

/**
 * 合同管理表体-物业费拆分页签（隐藏）DAO接口
 * @author LY
 * @version 2019-10-31
 */
@MyBatisDao
public interface WgContractWyfcfDao extends CrudDao<WgContractWyfcf> {
	
	//根据主键删除数据，更新DR=1
	@Update("update wg_contract_wyfcf set dr=1,ts=sysdate where pk_contract_wyfcf=#{pk_contract_wyfcf}")
	Integer deleteDataNewByPk(@Param("pk_contract_wyfcf") String pk_contract_wyfcf);
	//根据表头主键删除数据，更新DR=1
	@Update("update wg_contract_wyfcf set dr=1,ts=sysdate where pk_contract=#{pk_contract}")
	Integer deleteDataNewByFk(@Param("pk_contract") String pk_contract);
	
	@Select("${sql}")
	List<WgContractWyfcf> getNjhmnyDetail(@Param("sql") String sql);
	
}