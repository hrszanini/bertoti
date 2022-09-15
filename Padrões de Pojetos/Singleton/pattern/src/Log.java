
public class Log {

    private Log log; 

    private String logLevel;

    private Log(){
        logLevel = "Info";
    }

    public Log getInstance(){
        if(log == null){
            log = new Log();
        }

        return log;
    }

    public String getLogLevel(){
        return logLevel;
    }

    public void setLogLevel(String logLevel){
        this.logLevel = logLevel;
    }

}