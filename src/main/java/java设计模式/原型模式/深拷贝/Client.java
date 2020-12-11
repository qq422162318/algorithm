package java设计模式.原型模式.深拷贝;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name="songjiang";
        deepProtoType.deepCloneTarget=new DeepCloneTarget("大牛","yy");
        DeepProtoType clone = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType.name);
        System.out.println(clone.name);
        System.out.println(deepProtoType.deepCloneTarget.hashCode());
        System.out.println(clone.deepCloneTarget.hashCode());

        DeepProtoType o = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.deepCloneTarget.hashCode());
        System.out.println(o.deepCloneTarget.hashCode());
        System.out.println(o.deepCloneTarget.toString());
    }
}