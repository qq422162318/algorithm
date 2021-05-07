package java设计模式.命令模式;

public class RemoteController  {
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;
    public RemoteController(){
        onCommands=new Command[5];
        offCommands=new Command[5];
        for (int i = 0; i <5 ; i++) {
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    public void setOnCommands(int idx,Command onCommand,Command offCommand) {
        onCommands[idx]=onCommand;
        offCommands[idx]=offCommand;
    }
    public void onButtonClick(int idx){
        onCommands[idx].execute();
        undoCommand=onCommands[idx];

    }
    public void offButtonClick(int idx){
        offCommands[idx].execute();
        undoCommand=offCommands[idx];

    }
    public void undoButtonClick(){
       undoCommand.undo();

    }
}
