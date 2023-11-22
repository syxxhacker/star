import java.util.Collection;
import java.util.List;

public interface GoodsManager {
    //添加商品方法，返回值为空
    public void add_goods();

    //删除商品方法，这里传入的是编号
    public void del_goods();

    //更新方法,更新商品的所有内容，按照商品编号更新
    public void update_goods();

    //查询商品，有返回值
    public Goods find_no(String no);

    //查询所有
    public Collection<Goods> find_all();

    //按商品名称查，返回很多商品
    public List<Goods> find_name();

    //按商品价格查询，返回很多商品
    public List<Goods> find_price();

}
