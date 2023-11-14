public class Multiplication_table {
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++){
            for (int j =1; j <= i;j++){
                int sum = j * i;
                System.out.print(j + "x" + i + "=" + sum + "\t");
            }
            System.out.println("");
        }
    }
}
