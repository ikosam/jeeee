package com.jeefw.dao.sys.impl;

import com.jeefw.dao.sys.GongzuoliuDao;
import com.jeefw.model.sys.Gongzuoliu;
import core.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * Created by ksoam on 2015/12/28.
 */
@Repository
public class GongzuoliuDaoImpl extends BaseDao<Gongzuoliu> implements GongzuoliuDao {
    public GongzuoliuDaoImpl() {
        super(Gongzuoliu.class);
    }
}
