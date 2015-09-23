import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.springidol.Performer;

public class Main {
 
    public static void main(String []args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();
    }
 
}
