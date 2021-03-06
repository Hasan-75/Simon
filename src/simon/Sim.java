package simon;


import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hasan
 */
public class Sim extends javax.swing.JFrame {
    Integer i = 0;
    Color r[] = {new Color(204,0,0), new Color(234,0,0)};
    Color g[] = {new Color(0,153,0), new Color(0,200,0)};
    Color b[] = {new Color(0,51,153), new Color(0,51,210)};
    Color o[] = {new Color(255,102,0), new Color(255,170,0)};
    Integer count = 1;
    boolean gameOver = false;
    JLabel uClicked[];
    JLabel a[];
    
    private void playGame() {
        i = 0;
        uClicked = new JLabel[count];
        cnt.setText(i.toString()+"/"+count.toString());
        new Thread(){
            public void run(){
                try {
                    Thread.sleep(2000);
                    makePattern();
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sim.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    /**
     * Creates new form Sim
     */
    public Sim() {
        initComponents();
        this.a = new JLabel[]{red, green, blue, orange};
        playGame();      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cnt = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        gameOv = new javax.swing.JLabel();
        gameOv.setVisible(false);
        orange = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        blue = new javax.swing.JLabel();
        green = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simon");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/simon/icon.jpg")).getImage());
        setMinimumSize(new java.awt.Dimension(771, 600));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        cnt.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cnt.setForeground(new java.awt.Color(255, 255, 255));
        cnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cnt.setText("0/1");
        cnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cnt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(cnt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 170, 560);

        jPanel2.setLayout(null);

        gameOv.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        gameOv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameOv.setText("Game Over");
        jPanel2.add(gameOv);
        gameOv.setBounds(120, 170, 350, 170);

        orange.setBackground(new java.awt.Color(255, 102, 0));
        orange.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        orange.setOpaque(true);
        orange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orangeMouseClicked(evt);
            }
        });
        jPanel2.add(orange);
        orange.setBounds(40, 300, 250, 240);

        red.setBackground(new java.awt.Color(204, 0, 0));
        red.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        red.setOpaque(true);
        red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                redMouseClicked(evt);
            }
        });
        jPanel2.add(red);
        red.setBounds(320, 30, 250, 240);

        blue.setBackground(new java.awt.Color(0, 51, 153));
        blue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        blue.setOpaque(true);
        blue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                blueMouseClicked(evt);
            }
        });
        jPanel2.add(blue);
        blue.setBounds(320, 300, 250, 240);

        green.setBackground(new java.awt.Color(0, 153, 0));
        green.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        green.setOpaque(true);
        green.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                greenMouseClicked(evt);
            }
        });
        jPanel2.add(green);
        green.setBounds(40, 30, 250, 240);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(170, 0, 600, 560);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_redMouseClicked
        // TODO add your handling code here:
        uClicked[i] = red;
        i++;
        cnt.setText(i.toString()+"/"+count.toString());
        hoverEffect(red, r);
        Clicked(red);
    }//GEN-LAST:event_redMouseClicked

    private void greenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_greenMouseClicked
        // TODO add your handling code here:
        uClicked[i] = green;
        i++;
        cnt.setText(i.toString()+"/"+count.toString());
        hoverEffect(green, g);
        Clicked(green);
    }//GEN-LAST:event_greenMouseClicked

    private void orangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orangeMouseClicked
        // TODO add your handling code here:
        uClicked[i] = orange;
        i++;
        cnt.setText(i.toString()+"/"+count.toString());
        hoverEffect(orange, o);
        Clicked(orange);
    }//GEN-LAST:event_orangeMouseClicked

    private void blueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blueMouseClicked
        // TODO add your handling code here:
        uClicked[i] = blue;
        i++;
        cnt.setText(i.toString()+"/"+count.toString());
        hoverEffect(blue, b);
        Clicked(blue);
    }//GEN-LAST:event_blueMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Sim sim;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sim().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel blue;
    private javax.swing.JLabel cnt;
    private javax.swing.JLabel gameOv;
    private javax.swing.JLabel green;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel orange;
    private javax.swing.JLabel red;
    // End of variables declaration//GEN-END:variables
    
    
    
    private void hoverEffect(JLabel l, Color c[]) {
        new Thread(){
            public void run(){
                try {
                    l.setBackground(c[1]);
                    Thread.sleep(200);
                    l.setBackground(c[0]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sim.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    private void Clicked(JLabel l) {
        String audio = null;
        if(l == green){
            audio = "GREEN.wav";
            
        }
        if(l == red){
           // System.out.println("r");
            audio = "RED.wav";
        }
        if(l == orange){
           // System.out.println("o");
            audio = "ORANGE.wav";
        }
        if(l == blue){
         //   System.out.println("b");
            audio = "BLUE.wav";
        }
        
        playSound(audio);
    }
    
    
    
    void makePattern(){
        JLabel la[] = new JLabel[count];
        
        for(int i = 0; i<count; i++){
            int tmp = (int)(Math.random()*4);
            la[i] = a[tmp];
            
        }
        makeClick(la);
    }

    private void playSound(String audio) { 
        
        new Thread(){
            public void run(){
                try {
                    AudioInputStream stream;
                    Clip clip;
                    InputStream in = getClass().getResourceAsStream(audio);
                    InputStream bufferedIn = new BufferedInputStream(in);
                    stream = AudioSystem.getAudioInputStream(bufferedIn);
                    clip = AudioSystem.getClip();
                    clip.open(stream);
                    clip.start();
                }
                catch (Exception e) {
                    //whatevers
                    System.out.println(e);
                }
            }
        }.start();
    }
    
    
    void makeClick(JLabel la[]){
       
        Thread t = new Thread(){
                    public void run(){
                        for(JLabel l : la){
                            if(l == green){
                                hoverEffect(l, g);
                            }
                            else if(l == red){
                                hoverEffect(l, r);
                            }
                            else if(l == blue){
                                hoverEffect(l, b);
                            }
                            else if(l == orange){
                                hoverEffect(l, o);
                            }
                            Clicked(l);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Sim.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                };
        t.start();
       while(t.isAlive()){
           
       }
       checkClick(la);
    }

    private void checkClick(JLabel la[]){
        
        while(i<count){
            //System.out.println("***");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sim.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        for(int j=0; j<count; j++){
            if(uClicked[j] != la[j]){
                gameOver = true;
            }
            
        }
        if(gameOver){
            try {
                gameOv.setVisible(true);
                Thread.sleep(3000);
                System.exit(0);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Sim.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        count++;
        playGame();
    }
   
}
