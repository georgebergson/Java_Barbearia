/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendamentoHelper;
import Model.AgendamentoModel;
import Model.ClienteModel;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.ServicoModel;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class AgendaController  {
    private final Agenda view;
    private final AgendamentoHelper helper;
    
    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendamentoHelper(view);
    }
    
    public void atualizaTabela(){
        AgendamentoDAO agendamentos = new AgendamentoDAO();
        ArrayList<AgendamentoModel> selectAll = agendamentos.selectAll();
        
        helper.preencherTabela(selectAll);
    }
    
    public void atualizaCliente(){
        ClienteDAO cliente = new ClienteDAO();
        ArrayList<ClienteModel> selectAll = cliente.selectAll();
        
        helper.preencherCliente(selectAll);
    }
    
        public void atualizaServico(){
        ServicoDAO servico = new ServicoDAO();
        ArrayList<ServicoModel> selectAll = servico.selectAll();
        
        helper.preencherServico(selectAll);
    }
        
        public void atualizaValor(){
            ServicoModel servico = helper.obterServico();
            helper.setarValor(servico.getValor());
        }
        
        public void agendar(){
            
        }
}
