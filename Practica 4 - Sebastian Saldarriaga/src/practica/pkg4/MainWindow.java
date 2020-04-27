/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class MainWindow extends javax.swing.JFrame {

    //Creación de variables
    public int num;
    public static int vec[];
    public DefaultTableModel model;

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        //Determinar estado inicial de etiquetas y botones
        this.setLocationRelativeTo(null);//Con esto la ventana aparece en el centro de la pantalla
        jLabel1.setText("<html><p>En el siguiente campo ingrese el tamaño que desea para su vector:</p></html>");
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//De esta forma el jTable tendrá un scroll horizontal
        invertVector.setVisible(false);
        changePos.setVisible(false);
        editElement.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sizeVec = new javax.swing.JTextField();
        createVector = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        invertVector = new javax.swing.JButton();
        changePos = new javax.swing.JButton();
        editElement = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("jLabel1");

        createVector.setText("Crear Vector");
        createVector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVectorActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        tabla.setEnabled(false);
        tabla.setFocusable(false);
        tabla.setOpaque(false);
        tabla.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(tabla);

        invertVector.setText("Invertir vector");
        invertVector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invertVectorActionPerformed(evt);
            }
        });

        changePos.setText("Intercambiar posiciones");
        changePos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePosActionPerformed(evt);
            }
        });

        editElement.setText("Editar elemento");
        editElement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editElementActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Creador de Vectores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(sizeVec, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(createVector))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(editElement)
                        .addGap(18, 18, 18)
                        .addComponent(changePos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invertVector)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sizeVec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createVector)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invertVector)
                    .addComponent(changePos)
                    .addComponent(editElement))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createVectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVectorActionPerformed
        //Extracción del texto de los TextField
        String strNum = sizeVec.getText();
        Random aleatorio = new Random();
        //Se comprueba si los TextField están vacíos
        if (strNum.equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor, llene el campo requerido antes de presionar el botón CREAR VECTOR.");
        } else {
            //Se llama a un try para prevenir errores de formato
            try {
                //Se asigna el valor del TextField a la variable previamente declarada
                num = Integer.parseInt(strNum);
                if (num > 0) {
                    //Asignación del vector con tamaño ingresado
                    vec = new int[num];
                    //Se abre un cuadro de confirmación para determinar si el vector
                    //será llenado por el usuario o de forma automática
                    if (JOptionPane.showConfirmDialog(null, "<html>¿Desea llenar el vector manualmente?<br/>(Tenga en cuenta que si pulsa NO los valores del vector serán aleatorios entre 0 y 100)</html>", "Llenado manual", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                        manualWindow win2 = new manualWindow(this, true);
                        win2.setVisible(true);
                    } else {
                        //Se llena el vector con valores aleatorios
                        for (int i = 0; i < num; i++) {
                            vec[i] = aleatorio.nextInt(101);
                        }
                        //Se muestra el vector
                        showVector(vec, num);
                    }
                    //Se hacen visibles los botones
                    buttonVisibility();
                } else {
                    //Mensajes de advertencia para el usuario
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número mayor que cero (0).");
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese únicamente valores numéricos.");
            }
        }
    }//GEN-LAST:event_createVectorActionPerformed

    //Mediante este botón se invierte el orden del vector
    private void invertVectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invertVectorActionPerformed
        // TODO add your handling code here:
        //Mediante un ciclo se recorre el vector hasta la mitad
        for (int i = 0; i < vec.length/2; i++){
        //Se llama al metodo para cambiar posiciones, enviando como parámetros
        //al vector, la posición i y su posición opuesta
	positionExchange(vec, (vec.length-i-1),i);
        //Se enseña el vector reordenado
        showVector(vec, num);
	}
    }//GEN-LAST:event_invertVectorActionPerformed

    //Mediante este botón se abre un jDialog con el que se pueden intercambiar 
    //posiciones del vector
    private void changePosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePosActionPerformed
        // TODO add your handling code here:
        changeWindow cWin = new changeWindow(this, true);
        cWin.setVisible(true);
    }//GEN-LAST:event_changePosActionPerformed

    //Mediante este botón se abre un jDialog con el que se pueden editar los valores 
    //de las posiciones del vector
    private void editElementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editElementActionPerformed
        // TODO add your handling code here:
        editWindow eWin = new editWindow(this, true);
        eWin.setVisible(true);
    }//GEN-LAST:event_editElementActionPerformed

    //Método para intercambiar posiciones
    //Se piden como parámetros el vector que se va a cambiar y las posiciones
    public int[] positionExchange(int vecChange[], int first, int second){
        //Se guarda el vec en la primera posicion en una variable temporal
        int saved = vecChange[first];
        //Se asigna el valor de la segunda posicion a la primera
        vecChange[first]=vecChange[second];
        //Se asigna el valor guardado, es decir el de la primera, a la segunda
        vecChange[second]=saved;
        //Retorna el vector reordenado
        return(vecChange);
    }
    
    //Método para mostrar vector
    public void showVector(int vecShow[], int size) {
        //Se crea una tabal con 0 columnas
        model = (DefaultTableModel) tabla.getModel();
        model.setColumnCount(0);
        
        for (int i = 0; i < vecShow.length; i++) {
            //Se añaden columnas a la tabla insertándoles el nombre de su posición
            //mas 1
            model.addColumn("Posición " + (i + 1));
            //Se asignan los valores del vector a las celdas de la tabla
            tabla.setValueAt(vecShow[i], 0, i);
            sizeVec.setText(String.valueOf(size));
        }
    }
    
    //Metodo para hacer visibles los botones que incialmente no lo eran
    public void buttonVisibility(){
        invertVector.setVisible(true);
        changePos.setVisible(true);
        editElement.setVisible(true);        
    }

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePos;
    private javax.swing.JButton createVector;
    private javax.swing.JButton editElement;
    private javax.swing.JButton invertVector;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField sizeVec;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}