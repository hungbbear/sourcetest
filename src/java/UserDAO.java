
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hung
 */
public class UserDAO {
    public static List layDS(String username){
        Session session = HibernateUtil.SessionFactory.getCurrentSession();
    }
}
