import javax.swing.JFrame;
import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class jframetest {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.setTitle("goobious");
        
        ImageIcon logoIcon = new ImageIcon("closed.png");
        Image logo = logoIcon.getImage();
        frame.setIconImage(logo);

        frame.setResizable(false);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        int w = frame.getSize().width;
        int h = frame.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        frame.setLocation(x, y);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        frame.setJMenuBar(menuBar);

    }
}

// https://www.java-made-easy.com/java-jframe.html