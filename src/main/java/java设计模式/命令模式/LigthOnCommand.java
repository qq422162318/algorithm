package java设计模式.命令模式;

public class LigthOnCommand implements Command {
    LightReceiver lightReceiver;

    public LigthOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
     lightReceiver.on();
    }

    @Override
    public void undo() {
      lightReceiver.off();
    }
}
