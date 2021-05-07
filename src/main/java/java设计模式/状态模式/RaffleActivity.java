package java设计模式.状态模式;

public class RaffleActivity {
	State state=null;
	int count=0;
	State noRaffleState=new NoRaffleState(this);
	State canRaffleState=new CanRaffleState(this);
	State dispensState=new DispenseState(this);
	State dispenseOuState=new DispenseOutState(this);
	RaffleActivity(int count){
		this.state= getNoRaffleState();
		this.count=count;
	}
	
	public void debuctMoney() {
		state.deductMoney();
	}
	public void raffle(){
		if(state.raffle()){
			state.dispensePrize();
		}
	}

	public void setState(State state) {
		this.state=state;
	}
    public State getState(){
		return state;
	}
	public void setCount(int count){
      this.count=count;
	}
	public int getCount(){
		int curCount=count;
		count--;
		return curCount;
	}
	public State getNoRaffleState() {
		return noRaffleState;
	}
	public void setNoRaffleState(State noRaffleState) {
		this.noRaffleState = noRaffleState;
	}

	public void setCanRaffleState(State canRaffleState) {
		this.canRaffleState = canRaffleState;
	}

	public State getCanRaffleState() {
		return canRaffleState;
	}

	public State getDispensState() {
		return dispensState;
	}

	public void setDispensState(State dispensState) {
		this.dispensState = dispensState;
	}

	public State getDispenseOuState() {
		return dispenseOuState;
	}

	public void setDispenseOuState(State dispenseOuState) {
		this.dispenseOuState = dispenseOuState;
	}

}
