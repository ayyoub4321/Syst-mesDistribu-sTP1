package tp1.pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tp1.Metier.IMetier;

public class presSpringAnnotation {
    public static void main(String[] args) {
        System.out.println("Annotation");
        ApplicationContext appCon=new AnnotationConfigApplicationContext("tp1");
        IMetier metier=appCon.getBean(IMetier.class);
        System.out.println(metier.clalcul());
    }

}
