package com.lht.bussiness.tbuser.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lht.bussiness.tbuser.dao.ITbUserDao;
import com.lht.bussiness.tbuser.pojo.TbUser;
import com.lht.bussiness.tbuser.service.ITbUserServie;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author Dravid
 * @since 2018-12-27
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<ITbUserDao, TbUser> implements ITbUserServie {

}
