package java设计模式.状态模式;

import java.util.Random;

import javax.sound.sampled.SourceDataLine;

public class CanRaffleState extends State{
    RaffleActivity activity;
    public CanRaffleState(RaffleActivity activity){
        this.activity=activity;
    }
    @Override
    public void deductMoney() {
        // TODO Auto-generated method stub
         System.out.println("已经扣取过积分");
    }

    @Override
    public boolean raffle() {
        // TODO Auto-generated method stub
        Random r=new Random();
        int num=r.nextInt(10);
        if(num==0){
            activity.setState(activity.getDispensState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        // TODO Auto-generated method stub
        System.out.println("没中奖,不能发放奖品");

    }
    
}