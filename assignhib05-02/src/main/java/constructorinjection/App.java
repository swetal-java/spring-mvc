package constructorinjection;

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
      ApplicationContext ap = new ClassPathXmlApplicationContext("constructorinjection/myfile.xml");
      userdata um = (userdata)ap.getBean("b1");
      System.out.println(um);
     }
}
