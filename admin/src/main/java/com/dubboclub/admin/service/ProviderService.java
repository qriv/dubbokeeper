package com.dubboclub.admin.service;

import com.dubboclub.admin.model.Provider;

import java.util.List;

/**
 * Created by bieber on 2015/6/3.
 */
public interface ProviderService {


    //查询某个应用提供的所有服务信息
    public List<Provider> listProviderByApplication(String appName);

    //通过服务查询其提供者信息
    public List<Provider> listProviderByService(String service);

    //通过多条件查询符合全部条件的提供者信息
    public List<Provider> listProviderByConditions(String...conditions);


}
