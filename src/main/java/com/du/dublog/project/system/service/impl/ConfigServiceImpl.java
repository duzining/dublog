package com.du.dublog.project.system.service.impl;

import com.du.dublog.project.system.domain.Config;
import com.du.dublog.project.system.service.ConfigService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :
 * @Date : 2019/5/30 16:03
 * @Version : 1.0
 * @param null
 * @Return
 */
@Service
public class ConfigServiceImpl implements ConfigService {
    @Override
    public Config selectConfigById(Long configId) {
        return null;
    }

    @Override
    public String selectConfigByKey(String configKey) {
        return null;
    }

    @Override
    public List<Config> selectConfigList(Config config) {
        return null;
    }

    @Override
    public int insertConfig(Config config) {
        return 0;
    }

    @Override
    public int updateConfig(Config config) {
        return 0;
    }

    @Override
    public int deleteConfigByIds(String ids) {
        return 0;
    }

    @Override
    public String checkConfigKeyUnique(Config config) {
        return null;
    }
}
