package com.yangwang.java.gongchangfangfa2;

/**
 * @author yangwang
 * @date 2021-09-11-6:21
 */
public interface ExportFactory {
    public ExportFile factory(String type) throws Exception;
}
