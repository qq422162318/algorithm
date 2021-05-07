package java设计模式.状态模式;

import javax.sound.sampled.SourceDataLine;

public class DispenseState extends State{
    RaffleActivity activity;
    DispenseState(RaffleActivity activity){
        this.activity=activity;
    }
    @Override
    public void deductMoney() {
        // TODO Auto-generated method stub
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        // TODO Auto-generated method stub
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        // TODO Auto-generated method stub
        if(activity.getCount()>0){
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRaffleState());
        }else{
            System.out.println("很遗憾,奖品发送完了");
            activity.setState(activity.getDispenseOuState());
        }
    }
    
}