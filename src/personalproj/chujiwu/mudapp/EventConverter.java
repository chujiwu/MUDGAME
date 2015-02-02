package personalproj.chujiwu.mudapp;

import java.io.FileOutputStream;
import java.util.HashMap;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class EventConverter {
	
	public void xml2events(HashMap<String, GameEvent> events) {
		// TODO Auto-generated method stub
//		SAXBuilder builder = new SAXBuilder();
//		  Document doc = builder.build("src/xml/po.xml");//获得文档对象
//		  Element root = doc.getRootElement();//获得根节点
//		  
//		  //添加新元素
//		  Element element = new Element("person");
//		  element.setAttribute("id", "3");
//		  Element element1 = new Element("username");
//		  element1.setText("zhangdaihao");
//		  Element element2 = new Element("password");
//		  element2.setText("mima");
//		  element.addContent(element1);
//		  element.addContent(element2);
//		  root.addContent(element);
//		  doc.setRootElement(root);
//		  
//		  //文件处理
//		  XMLOutputter out = new XMLOutputter();
//		  out.output(doc, new FileOutputStream("src/xml/po.xml"));
	}

}
