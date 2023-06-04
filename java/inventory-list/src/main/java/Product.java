import com.opencsv.bean.CsvBindByName;

public class Product {
    @CsvBindByName(column = "sku")
    private String sku;

    @CsvBindByName(column = "item_name")
    private String name;

    @CsvBindByName(column = "target_daily_sales")
    private int dailyTarget;

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

    public int getDailyTarget() {
        return dailyTarget;
    }

    public void setDailyTarget(int dailyTarget) {
        this.dailyTarget = dailyTarget;
    }
}
