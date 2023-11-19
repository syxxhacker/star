public class test_myarray {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);

        System.out.println(myArray.get(2));
        System.out.println(myArray);
    }
}
