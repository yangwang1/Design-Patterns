package com.yangwang.java.gongchangfangfa2;

/**
 * 2.工厂方法模式
 *
 * 优点：新增加产品样式不需要修改代码，只需要增加factory和File的实现类就可以了，之前的代码不发生改变
 *
 * @author yangwang
 * @date 2021-09-11-6:23
 */
public class Test {

    public static void main(String[] args) throws Exception {
        String fileType = "pdf";
        String type = "standard";
        String data = "";
        ExportFactory exportFactory = createExportFactory(fileType);
        ExportFile file = exportFactory.factory(type);
        boolean isSuccess = file.export(data);
    }

    private static ExportFactory createExportFactory(String type) throws Exception {
        if("html".equals(type)){
            return new ExportHtmlFactory();
        } else if("pdf".equals(type)) {
            return new ExportPdfFactory();
        } else {
            throw new Exception("不支持的类型");
        }
    }
}
