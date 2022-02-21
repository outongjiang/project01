package net.otj;




import java.io.File;

public class Test {
    public static void main(String[] args) {
        File file=new File("C:\\app\\ssm2\\1.txt");

        file.setReadable(false);
    }
}
