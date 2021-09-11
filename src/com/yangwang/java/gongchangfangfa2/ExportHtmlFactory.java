package com.yangwang.java.gongchangfangfa2;

/**
 * @author yangwang
 * @date 2021-09-11-6:21
 */
public class ExportHtmlFactory implements ExportFactory{

    @Override
    public ExportFile factory(String type) throws Exception {
        if("standard".equals(type)){
            return new ExportStandardHtmlFile();
        } else if("financial".equals(type)){
            return new ExportFinancialHtmlFile();
        } else {
            throw new Exception("不支持的类型");
        }
    }
}
