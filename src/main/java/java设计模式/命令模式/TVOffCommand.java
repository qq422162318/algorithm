package java设计模式.命令模式;

public class TVOffCommand implements Command {
    LightReceiver lightReceiver;
    public TVOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver=lightReceiver;
    }

    @Override
    public void execute() {
       lightReceiver.off();
    }

    @Override
    public void undo() {
      lightReceiver.on();
    }
}
