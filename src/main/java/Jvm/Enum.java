package Jvm;

public class Enum {

    enum Sex{
        MALE,FEMALE
    }

    public static void foo(Sex sex) {
        switch (sex){
            
            case MALE:
                System.out.println("男");
            case FEMALE:
                System.out.println("女");
        }
    }
}
