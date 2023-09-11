package setList.assign05_04;

import java.util.List;

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
        ApplicationContext ap = new ClassPathXmlApplicationContext("setList/assign05_04/myfile.xml");
        List<student> list = ap.getBean(List.class, "list");
        System.out.println(list);
        
        
    }
}
