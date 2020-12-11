package java设计模式.原型模式.深拷贝;

import java.io.Serializable;

public class DeepCloneTarget implements Serializable,Cloneable {
    private static final long SERIALVERSION_UID=1L;
    private String cloneName;
    private String cloneClass;
    public DeepCloneTarget(String cloneName,String cloneClass){
        this.cloneClass=cloneClass;
        this.cloneName=cloneName;
    }

    @Override
    public String toString() {
        return "DeepCloneTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
