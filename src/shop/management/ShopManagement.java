/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop.management;

import java.awt.SplashScreen;
import lk.project.shopmanagement.view.main_menu;
import lk.project.shopmanagement.view.splashscreen;

/**
 *
 * @author NIWANTHA
 */
public class ShopManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, Exception{
        splashscreen splash = new splashscreen();
        for(int i = 0;i<101;i++)
        {
            Thread.sleep(40);
            splash.setVisible(true);
            splash.loard_text.setText("Loading.."+i+"%");
            splash.loard_bar.setValue(i);
            
            if(i == 100)
            {
                splash.setVisible(false);
                main_menu menu = new main_menu();
                menu.setVisible(true);
            }  
        }
        
    }
    
}
