package 数据结构.线性表;

import java.io.*;
import java.util.Random;

public class Random10000 {
    public static void main(String[] args) throws IOException {
        int num=10000;
        Random random=new Random();
        OutputStreamWriter os=new OutputStreamWriter(new FileOutputStream("d:\\a.txt"),"utf-8");

        int i=0;
            while(i<num){
                System.out.println(random.nextInt(num));
                os.write(random.nextInt());
                i++;
            }
        }
    }

