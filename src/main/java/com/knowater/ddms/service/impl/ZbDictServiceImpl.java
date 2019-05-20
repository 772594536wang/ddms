package com.knowater.ddms.service.impl;

import com.knowater.ddms.dao.ZbDictMapper;
import com.knowater.ddms.service.ZbDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZbDictServiceImpl implements ZbDictService {
    @Autowired
    private ZbDictMapper dictMapper;


}
