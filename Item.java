public class Item {
    //atribut milik dari object Item.
    private double itemPrice;
    private String itemName;
    private String itemCode;
    private int itemStock;

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemStock() {
        return itemStock;
    }

    public void setItemStock(int itemStock) {
        this.itemStock = itemStock;
    }

    public Item(int itemStock) {
        this.itemStock = itemStock;
    }

    //Default constructor
    public Item(){}

    public Item(String name, String code){
        this.itemName = name;
        this.itemCode = code;
    }

    public Item(double price, String code, String name){

    }

    public Item(String name, double price, String code){

    }

    //Konstruktor: dijalankan saat proses instansiasi.
    public Item(String code, String name, double price, int stock) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemStock = stock;
    }

    public int updateStock(int stockUpdate){
        this.itemStock += stockUpdate;
        return itemStock;
    }

    public double getPrice() {
        return itemPrice;
    }

    public String getCode(){
        return itemCode;
    }

    public String getName(){
        return itemName;
    }

    public int getStock(){
        return itemStock;
    }

    public double getTotalPrice() {
        return itemPrice * itemStock;
    }
}