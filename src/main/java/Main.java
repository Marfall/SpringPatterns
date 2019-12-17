import config.ApplicationConfig;
import entities.Cat;
import entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        User user = (User) applicationContext.getBean("user");
        System.out.println(user.getName());
        Cat cat = (Cat)applicationContext.getBean("cat");
        System.out.println(cat.getName());
    }
}
