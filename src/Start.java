import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Start {
    static  JFrame jf = new JFrame();

    public static void start(){

        jf.setSize(400, 400);
        jf.setVisible(true);
        jf.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
                String date = dateFormat.format(calendar.getTime());
                System.out.println("Frame clicked in: " + date);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
