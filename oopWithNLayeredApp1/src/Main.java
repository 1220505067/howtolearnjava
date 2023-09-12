import business.ProductManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateProductDao;
import dataAccess.JdbcProductDao;
import entities.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Product product1= new Product(1,"Iphone Xr",10000);

        Logger[] loggers={new DataBaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager= new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);



    }
}