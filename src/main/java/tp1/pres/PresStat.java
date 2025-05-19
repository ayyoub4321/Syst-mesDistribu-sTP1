package tp1.pres;

import tp1.Metier.Metier;
import tp1.dao.DaoImpl ;
import tp1.Metier.Metier;
public class PresStat {
    public static void main(String[] args) {
        System.out.println("presentation Static");
        DaoImpl dao=new DaoImpl();
        Metier metier= new Metier(dao);
        System.out.print(metier.clalcul());
        ;
    }

}
