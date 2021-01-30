package java设计模式.状态模式;

public class NoRaffleState extends State{
    RaffleActivity activity;
    NoRaffleState(RaffleActivity activity){
        this.activity=activity;
    }
    @Override
    public void deductMoney() {
        // TODO Auto-generated method stub
        System.out.println("扣除50积分成功");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        // TODO Auto-generated method stub
        System.out.println("扣了积分才能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        // TODO Auto-generated method stub
        System.out.println("不能发放奖品");
    }
   
}