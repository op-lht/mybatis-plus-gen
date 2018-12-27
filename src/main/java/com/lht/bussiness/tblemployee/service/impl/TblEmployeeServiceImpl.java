package com.lht.bussiness.tblemployee.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lht.bussiness.tblemployee.dao.ITblEmployeeDao;
import com.lht.bussiness.tblemployee.pojo.TblEmployee;
import com.lht.bussiness.tblemployee.service.ITblEmployeeServie;

/**
 * <p>
 * 员工表 测试添加的注释 服务实现类
 * </p>
 *
 * @author Dravid
 * @since 2018-12-27
 */
@Service
public class TblEmployeeServiceImpl extends ServiceImpl<ITblEmployeeDao, TblEmployee> implements ITblEmployeeServie {

}
