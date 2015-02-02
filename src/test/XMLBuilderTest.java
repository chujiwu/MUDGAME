package test;

import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class XMLBuilderTest {
	public static void main(String args[]) {
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build("src/xml/po.xml");// 获得文档对象
//			Element root = doc.getRootElement();// 获得根节点
			// 添加新元素
//			Element element = new Element("person");
//			element.setAttribute("id", "3");
//			Element element1 = new Element("username");
//			element1.setText("zhangdaihao");
//			Element element2 = new Element("password");
//			element2.setText("mima");
//			element.addContent(element1);
//			element.addContent(element2);
////			root.addContent(element);
//			doc.setRootElement(element);
//
//			// 文件处理
//			XMLOutputter out = new XMLOutputter();
//			out.output(doc, new FileOutputStream("src/xml/po.xml"));
			
			Element root = doc.getRootElement();
			System.out.println(root.getName());
			List<Attribute> rootAttris = root.getAttributes();
			for(Attribute attri : rootAttris){
				System.out.println("name   : " + attri.getName());
				System.out.println("value  : " + attri.getValue());
			}
			List<Element> childs = root.getChildren();
			for(Element child : childs){
				System.out.println("childname  : " + child.getName());
				System.out.println("childvalue : " + child.getValue());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
