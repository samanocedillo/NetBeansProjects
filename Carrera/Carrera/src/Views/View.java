/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Button;
import java.awt.Image;
import static java.awt.Image.SCALE_DEFAULT;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author marti
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    
    private boolean guepardo = false;
    private boolean torturga = false;
    
   class Guepardo implements Runnable{
     
     private double Tiempo = 5;
     private JLabel Imagen;
     private JLabel Movimiento;
     private JLabel shot;
     private JLabel Ganador;
     private JButton Iniciar;
     
    public Guepardo(double Tiempo,JLabel Imagen,JLabel Movimiento,JLabel Tiro,JLabel Ganador,JButton Iniciar){
        this.Tiempo= Tiempo;
        this.Imagen =Imagen;
        this.Movimiento = Movimiento;
        this.shot = Tiro;
        this.Ganador = Ganador;
        this.Iniciar = Iniciar;
    }
  
            @Override
            public void run() {
                Ganador.setVisible(false);
                Iniciar.setVisible(false);
                int width = Movimiento.getLocation().x;
                int cX = Imagen.getLocation().x;
                int cY = Imagen.getLocation().y;
                
                int temp = cX;
                int var = width - cX;
                var = var /20;
                
                for (int y = 0; y < 5; y++)
                {
                    guepardo = false;
                    cX = temp;
                    shot.setText(String.valueOf(y + 1));
                    
                    for (int x = 0; x < 20; x++)
                    {
                        String ruta = "Img/guepardo.gif";
                        ImageIcon fot = new ImageIcon(ruta);
                        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Imagen.getWidth(),
                                Imagen.getHeight(),Image.SCALE_DEFAULT));
                        Imagen.setIcon(icono);
                        //Imagen.setLocation(temp, cY);
                        
                        //int anota = 5 + (int) (Math.random() *((10-5) + 1))
                        cX = cX + var;
                        Imagen.setLocation(cX,cY);
                        
                        for (double i = 0; i <= this.Tiempo; i = i + 0.1)
                        {
                            dormir();
                        }


                        }

                        String ruta ="";
                        ImageIcon fot = new ImageIcon(ruta);
                        Icon icono = new ImageIcon(fot.getImage().getScaledInstance(Imagen.getWidth(),
                                Imagen.getHeight(),
                                Image.SCALE_DEFAULT));

                        Imagen.setIcon(icono);
                        Imagen.setLocation(temp, cY);

                        int anota = 5 + (int) (Math.random() * ((10 -5) + 1));
                        guepardo = true;
                        fin();

                    

                    Ganador.setVisible(true);
                    Iniciar.setVisible(true);

                }
            
        }
            
            
        public void fin()
                {
                    if (torturga == false && guepardo == false)
                    {
                    }
                    
                        if (torturga == true) 
                        {
                            System.out.println("Toturga gana");
                            Ganador.setText("gana torturga");
                        } 
                        if (guepardo == true) 
                        {
                            System.out.println("Guepardo gana");
                            Ganador.setText("Guepardo torturga");
                        }
                       
                    
                    
                }

                public void dormir() 
                {
                    try{
                            Thread.sleep(50);
                        } catch (InterruptedException e)
                        {
                            System.err.println(e.getMessage());
                        }
                }
    
}
   
  
    public View() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TIRADOR = new javax.swing.JLabel();
        TIRO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        GANADOR = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Iniciar = new javax.swing.JButton();
        IMAGEN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TIRADOR.setText("jLabel1");

        TIRO.setText("jLabel2");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        GANADOR.setText("jLabel3");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(GANADOR)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GANADOR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        jLabel4.setText("jLabel4");

        jTextField2.setText("jTextField2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Iniciar.setText("jButton1");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        IMAGEN.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IMAGEN)
                    .addComponent(Iniciar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TIRADOR)
                            .addGap(118, 118, 118)
                            .addComponent(TIRO))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(IMAGEN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIRADOR)
                    .addComponent(TIRO))
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Iniciar)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
       new Thread(new Guepardo(1.3,IMAGEN,TIRADOR,TIRO,GANADOR,Iniciar)).start();
    }//GEN-LAST:event_IniciarActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GANADOR;
    private javax.swing.JLabel IMAGEN;
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel TIRADOR;
    private javax.swing.JLabel TIRO;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

            
            
            

}
