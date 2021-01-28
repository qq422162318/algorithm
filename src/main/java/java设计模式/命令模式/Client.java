package java设计模式.命令模式;

public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();
        LigthOnCommand ligthOnCommand = new LigthOnCommand(lightReceiver);
        LigthOffCommand ligthOffCommand = new LigthOffCommand(lightReceiver);

        RemoteController remoteController = new RemoteController();
        remoteController.setOnCommands(0,ligthOnCommand,ligthOffCommand);
        remoteController.onButtonClick(0);
        remoteController.offButtonClick(0);
        remoteController.undoButtonClick();
    }
}
