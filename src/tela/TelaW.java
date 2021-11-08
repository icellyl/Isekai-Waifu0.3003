/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sistema.GeradorDeEventos;
import sistema.GeradorDeInimigos;
import sistema.GeradorDeItensAtributos;

public class TelaW extends javax.swing.JFrame {

    public TelaW() {
        initComponents();

    }
    GeradorDeEventos gde = new GeradorDeEventos();
    GeradorDeInimigos gdi = new GeradorDeInimigos();
    GeradorDeItensAtributos gdia = new GeradorDeItensAtributos();
    DefaultListModel model = new DefaultListModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtAbas = new javax.swing.JTabbedPane();
        jpPrincipal = new javax.swing.JPanel();
        btInventario = new javax.swing.JButton();
        lbVidaInimigo = new javax.swing.JLabel();
        lbNomeInimigo = new javax.swing.JLabel();
        lbVida = new javax.swing.JLabel();
        btExplorar = new javax.swing.JButton();
        btAtacar = new javax.swing.JButton();
        btDefender = new javax.swing.JButton();
        btCurar = new javax.swing.JButton();
        teste = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jpInventario = new javax.swing.JPanel();
        lbEquipamentos = new javax.swing.JLabel();
        lbLinha = new javax.swing.JLabel();
        lbArma = new javax.swing.JLabel();
        lbArmaUltilizada = new javax.swing.JLabel();
        lbAcessorio = new javax.swing.JLabel();
        lbAcessorioUltilizado = new javax.swing.JLabel();
        btAtributos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlArmas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        btVoltarInv = new javax.swing.JButton();
        btEquipar = new javax.swing.JButton();
        btSoltar = new javax.swing.JButton();
        jpLoja = new javax.swing.JPanel();
        jpBau = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btInventario.setText("Inverntario");
        btInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInventarioActionPerformed(evt);
            }
        });

        lbVidaInimigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVidaInimigo.setText("V E");

        lbNomeInimigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNomeInimigo.setText("N E");

        lbVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVida.setText("V");

        btExplorar.setText("Explorar");
        btExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExplorarActionPerformed(evt);
            }
        });

        btAtacar.setText("Atacar");
        btAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtacarActionPerformed(evt);
            }
        });

        btDefender.setText("Defender");

        btCurar.setText("Curar");

        teste.setText("jButton4");
        teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testeActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btAtacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDefender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btInventario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExplorar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeInimigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVidaInimigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1)
                    .addComponent(lbVida, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teste)
                .addGap(50, 50, 50))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVidaInimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(teste))
                    .addGroup(jpPrincipalLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(lbVida, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAtacar)
                    .addComponent(btDefender)
                    .addComponent(btCurar)
                    .addComponent(btExplorar)
                    .addComponent(btInventario))
                .addContainerGap())
        );

        jtAbas.addTab("principal", jpPrincipal);

        lbEquipamentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbEquipamentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEquipamentos.setText("Equipamentos");

        lbLinha.setText("jLabel2");
        lbLinha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbArma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbArma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbArma.setText("Arma:");

        lbArmaUltilizada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbArmaUltilizada.setText("a u");

        lbAcessorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbAcessorio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAcessorio.setText("Acessório:");

        lbAcessorioUltilizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAcessorioUltilizado.setText("ace u");

        btAtributos.setText("Atributos");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jlArmas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlArmas.setToolTipText("");
        jScrollPane1.setViewportView(jlArmas);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mochila");

        btVoltarInv.setText("Voltar");
        btVoltarInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarInvActionPerformed(evt);
            }
        });

        btEquipar.setText("Equipar");
        btEquipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEquiparActionPerformed(evt);
            }
        });

        btSoltar.setText("Soltar");
        btSoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpInventarioLayout = new javax.swing.GroupLayout(jpInventario);
        jpInventario.setLayout(jpInventarioLayout);
        jpInventarioLayout.setHorizontalGroup(
            jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInventarioLayout.createSequentialGroup()
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbArmaUltilizada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpInventarioLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpInventarioLayout.createSequentialGroup()
                                        .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbArma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lbAcessorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbAcessorioUltilizado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btAtributos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lbLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addComponent(btEquipar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltarInv)
                        .addContainerGap())))
        );
        jpInventarioLayout.setVerticalGroup(
            jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLinha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEquipamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpInventarioLayout.createSequentialGroup()
                        .addComponent(lbArma, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbArmaUltilizada, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbAcessorio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbAcessorioUltilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btAtributos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpInventarioLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btVoltarInv)
                            .addComponent(btEquipar)
                            .addComponent(btSoltar))))
                .addContainerGap())
        );

        jtAbas.addTab("inventario", jpInventario);

        javax.swing.GroupLayout jpLojaLayout = new javax.swing.GroupLayout(jpLoja);
        jpLoja.setLayout(jpLojaLayout);
        jpLojaLayout.setHorizontalGroup(
            jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jpLojaLayout.setVerticalGroup(
            jpLojaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jtAbas.addTab("loja", jpLoja);

        javax.swing.GroupLayout jpBauLayout = new javax.swing.GroupLayout(jpBau);
        jpBau.setLayout(jpBauLayout);
        jpBauLayout.setHorizontalGroup(
            jpBauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jpBauLayout.setVerticalGroup(
            jpBauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        jtAbas.addTab("bau", jpBau);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtAbas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtAbas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExplorarActionPerformed
        executarEvento();
    }//GEN-LAST:event_btExplorarActionPerformed

    private void testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testeActionPerformed
        System.out.println(gdia.getDanoDoitem());
        
    }//GEN-LAST:event_testeActionPerformed

    private void btAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtacarActionPerformed
        atacar();
    }//GEN-LAST:event_btAtacarActionPerformed

    private void btVoltarInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarInvActionPerformed
        jtAbas.setSelectedIndex(0);
    }//GEN-LAST:event_btVoltarInvActionPerformed

    private void btInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInventarioActionPerformed
        jtAbas.setSelectedIndex(1);
    }//GEN-LAST:event_btInventarioActionPerformed

    private void btSoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoltarActionPerformed
        tirarItemDoInventario();
    }//GEN-LAST:event_btSoltarActionPerformed

    private void btEquiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEquiparActionPerformed
        equiparItem();
    }//GEN-LAST:event_btEquiparActionPerformed

    private void executarEvento() {
        if (gdi.getInimigoAtivo() == 0) {
            int idEvento = gde.gerarEventoExplorar();
            switch (idEvento) {
                case 1:
                    gerarInimigo();
                    break;
                case 2:
                    gerarLoja();
                    break;
                case 3:
                    gerarBau();
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "nope");
        }

    }

    private void gerarInimigo() {
        gdi.gerarInimigo();
        lbNomeInimigo.setText(gdi.getNomeInimigo());
        lbVidaInimigo.setText(gdi.getVidaAtualInimigo() + gdi.getVidaMaximaInimigo());
    }

    private void gerarLoja() {

    }

    private void gerarBau() {

    }

    private void atacar() {
        if (gdi.getInimigoAtivo() == 1) {
            int resultado = gde.gerarEventoAtacar(gdi, gdia);
            gdi.setVidaAtualInimigo(resultado);
            lbVidaInimigo.setText(gdi.getVidaAtualInimigo() + gdi.getVidaMaximaInimigo());
            if (gdi.getVidaAtualInimigo() == 0) {
                gdi.setInimigoAtivo(0);
                lbVidaInimigo.setText("");
                lbNomeInimigo.setText("Sem inimigos...");
                if (jlArmas.getModel().getSize() < 5) {
                    gerarDrop();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "não tem");
        }

    }

    private void tirarItemDoInventario() {
        if (!jlArmas.isSelectionEmpty()) {
            gdia.organizarItens(jlArmas.getSelectedIndex());
            model.removeElementAt(jlArmas.getSelectedIndex());
        }
    }
    private void equiparItem(){
        gdia.equiparItem(jlArmas.getSelectedValue());
    }

    private void gerarDrop() {

    gdia.gerarItem(gdi.getNomeInimigo());
    if(gdia.getValidarSeItemFoiDropado() == 1){
        model.addElement(gdia.getNomeDoitemDropado());
        jlArmas.setModel(model);
        gdia.guardarItemNaMemoria(gdia.getNomeDoitemDropado());
        gdia.setValidarSeItemFoiDropado(0);
    }
    }

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
            java.util.logging.Logger.getLogger(TelaW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtacar;
    private javax.swing.JButton btAtributos;
    private javax.swing.JButton btCurar;
    private javax.swing.JButton btDefender;
    private javax.swing.JButton btEquipar;
    private javax.swing.JButton btExplorar;
    private javax.swing.JButton btInventario;
    private javax.swing.JButton btSoltar;
    private javax.swing.JButton btVoltarInv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> jlArmas;
    private javax.swing.JPanel jpBau;
    private javax.swing.JPanel jpInventario;
    private javax.swing.JPanel jpLoja;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JTabbedPane jtAbas;
    private javax.swing.JLabel lbAcessorio;
    private javax.swing.JLabel lbAcessorioUltilizado;
    private javax.swing.JLabel lbArma;
    private javax.swing.JLabel lbArmaUltilizada;
    private javax.swing.JLabel lbEquipamentos;
    private javax.swing.JLabel lbLinha;
    private javax.swing.JLabel lbNomeInimigo;
    private javax.swing.JLabel lbVida;
    private javax.swing.JLabel lbVidaInimigo;
    private javax.swing.JButton teste;
    // End of variables declaration//GEN-END:variables
}
