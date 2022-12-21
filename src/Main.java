//Constants/Item imports must look like this:
//import static Utils.Constants.*;
import MainFiles.LoopMain;
import MainFiles.Tutorial;

public class Main {
    public static void main(String[] args) throws Exception {
      
      LoopMain mainLoopCall = new LoopMain();
      Tutorial tutorial = new Tutorial();

      tutorial.tutorialCall();
      mainLoopCall.mainLoop();

    }
}
