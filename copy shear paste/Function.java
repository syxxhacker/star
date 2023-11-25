import java.io.IOException;

public interface Function {

    //复制功能
    public void copy() throws Exception;
    //剪切功能
    public void shear() throws Exception;
    //复制和剪切功能的写入操作
    public void save(String path) throws Exception;
    //粘贴功能
    public void paste() throws Exception;
    //粘贴功能的写入操作
    public void paste_file(String path) throws IOException;
}
