package todo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
    public void launch(){
        String[] contextPaths = new String[]{"application-context.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextPaths);

        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
