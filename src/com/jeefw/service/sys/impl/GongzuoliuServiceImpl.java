package com.jeefw.service.sys.impl;

import com.jeefw.dao.sys.GongzuoliuDao;
import com.jeefw.model.sys.Gongzuoliu;
import com.jeefw.service.sys.GongzuoliuService;
import core.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksoam on 2015/12/28.
 */
@Service
public class GongzuoliuServiceImpl extends BaseService<Gongzuoliu> implements GongzuoliuService {

    private GongzuoliuDao gongzuoliuDao;

    @Resource
    public void setGongzuoliuDao(GongzuoliuDao gongzuoliuDao) {
        this.gongzuoliuDao = gongzuoliuDao;
        this.dao = gongzuoliuDao;
    }

    @Override
    public List<Gongzuoliu> queryDictWithSubList(List<Gongzuoliu> resultList) {
        List<Gongzuoliu> gongzuoliuList = new ArrayList<Gongzuoliu>();
        for (Gongzuoliu entity : resultList) {
            Gongzuoliu gongzuoliu = new Gongzuoliu();
            gongzuoliu.setId(entity.getId());
            gongzuoliu.setDictKey(entity.getDictKey());
            gongzuoliu.setDictValue(entity.getDictValue());
            gongzuoliu.setSequence(entity.getSequence());
            gongzuoliu.setParentDictkey(entity.getParentDictkey());
            gongzuoliuList.add(gongzuoliu);
        }
        return gongzuoliuList;
    }
}
