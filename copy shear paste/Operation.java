import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Operation implements Function{
    public Operation() {
    }

    //复制和剪切功能的写入操作
    @Override
    public void save(String path) throws Exception{
        //字符读取，这里的path是要复制和剪切的路径
        FileReader fileReader = new FileReader(path);
        //字符输出，复制和剪切后的路径都存在一个临时文件夹temp中
        FileWriter fileWriter = new FileWriter("F:\\javafile\\temp\\1.txt");
        BufferedReader bu_read = new BufferedReader(fileReader);
        BufferedWriter bu_write = new BufferedWriter(fileWriter);
        //定义变量line，接收每一行的数据
        String line;
        //判断文件中的每一行是否为空，不为空则继续循环，为空就是没有字符了，退出循环
        while ((line=bu_read.readLine())!=null){
            //写入
            bu_write.write(line);
            //换行
            bu_write.write("\n");
        }
        //关闭文件
        bu_read.close();
        bu_write.close();
    }

    //粘贴功能的写入操作
    @Override
    public void paste_file(String path) throws IOException {
        //字符读取，因为复制和粘贴后的文件路径都存放在了temp中，所以要将其内容粘贴，直接读取temp中的文件
        FileReader fileReader = new FileReader("F:\\javafile\\temp\\1.txt");
        //字符输出，这里的path是要粘贴的路径
        FileWriter fileWriter = new FileWriter(path);
        BufferedReader bu_read = new BufferedReader(fileReader);
        BufferedWriter bu_write = new BufferedWriter(fileWriter);
        //定义变量line，接收每一行的数据
        String line;
        //判断文件中的每一行是否为空，不为空则继续循环，为空就是没有字符了，退出循环
        while ((line=bu_read.readLine())!=null){
            //写入
            bu_write.write(line);
            //换行
            bu_write.write("\n");
        }
        //关闭文件
        bu_read.close();
        bu_write.close();
    }

    //复制文件操作
    @Override
    public void copy() throws Exception {
        Scanner scanner = new Scanner(System.in);
        //由用户选择复制的文件路径
        System.out.println("你要复制的文件路径：");
        String path = scanner.next();
        //定义myfile
        File myfile = new File(path);
        try{
            //判断文件是否在文件夹中存在，如果存在，则可以将这个文件复制下来
            myfile.exists();
            //调用复制和剪切功能的写入操作的这个函数
            this.save(path);
        }catch (Exception e){
            //不存在则抛出 文件不存在
            System.out.println("文件不存在！");
        }

    }

    //剪切文件操作
    @Override
    public void shear() throws Exception{
        Scanner scanner = new Scanner(System.in);
        //由用户选择剪切的文件路径
        System.out.println("你要剪贴的文件路径：");
        String path = scanner.next();
        //定义myfile
        File myfile = new File(path);
        try{
            //判断文件是否在文件夹中存在，如果存在，则可以将这个文件剪切下来
            myfile.exists();
            //调用复制和剪切功能的写入操作的这个函数
            this.save(path);
            //文件剪切之后，文件夹就没有这个文件了，所以进行删除操作，而剪切的文件路径已经存放进缓存了
            //注意：必须要先把文件关闭了才能删除文件
            myfile.delete();
        }catch (Exception e){
            //不存在则抛出 文件不存在
            System.out.println("文件不存在！");
        }

    }

    //粘贴文件操作
    @Override
    public void paste() throws Exception{
        Scanner scanner = new Scanner(System.in);
        //由用户选择粘贴的文件路径
        System.out.println("你要粘贴到的文件的路径：");
        String path = scanner.next();
        //定义myfile
        File myfile = new File(path);
        //当我们将一个文件复制到一个文件夹中时，如果存在同名的文件，会进行询问  替换源文件还是跳过
        //所以判断，如果文件存在
        if(myfile.exists()){
            //弹出提示
            System.out.println("目标已包含一个名为" + myfile.getName() + "的文件");
            //用户选择替换原文件还是跳过
            System.out.println("替换目标中的文件(R)");
            System.out.println("跳过该文件(S)");
            //接收用户的选择
            String option = scanner.next().toUpperCase();
            switch (option) {
                case "R":
                    //用户选择R，则替换掉原来的文件，将新的内容写进文件
                    paste_file(path);
                    break;
                case "S":
                    //用户选择S，则跳过文件，新文件内容不写入文件中，直接break
                    break;
            }
        }else {
            //如果不存在同名的文件，则直接写入
            paste_file(path);
        }

    }
}
