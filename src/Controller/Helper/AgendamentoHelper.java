/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Helper;

import Model.AgendamentoModel;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AgendamentoHelper {
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
    
   
}
