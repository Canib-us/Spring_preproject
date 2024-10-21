import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld hi = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(hi.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat barsik = (Cat) applicationContext.getBean("cat");
        System.out.println(barsik.getMessage());

        System.out.println(bean==hi);
        System.out.println(cat==barsik);
    }
}

