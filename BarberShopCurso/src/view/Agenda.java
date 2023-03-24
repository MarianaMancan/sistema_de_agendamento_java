/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.AgendaController;
import Model.DAO.Banco;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Mariana
 */
public class Agenda extends javax.swing.JFrame {

    private final AgendaController controller;

    /**
     * Creates new form Agenda
     */
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        Banco.inicia();
        iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_agenda = new javax.swing.JLabel();
        jScrollPane_historico = new javax.swing.JScrollPane();
        jTable_historico = new javax.swing.JTable();
        jToggleButton_agenda = new javax.swing.JToggleButton();
        jLabel_observacao = new javax.swing.JLabel();
        jScrollPane_observacao = new javax.swing.JScrollPane();
        txt_observacao = new javax.swing.JTextArea();
        jLabel_servico = new javax.swing.JLabel();
        jLabel_cliente = new javax.swing.JLabel();
        jComboBox_servico = new javax.swing.JComboBox<>();
        jComboBox_cliente = new javax.swing.JComboBox<>();
        jLabel_hora = new javax.swing.JLabel();
        jLabel_data = new javax.swing.JLabel();
        jLabel_valor = new javax.swing.JLabel();
        txt_hora = new javax.swing.JTextField();
        txt_data = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        jLabel_id = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel_painelAgenda = new javax.swing.JLabel();
        jLabel_agendaFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_agenda.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel_agenda.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_agenda.setText("Agenda");
        getContentPane().add(jLabel_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jTable_historico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        jScrollPane_historico.setViewportView(jTable_historico);

        getContentPane().add(jScrollPane_historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 1040, 400));

        jToggleButton_agenda.setBackground(new java.awt.Color(0, 153, 51));
        jToggleButton_agenda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jToggleButton_agenda.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton_agenda.setText("Agendar");
        jToggleButton_agenda.setToolTipText("");
        jToggleButton_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_agendaActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton_agenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 550, 40));

        jLabel_observacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_observacao.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_observacao.setText("Observação:");
        getContentPane().add(jLabel_observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        txt_observacao.setColumns(20);
        txt_observacao.setRows(5);
        jScrollPane_observacao.setViewportView(txt_observacao);

        getContentPane().add(jScrollPane_observacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 550, 230));

        jLabel_servico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_servico.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_servico.setText("Serviço");
        getContentPane().add(jLabel_servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        jLabel_cliente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_cliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_cliente.setText("Cliente");
        getContentPane().add(jLabel_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jComboBox_servico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_servicoItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox_servico, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 230, 40));

        getContentPane().add(jComboBox_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 230, 40));

        jLabel_hora.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_hora.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_hora.setText("Hora");
        getContentPane().add(jLabel_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel_data.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_data.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_data.setText("Data");
        getContentPane().add(jLabel_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        jLabel_valor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_valor.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_valor.setText("Valor R$");
        getContentPane().add(jLabel_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));
        getContentPane().add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 230, 40));
        getContentPane().add(txt_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 230, 40));
        getContentPane().add(txt_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 230, 40));

        jLabel_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_id.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_id.setText("id");
        getContentPane().add(jLabel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 230, 40));

        jLabel_painelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/Agenda-PainelFundo.png"))); // NOI18N
        jLabel_painelAgenda.setText("txt_data");
        getContentPane().add(jLabel_painelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        jLabel_agendaFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/AgendaFundo.png"))); // NOI18N
        getContentPane().add(jLabel_agendaFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_agendaActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_jToggleButton_agendaActionPerformed

    private void jComboBox_servicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_servicoItemStateChanged
       this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBox_servicoItemStateChanged

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox_cliente;
    private javax.swing.JComboBox<String> jComboBox_servico;
    private javax.swing.JLabel jLabel_agenda;
    private javax.swing.JLabel jLabel_agendaFundo;
    private javax.swing.JLabel jLabel_cliente;
    private javax.swing.JLabel jLabel_data;
    private javax.swing.JLabel jLabel_hora;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_observacao;
    private javax.swing.JLabel jLabel_painelAgenda;
    private javax.swing.JLabel jLabel_servico;
    private javax.swing.JLabel jLabel_valor;
    private javax.swing.JScrollPane jScrollPane_historico;
    private javax.swing.JScrollPane jScrollPane_observacao;
    private javax.swing.JTable jTable_historico;
    private javax.swing.JToggleButton jToggleButton_agenda;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_observacao;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
       this.controller.atualizaTabela();
       this.controller.atualizaCliente();
       this.controller.atualizaServico();
       this.controller.atualizaValor();
    }

    public JTextField getTxt_valor() {
        return txt_valor;
    }

    public void setTxt_valor(JTextField txt_valor) {
        this.txt_valor = txt_valor;
    }

    public JTable getjTable_historico() {
        return jTable_historico;
    }

    public void setjTable_historico(JTable jTable_historico) {
        this.jTable_historico = jTable_historico;
    }

    public JComboBox<String> getjComboBox_cliente() {
        return jComboBox_cliente;
    }

    public void setjComboBox_cliente(JComboBox<String> jComboBox_cliente) {
        this.jComboBox_cliente = jComboBox_cliente;
    }

    public JComboBox<String> getjComboBox_servico() {
        return jComboBox_servico;
    }

    public void setjComboBox_servico(JComboBox<String> jComboBox_servico) {
        this.jComboBox_servico = jComboBox_servico;
    }

    public JTextField getTxt_data() {
        return txt_data;
    }

    public void setTxt_data(JTextField txt_data) {
        this.txt_data = txt_data;
    }

    public JTextField getTxt_hora() {
        return txt_hora;
    }

    public void setTxt_hora(JTextField txt_hora) {
        this.txt_hora = txt_hora;
    }

    public JTextField getTxt_id() {
        return txt_id;
    }

    public void setTxt_id(JTextField txt_id) {
        this.txt_id = txt_id;
    }

    public JTextArea getTxt_observacao() {
        return txt_observacao;
    }

    public void setTxt_observacao(JTextArea txt_observacao) {
        this.txt_observacao = txt_observacao;
    }
    
    
    
}
