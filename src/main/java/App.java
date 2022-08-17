import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.SocketHandler;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());

        Cat catOne = (Cat) applicationContext.getBean("cat");
        System.out.println(catOne.getSay());
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catOne.getSay());

        System.out.println("Compare Bean HelloWorld - " + (beanOne == beanTwo));
        System.out.println("compare Bean Cat - " + (catOne == catTwo));
    }
}