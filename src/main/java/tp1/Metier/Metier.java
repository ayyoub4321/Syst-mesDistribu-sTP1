package tp1.Metier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tp1.dao.IDao;
@Component("m")
public class Metier implements IMetier {
        @Autowired
    IDao dao;
    //    couplage faible
    public Metier(IDao dao) {
        this.dao = dao;
    }
    public Metier() {}

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double clalcul(){
        return dao.getData();
    }
}
