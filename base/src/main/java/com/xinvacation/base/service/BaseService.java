package com.xinvacation.base.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BaseService {
    @Autowired
    protected RedisService redis;
    
    @Autowired
    protected SendMessageService sendMessageService;
}
