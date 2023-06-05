import java.io.FileNotFoundException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        try{
            listProducts();
            listStockLevels();
            System.out.println("\n Congratulations! The errors have been fixed and this program completed successfully");
        }
        catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }

     public static void listStockLevels() throws Exception {
        System.out.println("Here are your current stock levels");

        List<InventoryItem> items = new ArrayList();
        items = new CSVParser().readCsvToBeanList("inventory.csv", InventoryItem.class, items);
        for (InventoryItem i : items) {
            System.out.println(i.getSku()+ " - " + i.getName() + " - " + i.getStockLevel());
        }
    }

    private static void listProducts() throws Exception {
        System.out.println("Here is a list of your currently registered products");

        List<Product> products = new ArrayList();
        products = new CSVParser().readCsvToBeanList("products.csv", Product.class, products);
        for (Product p : products) {
            System.out.println(p.getSku()+ " - " + p.getName() + ". Your targeted daily sales are " + p.getDailyTarget());
        }
    }
}