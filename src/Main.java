
import javax.swing.JOptionPane;


public class Main {
    
    public static void main(String[] args){
        
        //THIS IS THE STARTUP LOADING PAGE
       SplashScreen sp = new SplashScreen();
       sp.setVisible(true);
       try {
           for(int i=0;i<=100;i++) {
               Thread.sleep(100);
               sp.LodingValue.setText(i+"%");
               
               if(i==20){
                   sp.LoadingLabel.setText("Getting ready...");
               }
               if(i==50){
                   sp.LoadingLabel.setText("Please be patient...");
               }
               if(i==70){
                   sp.LoadingLabel.setText("Connecting...");
               }
               if(i==80){
                   sp.LoadingLabel.setText("Getting there...");
               }
               if(i==94){
                   sp.LoadingLabel.setText("Loading Complete...");
               }
               sp.LoadingBar.setValue(i);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       sp.dispose();
       //THIS IS THE STARTUP LOADING PAGE

       //THIS IS THE MAIN PAGE
       mainPage mp = new mainPage();
       mp.setVisible(true);
       mp.setLocationRelativeTo(null);
       //THIS IS THE MAIN PAGE
       
       
       
    }
}
