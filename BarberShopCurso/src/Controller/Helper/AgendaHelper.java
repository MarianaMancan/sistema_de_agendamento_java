/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author Mariana
 */
public class AgendaHelper implements IHelper {
    
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    
    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
    DefaultTableModel tableModel =   (DefaultTableModel) view.getjTable_historico().getModel();
    tableModel.setNumRows(0);
    
    for(Agendamento agendamento: agendamentos){
        tableModel.addRow(new Object[]{
            agendamento.getId(),
            agendamento.getCliente().getNome(),
            agendamento.getServico().getDescricao(),
            agendamento.getValor(),
            agendamento.getDataFormatada(),
            agendamento.getHoraFormatada(),
            agendamento.getObservacao()
        });
    }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBox_cliente().getModel();
     
       for(Cliente cliente: clientes){
           comboBoxModel.addElement(cliente);
       }

    }

    public void preencherServico(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comBoxModel =(DefaultComboBoxModel) view.getjComboBox_servico().getModel();
        for(Servico servico: servicos){
            comBoxModel.addElement(servico);
        }
    }

    public Servico obterServico() {
     return  (Servico) view.getjComboBox_servico().getSelectedItem();
       
    }
    
    public  Cliente obterCliente() {
     return  (Cliente) view.getjComboBox_cliente().getSelectedItem();
       
    }

    public void setarValor(float valor) {
      view.getTxt_valor().setText(valor + "");
    }

    @Override
    public Object obterModelo() {
       int id = Integer.parseInt(view.getTxt_id().getText());
       Cliente cliente = obterCliente();
       Servico servico = obterServico();
       String valorString = view.getTxt_valor().getText();
       float valor = Float.parseFloat(valorString);
       String data = view.getTxt_data().getText();
       String hora = view.getTxt_hora().getText();
       String dataHora = data + " " + hora;
       String observacao = view.getTxt_observacao().getText();
       
       Agendamento agendamento = new Agendamento(id,cliente,servico,valor,dataHora,observacao);
       return agendamento;
    }
  

    @Override
    public void limparTela() {
       view.getTxt_id().setText("");
       view.getTxt_data().setText("");
       view.getTxt_hora().setText("");
       view.getTxt_id().setText("");
       view.getTxt_observacao().setText("");
       view.getTxt_valor().setText("");
    }
}
