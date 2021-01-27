package java设计模式.装饰者模式;

import javax.print.DocPrintJob;

public class DeCaf extends Coffee {
    public DeCaf(){
        super();
        setDes("DeCaf ");
        setPrice(1.0f);
    }
}
