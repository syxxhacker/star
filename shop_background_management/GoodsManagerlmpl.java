import java.util.*;

public class GoodsManagerlmpl implements GoodsManager{
    //设置一个hashmap,属性封装，私有类型
    private Map<String,Goods> goods_list = new HashMap<>();
    private int size = 0;

    @Override
    public void add_goods() {
        //需要输入商品的名称，价格，商家，分类
        Scanner scanner = new Scanner(System.in);
        //接收商品名称
        System.out.println("请输入添加商品的名称：");
        String name = scanner.next();
        //接收商品的价格
        System.out.println("请输入添加商品的价格：");
        double price = 0;
        try{
            price = scanner.nextDouble();
        }catch (Exception e){
            price = 99999;
        }
        //接收商品的名称
        System.out.println("请输入添加商家的名称：");
        String shop = scanner.next();
        //商品分类
        System.out.println("商品分类：");
        String type = scanner.next();
        //随机产生一个no，产生后加上一个索引,size可以为当前商品的索引值
        //加上一串随机id
        String no = Integer.toString((int)(Math.random()*100000000));
        //加上一串随机id,+号换成concat,因为+号会产生StringBuilder
        //String no = UUID.randomUUID().toString().concat(Integer.toString(size));
        //实例化
        Goods goods = new Goods(no,name,price,shop,type);
        goods_list.put(no,goods);
        size++;

    }

    @Override
    public void del_goods() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要删除的商品的编号：");
        String no = scanner.next();
        //是否确认删除
        System.out.println("确定删除该商品吗？(y/n)");
        String option = scanner.next();
        if (option.toLowerCase().equals("y")) {
            goods_list.remove(no);
            System.out.println("删除成功！");
        }else {
            System.out.println("删除取消！");
        }
    }

    @Override
    public void update_goods() {
        Scanner scanner = new Scanner(System.in);
        //用户输入编号
        System.out.println("请输入商品编号:");
        String no = scanner.next();
        //按照商品的编号修改，先把商品拿出来
        Goods goods= goods_list.get(no);
        //输入需要修改的内容
        System.out.println("商品原来的名称：");
        System.out.println(goods.getName());
        //输入修改名称
        System.out.println("请输入修改后的名称：");
        String name = scanner.next();
        //商品原来的价格
        System.out.println("商品原来的价格：");
        System.out.println(goods.getPrice());
        //输入修改后的价格
        System.out.println("请输入修改后的价格：");
        double price = goods.getPrice();
        try{
            price = scanner.nextDouble();
        }catch (Exception e){
            price =99999;
        }
        //商家原来的名称
        System.out.println("商家原来的名称：");
        System.out.println(goods.getShop());
        //输入修改后的商家名称
        System.out.println("请输入修改后的名称：");
        String shop = scanner.next();
        //商品原来的类型
        System.out.println("商品原来的类别：");
        System.out.println(goods.getType());
        //输入修改后的商品类别
        System.out.println("请输入修改后的类别：");
        String type = scanner.next();

        //修改商品属性值，利用hashmap的key值覆盖
        goods = new Goods(goods.getNo(),name,price,shop,type);
        goods_list.put(goods.getNo(), goods);
        System.out.println("修改成功！");

    }

    @Override
    public Goods find_no(String no) {
        return goods_list.get(no);
    }

    @Override
    public Collection<Goods> find_all() {
        //显示所有，遍历HashMap,遍历值即可
        return goods_list.values();
    }

    @Override
    public List<Goods> find_name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要查找的商品：");
        String name = scanner.next();
        //查找商品
        List<Goods> result = new ArrayList<>();
        Collection<Goods> mygoods = goods_list.values();
        //用迭代器查找
        Iterator<Goods> myiter = mygoods.iterator();
        //如果有下一个，就继续循环
        while(myiter.hasNext()){
            Goods goods = myiter.next();
            if(goods.getName().indexOf(name) > -1){
                result.add(goods);
            }
        }
        return result;
    }

    @Override
    public List<Goods> find_price() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品价格范围：");
        double start = scanner.nextDouble();
        double end = scanner.nextDouble();
        //查找商品
        List<Goods> result = new ArrayList<>();
        Collection<Goods> mygoods = goods_list.values();
        //用迭代器查找
        Iterator<Goods> myiter = mygoods.iterator();
        //如果有下一个，就继续循环
        while(myiter.hasNext()){
            Goods goods = myiter.next();
            if(goods.getPrice() >= start && goods.getPrice() <= end){
                result.add(goods);
            }
        }
        return result;
    }
}
