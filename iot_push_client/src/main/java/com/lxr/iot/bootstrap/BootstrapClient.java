package com.lxr.iot.bootstrap;


/**
 * 启动类接口
 *
 * @author lxr
 * @create 2017-11-18 14:05
 **/
public interface BootstrapClient {

    void start();

    void shutdown();

    void initEventPool();


}
