package hcl.MyFirstProject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Hello.xml");
		Hello h=(Hello)ctx.getBean("hello");
		System.out.println(h.sayHello("Hyderabad"));
	}
}
