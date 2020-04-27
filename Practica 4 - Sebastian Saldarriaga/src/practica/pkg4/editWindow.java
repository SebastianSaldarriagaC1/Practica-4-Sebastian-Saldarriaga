/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class editWindow extends javax.swing.JDialog {

    //Creación de variables
    public int number;
    public int pos;
    public static int vec[];
    MainWindow ventana = new MainWindow();

    /**
     * Creates new form editWindow
     */
    public editWindow(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Determinar estado inicial de etiquetas y botones
        this.setLocationRelativeTo(null);//Con esto la ventana aparece en el centro de la pantalla
        jLabel1.setText("<html><p>A continuación, especifique la posición que desea cambiar y el nuevo valor para dicha posición.</p></html>");
        vec = MainWindow.vec;//Se asigna el vector de la ventana principal al vector local
        ventana = (MainWindow) parent;//Se asigna la ventana principal a la varibale ventana
                                      //para así poder trabajar con ella a lo largo del código
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveChange = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        position = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        newNumber = new javax.swing.JTextField();
        genRandom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        endEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        saveChange.setText("Guardar cambio");
        saveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangeActionPerformed(evt);
            }
        });

        jLabel2.setText("Posicion:");

        jLabel3.setText("Valor a agregar:");

        genRandom.setText("Generar valor aleatorio");
        genRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genRandomActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        endEdit.setText("Finalizar edición");
        endEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveChange)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(26, 26, 26)
                                    .addComponent(newNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(65, 65, 65)
                                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(genRandom)
                            .addComponent(endEdit)))
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genRandom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChange)
                    .addComponent(endEdit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangeActionPerformed
        // TODO add your handling code here:
        //Extracción del texto de los TextField
        String strNumber = newNumber.getText();
        String strPos = position.getText();
        //Se comprueba si los TextField están vacíos
        if (strPos.equals("") || strNumber.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene ambos campos antes de presionar el botón GUARDAR CAMBIO.");
        } else {
            //Se llama a un try para prevenir errores de formato
            try {
                //Se asigna el valor de los TextFields a las variables previamente declaradas
                number = Integer.parseInt(strNumber);
                pos = Integer.parseInt(strPos);
                //Se comprueba que la posición no esté fuera de los límites del vector
                if (pos <= 0 || pos > vec.length) {
                    JOptionPane.showMessageDialog(null, "La posición ingresada está por fuera del tamaño del vector.");
                } else {
                    //Se asigna el número ingresado en la posición correspondiente del vector
                    vec[pos - 1] = number;
                    newNumber.setText("");
                    position.setText("");
                    //Se informa que el valor fue agregado
                    JOptionPane.showMessageDialog(null, "Valor editado correctamente.");
                    //Se realiza el cambio en la ventana principal
                    ventana.showVector(vec, vec.length);
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese únicamente valores numéricos.");
            }
        }
    }//GEN-LAST:event_saveChangeActionPerformed

    //Este botón inserta un valor aleatorio a el TextField de "Valor a agregar"
    private void genRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genRandomActionPerformed
        // TODO add your handling code here:
        Random aleatorio = new Random();
        int n = aleatorio.nextInt(101);
        newNumber.setText(String.valueOf(n));
    }//GEN-LAST:event_genRandomActionPerformed

    //Este botón cierra la ventana actual, volviendo a la ventana padre
    private void endEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endEditActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_endEditActionPerformed

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
            java.util.logging.Logger.getLogger(editWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                editWindow dialog = new editWindow(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endEdit;
    private javax.swing.JButton genRandom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField newNumber;
    private javax.swing.JTextField position;
    private javax.swing.JButton saveChange;
    // End of variables declaration//GEN-END:variables
}