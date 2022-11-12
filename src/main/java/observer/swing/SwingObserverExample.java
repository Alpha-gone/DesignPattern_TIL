package observer.swing;

import javax.swing.*;

import static java.awt.BorderLayout.CENTER;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go(){
        jFrame = new JFrame();

        JButton jButton = new JButton("할까? 말까?");

        jButton.addActionListener(e -> System.out.println("하지 마! 아마 후회할 걸?"));
        jButton.addActionListener(e -> System.out.println("그냥 저질러 버렷!!!"));

        jFrame.getContentPane().add(CENTER, jButton);

        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.getContentPane().add(CENTER, jButton);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
