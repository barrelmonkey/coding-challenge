import com.opencsv.bean.CsvBindByName;

public class InventoryItem {

    @CsvBindByName(column = "sku")
    private String sku;

    @CsvBindByName(column = "item_name")
    private String name;

    @CsvBindByName(column = "stock_level")
    private int stockLevel;

    @CsvBindByName(column = "sold_today")
    private int soldToday;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getSoldToday() {
        return soldToday;
    }

    public void setSoldToday(int soldToday) {
        this.soldToday = soldToday;
    }
}
