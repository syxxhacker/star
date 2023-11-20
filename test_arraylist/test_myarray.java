public class test_myarray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        for (int i = 0;i < 10;i++){
            myArray.add(i);
        }

        //删除值，remove
        myArray.remove(2);
        System.out.println("删除后：" + myArray);

        //修改值，set
        myArray.set(3,100);
        System.out.println("修改后后：" + myArray);

        //取值，get
        System.out.println("取出值：" + myArray.get(3));

        //查找数组中值的下标，indexOf
        System.out.println("查找的值的下标：" + myArray.indexOf(100));

        //清空值，clear
        myArray.clear();
        System.out.println("清空后：" + myArray);
    }
}
