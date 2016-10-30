package spring;

import org.chen.Interface.Performer;
import org.chen.beans.Audience;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	private static ApplicationContext ctx = null;
	static {
		ctx = new ClassPathXmlApplicationContext("spring.xml");
	}

	public static void main(String[] args) throws Exception {
		Audience audience = (Audience) ctx.getBean("audience");
		audience.applaud();

		Performer p = (Performer) ctx.getBean("duke");
		p.perform();
	}
}