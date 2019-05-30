package com.du.dublog.project.system.mapper;

import com.du.dublog.project.system.domain.Config;

import java.util.List;

/**
 * @Author : Duzining
 * @Description :叁数配置数据层
 * @Date : 2019/5/30 15:49
 * @Version : 1.0
 * @param null
 * @Return
 */
public interface ConfigMapper {

    public Config selectConfig(Config config);

    public List<Config> selectConfigList(Config config);

    public Config checkConfigKeyUnique(String configKey);

    public int insertConfig(Config config);

    public int updateConfig(Config config);

    public int deleteConfigByIds(String[] configIds);
}
