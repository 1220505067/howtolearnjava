package dataAccess;

import entities.Product;

public class HibernateProductDao implements ProductDao {
    public void add(Product product){
        // sadece ve sadece db erişim kodları buraya yazılır...sql
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
