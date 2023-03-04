package gui;

import log.LogChangeListener;
import log.LogLevel;
import log.LogWindowSource;

import java.awt.Frame;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*class MyLogChangeListener implements LogChangeListener{

  @Override
  public void onLogChanged() {

  }
}

class MyThread extends Thread{
  public LogWindowSource amogus;
  @Override
  public void run(){
    while (true){
      var Listener = new MyLogChangeListener();
      amogus.registerListener(Listener);
      try {
        Thread.sleep(7);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      amogus.unregisterListener(Listener);
    }
  }
}*/

public class RobotsProgram
{
    public static void main(String[] args) throws InterruptedException {
      try {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
      } catch (Exception e) {
        e.printStackTrace();
      }
      SwingUtilities.invokeLater(() -> {
        MainApplicationFrame frame = new MainApplicationFrame();
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
      });
      /*var sdbs = new LogWindowSource(6);
      var myThread = new MyThread();
      myThread.amogus = sdbs;
      myThread.start();
      while (true){
        sdbs.append(LogLevel.Debug, "q");
        Thread.sleep(10);
      }*/
    }}
