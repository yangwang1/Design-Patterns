package com.yangwang.java.gongchangfangfa2;

/**
 * @author yangwang
 * @date 2021-09-11-6:22
 */
public class ExportStandardHtmlFile implements ExportFile{
    @Override
    public boolean export(String data) {
        System.out.println("普通版html导出成功");
        return true;
    }
}
