public class Goods {
    //属性私有化
    //商品编号
    private String no;
    //商品名称
    private String name;
    //商品价格
    private double price;
    //商家名称
    private String shop;
    //商品分类
    private String type;

    //封装构造函数，全参的和无参的
    public Goods() {
    }

    public Goods(String no, String name, double price, String shop, String type) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.shop = shop;
        this.type = type;
    }

    //以下是getter和setter方法
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //打印对象，显示本类中所有 属性的值
    @Override
    public String toString() {
        return "Goods{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", shop='" + shop + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
