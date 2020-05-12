package com.ivan.service;

import com.ivan.dao.DongTaiDao;
import com.ivan.entity.DongTai;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DongTaiService {
    @Resource
    private DongTaiDao dongTaiDao;

    public List<DongTai> getAll() {
        return dongTaiDao.selectList(null);
    }
}
