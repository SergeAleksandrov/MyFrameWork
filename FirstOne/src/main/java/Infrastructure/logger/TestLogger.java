package Infrastructure.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {

  int counter = 1;

  public void log(String msg){
    //Current time
    String time = "HH:mm:ss:SSS";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
    String currentTime = simpleDateFormat.format(new Date());
    //Name of the thread
    String currentThread = Thread.currentThread().getName();
    //Print
    String result = counter + ") " + currentTime + " [" + currentThread + "]: " + msg;
    System.out.println(result);
    counter++;
  }
}
