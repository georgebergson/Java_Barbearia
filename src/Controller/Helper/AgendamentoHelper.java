/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.AgendamentoModel;
import Model.ClienteModel;
import Model.ServicoModel;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AgendamentoHelper implements iHelper {
    private final Agenda view;

    public AgendamentoHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<AgendamentoModel> agendamentos) {
        DefaultTableModel jTableResultado = (DefaultTableModel) view.getjTableResultado().getModel();
        jTableResultado.setNumRows(0);
        
        for (AgendamentoModel agendamento : agendamentos) {
            jTableResultado.addRow(new Object[]{
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

    public void preencherCliente(ArrayList<ClienteModel> selectAll) {
        DefaultComboBoxModel selecCliente = (DefaultComboBoxModel) view.getSelectCliente().getModel();
        
        for (ClienteModel clienteModel : selectAll) {
            selecCliente.addElement(clienteModel);
        }
    }

    public void preencherServico(ArrayList<ServicoModel> selectAll) {
        DefaultComboBoxModel selecServico = (DefaultComboBoxModel) view.getSelectServico().getModel();
        
        for (ServicoModel servicoModel : selectAll) {
            selecServico.addElement(servicoModel);
        }
    }

    public ClienteModel obterCliente() {
        return (ClienteModel) view.getSelectCliente().getSelectedItem();
    }
    
    public ServicoModel obterServico() {
        return (ServicoModel) view.getSelectServico().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTxfValor().setText(Float.toString(valor));
    }

    @Override
    public AgendamentoModel obterModelo() {
        String idString = view.getTxfId().getText();
        int id = Integer.parseInt(idString);
        
        ClienteModel cliente = obterCliente();
        ServicoModel servico = obterServico();
        
        String valorString = view.getTxfValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTxfData().getText();
        //String hora = view.getTxfHora().getText();
        String observacao = view.getjTxaObservacao().getText();
        
        AgendamentoModel agendamento = new AgendamentoModel(id,cliente,servico,valor,data,observacao);
        return agendamento;
    }

    @Override
    public void limparTela() {
        view.getTxfId().setText("");
        view.getTxfData().setText("");
        view.getTxfHora().setText("");
        view.getTxfValor().setText("");
        view.getjTxaObservacao().setText("");
    }
    
   
}
