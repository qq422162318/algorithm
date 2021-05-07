package Jvm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Load7 {
    public static void main(String[] args) throws Exception {
     MyClassLoader classLoader= new MyClassLoader();
    Class<?> c1=classLoader.loadClass("MapImpl1");
        Class<?> c2=classLoader.loadClass("MapImpl1");
        System.out.println(c1==c2);
        MyClassLoader classLoader2= new MyClassLoader();
        Class<?> c3=classLoader.loadClass("MapImpl1");
        System.out.println(c1==c3);
        c1.newInstance();
    }
      static class MyClassLoader extends ClassLoader{
        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException{
           String path="d:\\MYDOCUMENT\\解题\\output"+name+".class";
            try {
                ByteArrayOutputStream os=new ByteArrayOutputStream();
                Files.copy(Paths.get(path),os);
                byte[] bytes=os.toByteArray();
                return defineClass(name,bytes,0,bytes.length);
            } catch (Exception e) {
                e.printStackTrace();
                throw new ClassNotFoundException("类文件未得到");
            }
        }
    }
}
