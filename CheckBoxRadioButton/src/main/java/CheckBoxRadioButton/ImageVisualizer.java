/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CheckBoxRadioButton;

import java.awt.event.ItemEvent;

public class ImageVisualizer extends javax.swing.JFrame {

    public ImageVisualizer() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupRB = new javax.swing.ButtonGroup();
        image1 = new CheckBoxRadioButton.Image();
        jPanel1 = new javax.swing.JPanel();
        showAll = new javax.swing.JCheckBox();
        redCB = new javax.swing.JCheckBox();
        greenCB = new javax.swing.JCheckBox();
        blueCB = new javax.swing.JCheckBox();
        languageCB = new javax.swing.JComboBox<>();
        languageLabel = new javax.swing.JLabel();
        authors = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        northEastRB = new javax.swing.JRadioButton();
        northWestRB = new javax.swing.JRadioButton();
        southEastRB = new javax.swing.JRadioButton();
        southWestRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        image1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        image1.setToolTipText("");
        image1.setPreferredSize(new java.awt.Dimension(1024, 768));

        javax.swing.GroupLayout image1Layout = new javax.swing.GroupLayout(image1);
        image1.setLayout(image1Layout);
        image1Layout.setHorizontalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        image1Layout.setVerticalGroup(
            image1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Canal RGB Visible"));

        showAll.setSelected(true);
        showAll.setText("Todos");
        showAll.setToolTipText("Activa TODOS los canales RGB");
        showAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                showAllItemStateChanged(evt);
            }
        });

        redCB.setSelected(true);
        redCB.setText("Rojo");
        redCB.setToolTipText("Activa el canal RGB ROJO");
        redCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                redCBItemStateChanged(evt);
            }
        });

        greenCB.setSelected(true);
        greenCB.setText("Verde");
        greenCB.setToolTipText("Activa el canal RGB VERDE");
        greenCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                greenCBItemStateChanged(evt);
            }
        });

        blueCB.setSelected(true);
        blueCB.setText("Azul");
        blueCB.setToolTipText("Activa el canal RGB AZUL");
        blueCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                blueCBItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blueCB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenCB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redCB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAll))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showAll)
                .addGap(18, 18, 18)
                .addComponent(redCB)
                .addGap(18, 18, 18)
                .addComponent(greenCB)
                .addGap(18, 18, 18)
                .addComponent(blueCB)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        languageCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Español", "English" }));
        languageCB.setToolTipText("Selecciona el idioma");
        languageCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                languageCBItemStateChanged(evt);
            }
        });

        languageLabel.setText("Idioma:");

        authors.setText("Pablo Morales Gómez");

        jLabel1.setText("Carlos Brito Pérez");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Posición del Logo"));

        groupRB.add(northEastRB);
        northEastRB.setSelected(true);
        northEastRB.setToolTipText("Posiciona el logo en la esquina superior izquierda");
        northEastRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                northEastRBActionPerformed(evt);
            }
        });

        groupRB.add(northWestRB);
        northWestRB.setToolTipText("Posiciona el logo en la esquina superior derecha");
        northWestRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                northWestRBActionPerformed(evt);
            }
        });

        groupRB.add(southEastRB);
        southEastRB.setToolTipText("Posiciona el logo en la esquina inferior izquierda");
        southEastRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                southEastRBActionPerformed(evt);
            }
        });

        groupRB.add(southWestRB);
        southWestRB.setToolTipText("Posiciona el logo en la esquina inferior derecha");
        southWestRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                southWestRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(northEastRB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(southEastRB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(northWestRB)
                    .addComponent(southWestRB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(northEastRB)
                    .addComponent(northWestRB))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(southEastRB)
                    .addComponent(southWestRB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(languageCB, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(authors)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(image1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(languageCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(languageLabel))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(authors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void languageCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_languageCBItemStateChanged
        if (languageCB.getSelectedIndex() == 1) {
            languageLabel.setText("Language:");
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Visible RGB Channel"));
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Logo Position"));

            showAll.setText("All");
            blueCB.setText("Blue");
            greenCB.setText("Green");
            redCB.setText("Red");
            
            languageCB.setToolTipText("Choose the Language");
            showAll.setToolTipText("Activates ALL the RGB Channels");
            redCB.setToolTipText("Activates the RED RGB Channel");
            greenCB.setToolTipText("Activates the GREEN RGB Channel");
            blueCB.setToolTipText("Activates the BLUE RGB Channel");
            northEastRB.setToolTipText("Place the logo in the top-left corner");
            northWestRB.setToolTipText("Place the logo in the top-right corner");
            southEastRB.setToolTipText("Place the logo in the bottom-left corner");
            southWestRB.setToolTipText("Place the logo in the bottom-right corner");
        } else {
            languageLabel.setText("Idioma:");
            jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Canal RGB Visible"));
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Posición del Logo"));

            showAll.setText("Todos");
            blueCB.setText("Azul");
            greenCB.setText("Verde");
            redCB.setText("Rojo");
            
            languageCB.setToolTipText("Selecciona el idioma");
            showAll.setToolTipText("Activa TODOS los canales RGB");
            redCB.setToolTipText("Activa el canal RGB ROJO");
            greenCB.setToolTipText("Activa el canal RGB VERDE");
            blueCB.setToolTipText("Activa el canal RGB AZUL");
            northEastRB.setToolTipText("Posiciona el logo en la esquina superior izquierda");
            northWestRB.setToolTipText("Posiciona el logo en la esquina superior derecha");
            southEastRB.setToolTipText("Posiciona el logo en la esquina inferior izquierda");
            southWestRB.setToolTipText("Posiciona el logo en la esquina inferior derecha");
        }
    }//GEN-LAST:event_languageCBItemStateChanged

    private void showAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_showAllItemStateChanged
        int state = evt.getStateChange();
        if (state == ItemEvent.SELECTED) {
            redCB.setSelected(true);
            greenCB.setSelected(true);
            blueCB.setSelected(true);
        }
    }//GEN-LAST:event_showAllItemStateChanged

    private void redCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_redCBItemStateChanged
        if(!greenCB.isSelected() && !blueCB.isSelected()){
            redCB.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                showAll.setSelected(false);
            }
            image1.paintLayers(redCB.isSelected(), greenCB.isSelected(), blueCB.isSelected());
        } 
    }//GEN-LAST:event_redCBItemStateChanged

    private void greenCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_greenCBItemStateChanged
        if(!redCB.isSelected() && !blueCB.isSelected()){
            greenCB.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                showAll.setSelected(false);
            }
            image1.paintLayers(redCB.isSelected(), greenCB.isSelected(), blueCB.isSelected());
        }       
    }//GEN-LAST:event_greenCBItemStateChanged

    private void blueCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_blueCBItemStateChanged
        if(!redCB.isSelected() && !greenCB.isSelected()){
            blueCB.setSelected(true);
        } else {
            int state = evt.getStateChange();
            if (state != ItemEvent.SELECTED) {
                showAll.setSelected(false);
            }
            image1.paintLayers(redCB.isSelected(), greenCB.isSelected(), blueCB.isSelected());
        } 
    }//GEN-LAST:event_blueCBItemStateChanged

    private void northEastRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_northEastRBActionPerformed
        image1.setCoords(0, 0);
    }//GEN-LAST:event_northEastRBActionPerformed

    private void northWestRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_northWestRBActionPerformed
        image1.setCoords(335, 0);
    }//GEN-LAST:event_northWestRBActionPerformed

    private void southEastRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_southEastRBActionPerformed
        image1.setCoords(0, 320);
    }//GEN-LAST:event_southEastRBActionPerformed

    private void southWestRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_southWestRBActionPerformed
        image1.setCoords(335, 320);
    }//GEN-LAST:event_southWestRBActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImageVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageVisualizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageVisualizer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authors;
    private javax.swing.JCheckBox blueCB;
    private javax.swing.JCheckBox greenCB;
    private javax.swing.ButtonGroup groupRB;
    private CheckBoxRadioButton.Image image1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> languageCB;
    private javax.swing.JLabel languageLabel;
    private javax.swing.JRadioButton northEastRB;
    private javax.swing.JRadioButton northWestRB;
    private javax.swing.JCheckBox redCB;
    private javax.swing.JCheckBox showAll;
    private javax.swing.JRadioButton southEastRB;
    private javax.swing.JRadioButton southWestRB;
    // End of variables declaration//GEN-END:variables
}
