package com.jeefw.service.sys;

import com.jeefw.model.sys.Gongzuoliu;
import core.service.Service;

import java.util.List;

/**
 * Created by ksoam on 2015/12/28.
 */
public interface GongzuoliuService extends Service<Gongzuoliu> {

    List<Gongzuoliu> queryDictWithSubList(List<Gongzuoliu> resultList);
}
