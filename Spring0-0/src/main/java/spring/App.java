package spring;

import org.chen.Interface.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext ctx = null;
	static{
		ctx = new ClassPathXmlApplicationContext("spring.xml");
	}
	
    public static void main( String[] args ) throws Exception
    {
    	Performer p = (Performer) ctx.getBean("duke");
    	p.perform();
        System.out.println( "Hello World!" );
        
    }
}
