package java设计模式.模板模式;

public abstract class SoyaMilk {

    final void make(){
        System.out.println("SoyaMilk making");
        select();
        if (bool())
        addCondiments();
        soak();
        beat();
    }
    void select(){
        System.out.println("selecting");
    }
    abstract void addCondiments();
    void soak(){
        System.out.println("soaking");
    }
    void beat(){
        System.out.println("beating");
    }
    abstract boolean bool();
}
