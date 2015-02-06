package personalproj.chujiwu.mudapp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

import personalproj.chujiwu.common.CommonUtil;
import personalproj.chujiwu.env.EnvConstant;

public class EventConverter {

	List<Document> docList = null;

	public void xml2events(HashMap<String, GameEvent> events) {
		try {
			init();
		} catch (Exception e) {
			// TODO throw new Exception
		}
		if (docList != null) {
			for (Document doc : docList) {
				doc2events(doc, events);
			}
		}
		try {
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build("src/xml/po.xml");// 获得文档对象
			Element root = doc.getRootElement();// 获得根节点

			// 添加新元素
			Element element = new Element("person");
			element.setAttribute("id", "3");
			Element element1 = new Element("username");
			element1.setText("zhangdaihao");
			Element element2 = new Element("password");
			element2.setText("mima");
			element.addContent(element1);
			element.addContent(element2);
			root.addContent(element);
			doc.setRootElement(root);

			// 文件处理
			XMLOutputter out = new XMLOutputter();
			out.output(doc, new FileOutputStream("src/xml/po.xml"));
		} catch (Exception e) {

		}
	}

	private void init() throws JDOMException, IOException {
		List<Document> fileList = new ArrayList<Document>();
		File[] files = getXmlFiles();
		if (files != null) {
			for (File file : files) {
				SAXBuilder builder = new SAXBuilder();
				Document doc = builder.build(EnvConstant.XMLFILEPATH
						+ File.separator + file.getName());
				fileList.add(doc);
			}
		}
	}

	private File[] getXmlFiles() {
		boolean hasXmlFile = false;
		File[] xmlFiles = null;
		if (CommonUtil.isFolderExist(EnvConstant.XMLFILEPATH)) {
			File path = new File(EnvConstant.XMLFILEPATH);
			xmlFiles = path.listFiles();
			if (xmlFiles.length != 0) {
				for (File file : xmlFiles) {
					if (file.getName().endsWith(".xml")) {
						hasXmlFile = true;
					}
				}
			}
		}
		if (hasXmlFile) {
			return xmlFiles;
		}
		return null;
	}

	private void doc2events(Document doc, HashMap<String, GameEvent> events) {
		Element root = doc.getRootElement();
		if (root.getName() == "Events") {
			List<Element> eleList = root.getChildren();
			for (Element ele : eleList) {
				element2event(ele, events);
			}
		}
	}

	private void element2event(Element ele, HashMap<String, GameEvent> events) {
		List<Attribute> attrs = ele.getAttributes();
		for(Attribute attr: attrs){
			GameEvent gameEvent = new GameEvent();
			if(attr.getName().equalsIgnoreCase(ElementConstant.CLAZZ)){
				gameEvent.setCLAZZ(attr.getValue());
			}
		}
	}
}
