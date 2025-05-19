package tp1.pres;
import tp1.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXml {
    public static void main(String[] args){
        System.out.println("version XML");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println(metier.clalcul());
    }
}
