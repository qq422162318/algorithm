package Jvm;

import jdk.internal.org.objectweb.asm.ClassWriter;

public class Load5_2 {
    public static void main(String[] args) throws ClassCastException, ClassNotFoundException {
        Class<?> aClass=Class.forName("Jvm.G");
        System.out.println(aClass.getClassLoader());
    }
}
