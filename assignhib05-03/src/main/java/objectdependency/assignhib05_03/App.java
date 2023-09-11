package objectdependency.assignhib05_03;

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
        ApplicationContext ap = new ClassPathXmlApplicationContext("objectdependency/assignhib05_03/myfile.xml");
        student s = (student)ap.getBean("s1");
        System.out.println(s);
    }
}
