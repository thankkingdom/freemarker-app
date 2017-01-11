package sample.freemarker;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * Hello world!
 *
 */
public class FreeMarkerApp01
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println(System.getProperty("user.dir"));
        
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
        
        String baseDir = new File("").getAbsolutePath();
        cfg.setDirectoryForTemplateLoading(new File(baseDir + "\\src\\main\\resources"));
        
        Template tpl = cfg.getTemplate("template.ftl");
        
        Map<String, Object> product = new HashMap<String, Object>();
        product.put("url", "http://www.hinodewashi.co.jp/products/product_cat/oyumaru/");
        product.put("name", "おゆまる<script>alert('hoge');</script>");
        
        Map<String, Object> dataModel = new HashMap<String, Object>();
        //dataModel.put("user", "Indian Joe");
        dataModel.put("user", "Big Joe<br/>");
        dataModel.put("latestProduct", product);
        
        Writer out = new OutputStreamWriter(System.out);
        
        tpl.process(dataModel, out);
		out.flush();
    }
}
