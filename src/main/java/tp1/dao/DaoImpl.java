package tp1.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao{
    @Override
    public double getData(){
        System.out.println("getData Implements 1");
        return 0.25;
    }
    public DaoImpl(){}
}
