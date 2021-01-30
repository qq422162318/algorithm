package java设计模式.状态模式;

public class DispenseOutState extends State {
    RaffleActivity activity;
    DispenseOutState(RaffleActivity activity){
        this.activity=activity;
    }
    @Override
    public void deductMoney() {
        // TODO Auto-generated method stub
        System.out.println("奖品发送完了,请下次再来");
    }

    @Override
    public boolean raffle() {
        // TODO Auto-generated method stub
        System.out.println("奖品发送完了,请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        // TODO Auto-generated method stub
       System.out.println("奖品发送完了,请下次再来参加");
    }
    
}