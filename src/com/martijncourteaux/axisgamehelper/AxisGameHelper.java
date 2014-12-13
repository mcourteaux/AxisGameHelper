/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martijncourteaux.axisgamehelper;

import java.io.File;
import java.util.Locale;
import javax.swing.JFileChooser;

/**
 *
 * @author martijncourteaux
 */
public class AxisGameHelper
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        JFileChooser fc = new JFileChooser(new File(new File(System.getProperty("user.home")), "Desktop"));
        if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            DrawFrame dw = new DrawFrame(fc.getSelectedFile());
            dw.setSize(500, 400);
            dw.setLocationRelativeTo(null);
            dw.setVisible(true);
        }
    }

}
