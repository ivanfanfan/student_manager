package com.ivan.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ivan.dao.StScoreDao;
import com.ivan.entity.StScore;
import com.sun.corba.se.impl.ior.GenericIdentifiable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class StScoreService  {
    @Resource
    StScoreDao stScoreDao;

    public StScore selectById(int stId,int en) {
        QueryWrapper queryWrapper = new QueryWrapper();
        Map<Object, Integer> map = new HashMap();
        map.put("st_id",stId);
        map.put("en_id",en);
        queryWrapper.allEq(map,true);
        StScore stScore = stScoreDao.selectOne(queryWrapper);
        return stScore;
    }
}
