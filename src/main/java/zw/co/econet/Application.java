package zw.co.econet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zw.co.econet.model.Speaker;
import zw.co.econet.service.SpeakerService;
import zw.co.econet.service.SpeakerServiceImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpeakerService service = context.getBean("service",SpeakerServiceImp.class);

        System.out.println(service.findAll().get(0).getFname());
    }
}
