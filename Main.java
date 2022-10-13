import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Main {

  public static void main(String[] args) throws AWTException {
    Robot robo = new Robot();

    robo.setAutoDelay(120);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Rectangle retanguloPrint = new Rectangle(
        (int) screenSize.getWidth(),
        (int) screenSize.getHeight());
    BufferedImage imagemBuffer = robo.createScreenCapture(retanguloPrint);

    File arquivoImg = new File("print.jpg");
    try {
      ImageIO.write(imagemBuffer, "jpg", arquivoImg);
      if (arquivoImg.exists()) {
        System.out.println(arquivoImg.getAbsoluteFile());
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}