
public abstract class Handler {
    private Handler nextHandler;

    //每個處理者都必須對請求做出處理
    public final Response handleMessage(Request request) {
        Response response = null;
        //判斷是否是自己的處理級別
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else { //不屬於自己的處理級別
            //判斷是否有下一個處理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                //沒有適當的處理者，業務自行處理
            }
        }
        return response;
    }

    //設置下一個處理者是誰
    public void setNext(Handler _handler) {
        this.nextHandler = _handler;
    }

    //每個處理者都有一個處理級別
    protected abstract Level getHandlerLevel();

    //每個處理者都必須實現處理任務
    protected abstract Response echo(Request request);
}