package tp1.pres;

import tp1.Metier.IMetier;
import tp1.dao.IDao;

import java.io.File;
import java.util.Scanner;
public class PresDynam {
    public static void main(String[] args) throws Exception {
        System.out.println("presentation Dynamique");
        Scanner sc = new Scanner(new File("config.txt"));
        String nameClassDao=sc.nextLine();
        System.out.println("nameClassDao: "+nameClassDao);
        Class cDao=Class.forName(nameClassDao);
        IDao d=(IDao)cDao.newInstance();
        String nameClassMitier=sc.nextLine();
        Class cMitier=Class.forName(nameClassMitier);
        IMetier m=(IMetier)cMitier.getConstructor(IDao.class).newInstance(d);
        System.out.print(m.clalcul());
    }
}
