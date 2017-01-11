package sample.freemarker;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import lombok.Data;

/**
 * http://www.hos.co.jp/blog/20100125/
 * @author kacky
 */
public class FreeMarkerApp02 {

	public static void main(String[] args) throws Exception {
		Map<String, Object> root = new HashMap<String, Object>();
		List<Food> menu = new ArrayList<Food>();
		menu.add(new Food("ひつまぶし", 2750));
		menu.add(new Food("味噌煮込み", 1260));
		menu.add(new Food("手羽先５本", 400));
		root.put("menu", menu);
		process("menu.ftl", root);
	}

	private static void process(String template, Map<String, ?> data) throws Exception {
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_25);
		String baseDir = new File("").getAbsolutePath();
		cfg.setDirectoryForTemplateLoading(new File(baseDir + "\\src\\main\\resources"));
		Writer out = new OutputStreamWriter(System.out);
		Template temp = cfg.getTemplate(template);
		temp.process(data, out);
		out.flush();
	}

	@Data
	public static class Food {
		private String name;
		private int price;

		public Food(String name, int price) {
			this.name = name;
			this.price = price;
		}
	}
}
