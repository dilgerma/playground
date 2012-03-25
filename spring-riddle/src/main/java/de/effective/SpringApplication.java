package de.effective;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author martin.dilger
 */
public class SpringApplication {

    public static void main(String[] args) throws Exception {
       
        new Thread(new Runnable() {
            @Override
            public void run() {
                ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("de/effective/spring-context.xml");

                MyService myService = appCtx.getBean(MyService.class);
                myService.sagDochMal("Heureka, ich habs!");
                while(true)
                    try {
                        Thread.sleep(1000);
                        System.out.println("still running");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

            }
        }).start();       ;

    }
}
