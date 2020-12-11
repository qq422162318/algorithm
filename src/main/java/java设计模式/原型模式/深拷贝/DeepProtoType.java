package java设计模式.原型模式.深拷贝;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable
{
    public String name;
    public DeepCloneTarget deepCloneTarget;
    public DeepProtoType(){
        super();
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep=null;
        deep=super.clone();
        DeepProtoType deepProtoType= (DeepProtoType) deep;
        deepProtoType.deepCloneTarget= (DeepCloneTarget) deepCloneTarget.clone();
        return deepProtoType;
    }
    public Object deepClone(){
        ByteArrayOutputStream bos=null;
        ObjectOutputStream oos=null;
        ByteArrayInputStream bis=null;
        ObjectInputStream ois=null;
        DeepProtoType deepProtoType=null;
        try {
            //序列化
            bos=new ByteArrayOutputStream();
            oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis=new ByteArrayInputStream(bos.toByteArray());
            ois=new ObjectInputStream(bis);
            DeepProtoType copy= (DeepProtoType) ois.readObject();
            deepProtoType=copy;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return deepProtoType;
    }
}
