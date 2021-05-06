import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac  = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(ac.getBean(AppConfig.class));
    }
}