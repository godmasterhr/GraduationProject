package cn.e_mall.common.service;

import org.springframework.stereotype.Service;

import cn.e_mall.common.spring.exetend.PropertyConfig;

@Service
public class PropertieService {

    @PropertyConfig
    public String REPOSITORY_PATH;
    
    @PropertyConfig
    public String IMAGE_BASE_URL;

}
