package java设计模式.状态模式;

public class Client {
    public static void main(String[] args) {
        RaffleActivity activity=new RaffleActivity(1);
        for (int i = 0; i < 3; i++) {
            System.out.println("---第"+(i+1)+"次抽奖");
            activity.debuctMoney();
            activity.raffle();
        }
    }
}