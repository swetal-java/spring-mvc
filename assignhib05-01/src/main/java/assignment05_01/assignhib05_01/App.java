package assignment05_01.assignhib05_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new ClassPathXmlApplicationContext("assignment05_01/assignhib05_01/myfile.xml");
        userdata u1 = (userdata)ap.getBean("d1");
        System.out.println(u1);
    }
}
