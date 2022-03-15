
public class Invoker {
    private Command command;
    //受氣包，接受命令
    public void setCommand(Command _command) {
        this.command = _command;
    }
    //執行命令
    public void action() {
        this.command.execute();
    }
}