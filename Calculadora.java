package ATIVIDADES.AtividadeCalculadora;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }
    
    Double valor1, valor2;
    String operacao;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAdicao = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo.setText("CALCULADORA");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        txtResultado.setBackground(new java.awt.Color(153, 153, 153));
        txtResultado.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 330, 50));

        btn1.setBackground(new java.awt.Color(51, 51, 255));
        btn1.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, 60));

        btn2.setBackground(new java.awt.Color(51, 51, 255));
        btn2.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 60, 60));

        btn3.setBackground(new java.awt.Color(51, 51, 255));
        btn3.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 60, 60));

        btn4.setBackground(new java.awt.Color(51, 51, 255));
        btn4.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 60, 60));

        btn5.setBackground(new java.awt.Color(51, 51, 255));
        btn5.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, 60));

        btn6.setBackground(new java.awt.Color(51, 51, 255));
        btn6.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 60, 60));

        btn7.setBackground(new java.awt.Color(51, 51, 255));
        btn7.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 60, 60));

        btn8.setBackground(new java.awt.Color(51, 51, 255));
        btn8.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 60, 60));

        btnIgual.setBackground(new java.awt.Color(51, 51, 255));
        btnIgual.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        getContentPane().add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 60, 60));

        btn9.setBackground(new java.awt.Color(51, 51, 255));
        btn9.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 60, 60));

        btnAdicao.setBackground(new java.awt.Color(51, 51, 255));
        btnAdicao.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnAdicao.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicao.setText("+");
        btnAdicao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 60, 60));

        btnSubtracao.setBackground(new java.awt.Color(51, 51, 255));
        btnSubtracao.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnSubtracao.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtracao.setText("-");
        btnSubtracao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtracao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 60, 60));

        btnDivisao.setBackground(new java.awt.Color(51, 51, 255));
        btnDivisao.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("/");
        btnDivisao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 60, 60));

        btn0.setBackground(new java.awt.Color(51, 51, 255));
        btn0.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 60, 60));

        btnPonto.setBackground(new java.awt.Color(51, 51, 255));
        btnPonto.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnPonto.setForeground(new java.awt.Color(255, 255, 255));
        btnPonto.setText(".");
        btnPonto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 60, 60));

        btnMultiplicacao.setBackground(new java.awt.Color(51, 51, 255));
        btnMultiplicacao.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnMultiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiplicacao.setText("*");
        btnMultiplicacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiplicacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 60, 60));

        btnLimpar.setBackground(new java.awt.Color(51, 51, 255));
        btnLimpar.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //Botao 1
        txtResultado.setText (txtResultado.getText()+1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //Botao 2
        txtResultado.setText (txtResultado.getText()+2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        //Botao 3
        txtResultado.setText (txtResultado.getText()+3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //Botao 4
        txtResultado.setText (txtResultado.getText()+4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        //Botao 5
        txtResultado.setText (txtResultado.getText()+5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        //Botao 6
        txtResultado.setText (txtResultado.getText()+6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //Botao 7
        txtResultado.setText (txtResultado.getText()+7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        //Botao 8
        txtResultado.setText (txtResultado.getText()+8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        //Igualdade
        valor2 = Double.parseDouble (txtResultado.getText());
        
        if (operacao== "Adicao"){
            
        txtResultado.setText(String.valueOf(valor1+valor2));
        }
        if (operacao== "Subtracao"){
        txtResultado.setText(String.valueOf(valor1-valor2));
        }
        if (operacao== "Multiplicacao"){
        txtResultado.setText(String.valueOf(valor1*valor2));
        }
        if (operacao== "Divisao"){
        txtResultado.setText(String.valueOf(valor1/valor2));
        }         
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //Botao 9
        txtResultado.setText (txtResultado.getText()+9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnAdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicaoActionPerformed
        //Operacao Adicao
        valor1 = Double.parseDouble (txtResultado.getText());
        
        txtResultado.setText("");
        operacao = "Adicao" ; 
    }//GEN-LAST:event_btnAdicaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        //Operacao Subtracao
        valor1 = Double.parseDouble (txtResultado.getText());
        
        txtResultado.setText("");
        operacao = "Subtracao" ; 
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        //Operacao Divisao
        valor1 = Double.parseDouble (txtResultado.getText());
        
        txtResultado.setText("");
        operacao = "Divisao" ; 
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        //Botao 0
        txtResultado.setText (txtResultado.getText()+0);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        //Ponto
        txtResultado.setText(txtResultado.getText()+".");
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        //Operacao Multiplicar
        valor1 = Double.parseDouble (txtResultado.getText());
        
        txtResultado.setText("");
        operacao = "Multiplicacao" ; 
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //Botao Limpar
        txtResultado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdicao;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
