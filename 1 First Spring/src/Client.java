

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;





public class Client {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("XML/abc.xml");
		
		BeanFactory ob = new XmlBeanFactory(r);
		HelloWorld h=(HelloWorld) ob.getBean("ref");
		h.Hello();
	}
}
