package refactoring.factory_method.example.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: refactoring
 * @description: 另一个具体产品
 * @author: ycbron
 * @create: 2021-01-06 00:50
 **/
public class WindowsButton implements Button{
    JPanel panel = new JPanel();
    JFrame jFrame = new JFrame();
    JButton button;

    @Override
    public void render() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        jFrame.setSize(320, 200);
        jFrame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
