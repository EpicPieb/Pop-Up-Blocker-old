import javax.swing.*;

import QoLTools.SwingExtras;
import java.awt.event.*;
import java.awt.*;

public class popups {
    public static void main(String[] args) {
        popup3();
    }
    private static Menu menu;
    public popups(Menu input) {
        menu = input;
    }
    public static JFrame pp0f;
    public static JFrame pp1f;
    public static JFrame pp2f;
    public static JFrame pp3f;
    public static JFrame pp4f;
    public static JFrame pp5f;
    public static JFrame pp6f;
    public static JFrame pp7f;
    public static JFrame pp8f;
    public static JFrame pp9f;

    protected static void popup0() {
        pp0f = new JFrame("HOT CHICKS");
        pp0f.setSize(348, 275);
        pp0f.setLocation(SwingExtras.JFrameRandomX(348), SwingExtras.JFrameRandomY(275));
        JPanel pp0p = new JPanel();
        ImageIcon img = new ImageIcon("assets/textures/popups/hot chicks.png");
        JLabel imageLabel = new JLabel(img);
        imageLabel.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        imageLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Gameplay.retard(menu);
            }
        });
        JLabel label = new JLabel("HOT CHICKS NEAR YOU");
        label.setBounds(25, 200, 348, 24);
        Font font = new Font("Arial", Font.BOLD, 24);
        label.setFont(font);
        label.setForeground(Color.WHITE);
        pp0p.setLayout(null);
        pp0p.setBackground(Color.BLACK);
        pp0p.add(imageLabel);
        pp0p.add(label);
        pp0f.add(pp0p);
        pp0f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp0f.setVisible(true);
    }
    protected static void popup1() {
        pp1f = new JFrame("DOWNLOAD NOW");
        pp1f.setSize(300, 200);
        pp1f.setLocation(SwingExtras.JFrameRandomX(348), SwingExtras.JFrameRandomY(275));
        JPanel pp1p = new JPanel();
        pp1p.setLayout(null);
        ImageIcon gif = new ImageIcon("assets/textures/popups/sketchy ass button.gif");
        JLabel gifLabel = new JLabel(gif);
        gifLabel.setBounds(25, 10, gif.getIconWidth() + 50, gif.getIconHeight() + 20);
        gifLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Gameplay.retard(menu);
            }
        });
        JLabel label = new JLabel("<html>ARE YOU SURE YOU WANT TO DOWNLOAD THE FILE???<html>");
        label.setBounds(25, 64, 200, 100);
        pp1p.add(gifLabel);
        pp1p.add(label);
        pp1f.add(pp1p);
        pp1f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp1f.setVisible(true);
    }
    protected static void popup2() {
        pp2f = new JFrame("ANNOYING POP UPS AHEAD");
        pp2f.setSize(300, 207);
        pp2f.setLocation(SwingExtras.JFrameRandomX(348), SwingExtras.JFrameRandomY(275));
        JPanel pp2p = new JPanel();

        ImageIcon annoy = new ImageIcon("assets/textures/popups/annoyingpopup.png");
        JLabel annnoying = new JLabel(annoy);
        annnoying.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Gameplay.retard(menu);
            }
        });

        pp2p.setLayout(new BorderLayout());
        pp2p.add(annnoying, BorderLayout.CENTER);
        pp2f.add(pp2p);
        pp2f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp2f.setVisible(true);
    }
    protected static void popup3() {
        pp3f = new JFrame("WATCH MORBIUS IN 1 APRIL");
        pp3f.setSize(268, 412);
        pp3f.setLocation(SwingExtras.JFrameRandomX(348), SwingExtras.JFrameRandomY(275));
        JPanel pp3p = new JPanel();
        pp3p.setLayout(new BorderLayout());

        ImageIcon mor = new ImageIcon("assets/textures/popups/MORBIUS.png");
        JLabel morb = new JLabel(mor);
        morb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Gameplay.retard(menu);
            }
        });

        pp3p.add(morb, BorderLayout.CENTER);
        pp3f.add(pp3p);
        pp3f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp3f.setVisible(true);
    }
    protected static void popup4() {
        pp4f = new JFrame();
        JPanel pp4p = new JPanel();
        pp4p.setLayout(null);
        pp4f.add(pp4p);
        pp4f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp4f.setVisible(true);
    }
    protected static  void popup5() {
        pp5f = new JFrame();
        JPanel pp5p = new JPanel();
        pp5p.setLayout(null);
        pp5f.add(pp5p);
        pp5f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp5f.setVisible(true);
    }
    protected static void popup6() {
        pp6f = new JFrame();
        JPanel pp6p = new JPanel();
        pp6p.setLayout(null);
        pp6f.add(pp6p);
        pp6f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp6f.setVisible(true);
    }
    protected static void popup7() {
        pp7f = new JFrame();
        JPanel pp7p = new JPanel();
        pp7p.setLayout(null);
        pp7f.add(pp7p);
        pp7f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp7f.setVisible(true);
    }
    protected static void popup8() {
        pp8f = new JFrame();
        JPanel pp8p = new JPanel();
        pp8p.setLayout(null);
        pp8f.add(pp8p);
        pp8f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp8f.setVisible(true);
    }
    protected static void popup9() {
        pp9f = new JFrame();
        JPanel pp9p = new JPanel();
        pp9p.setLayout(null);
        pp9f.add(pp9p);
        pp9f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Gameplay.closed++;
            }
        });
        pp9f.setVisible(true);
    }
}
