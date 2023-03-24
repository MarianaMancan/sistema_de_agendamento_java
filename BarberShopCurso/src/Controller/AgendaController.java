/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Models.Agendamento;
import Models.Cliente;
import Models.DAO.AgendamentoDAO;
import Models.DAO.ClienteDAO;
import Models.DAO.ServicoDAO;
import Models.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author Mariana
 */
public class AgendaController {
    
   private final Agenda view;
   private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }

   public void atualizaTabela(){
       AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
       ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
       helper.preencherTabela(agendamentos);
   }
   public void atualizaCliente(){
       ClienteDAO clienteDAO = new ClienteDAO();
       ArrayList<Cliente> clientes = clienteDAO.selectAll();
       helper.preencherClientes(clientes);
   }
   public void atualizaServico(){
       ServicoDAO servicoDAO = new ServicoDAO();
       ArrayList<Servico> servicos = servicoDAO.selectAll();
       helper.preencherServico(servicos);
   }
   
   public void atualizaValor(){
     Servico servico =  helper.obterServico();
     helper.setarValor(servico.getValor());
   }

    public void agendar() {
        Agendamento agendamento =  (Agendamento) helper.obterModelo();
        new AgendamentoDAO().insert(agendamento);
        atualizaTabela();
        helper.limparTela();
    }
}
