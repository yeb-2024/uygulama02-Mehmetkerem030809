package org.example;

import javax.swing.*;
import java.awt.*;

public class girişSayfası {
    JFrame frame = new JFrame();
    JTextField kullanıcıAdı;
    JTextField şifre;

    public girişSayfası(){
        JPanel panelüst = new JPanel();
        panelüst.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel labelüst = new JLabel("Kullanıcı Adı:");
        labelüst.setFont(new Font("Arial",Font.PLAIN,20));

        kullanıcıAdı = new JTextField();
        kullanıcıAdı.setPreferredSize(new Dimension(300,60));

        JPanel panelalt = new JPanel();
        panelalt.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel labelalt = new JLabel("Parola: ");
        labelalt.setFont(new Font("Arial",Font.PLAIN,20));

        şifre = new JTextField();
        şifre.setPreferredSize(new Dimension(300,60));

        panelüst.add(labelüst);
        panelüst.add(kullanıcıAdı);

        panelalt.add(labelalt);
        panelalt.add(şifre);

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(450,300);
        frame.setLayout(new GridLayout(3,1));

        frame.add(panelüst);
        frame.add(panelalt);

        frame.setVisible(true);
    }
}
