package dataAccess;

import entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){
        // sadece ve sadece db erişim kodları buraya yazılır...sql
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
