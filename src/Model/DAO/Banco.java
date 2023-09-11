/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.AgendamentoModel;
import Model.ClienteModel;
import Model.ServicoModel;
import Model.UsuarioModel;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<UsuarioModel> usuario;
    public static ArrayList<ClienteModel> cliente;
    public static ArrayList<ServicoModel> servico;
    public static ArrayList<AgendamentoModel> agendamento;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<UsuarioModel>();
        cliente = new ArrayList<ClienteModel>();
        servico = new ArrayList<ServicoModel>();
        agendamento = new ArrayList<AgendamentoModel>();
        
        //criando elementos
        
        UsuarioModel usuario1 = new UsuarioModel(1, "barbeiro", 'M', "09/05/1996", "30212121", "barbeiro@barbershop.com", "521454123", "barbeiro", "administrador");
        UsuarioModel usuario2 = new UsuarioModel(2, "estagiario", 'M', "09/05/1996", "30212122", "estagiario@barbershop.com", "451244123", "estagiario", "funcionario");
         
        ClienteModel cliente1 = new ClienteModel(1, "Alan Figueiredo", 'M', "30/01/1995", "30212126", "tiagoluz.h607@gmail.com", "5142487", "Rua jaboti 35 Canudos NH",  "93300012");
        ClienteModel cliente2 = new ClienteModel(2, "Judite Oliveira", 'F', "30/08/1994", "30212127", "juditeoliveirapet@gmail.com", "5142487745", "Rua campo bom 78 Centro NH",  "93300045");
        ClienteModel cliente3 = new ClienteModel(3, "Paulo Ricado", 'M', "24/04/1997", "30212128", "pauloricardopet@gmail.com", "78451458", "Rua Tres Irmaos 30 Vila Nova - NH",  "933007496");
        ClienteModel cliente4 = new ClienteModel(4, "Neymar Santos", 'M', "20/08/1995", "30212130", "neymarsantospet@gmail.com", "2745487", "Rua Lombardi 40 Canudos NH",  "93300748");
        ClienteModel cliente5 = new ClienteModel(5, "Debruine Pipoqueiro", 'M', "13/09/1992", "30212131", "debruinepet@gmail.com", "4742487", "Rua pedro quaresma 784 Canudos Belgica",  "933000847");
        ClienteModel cliente6 = new ClienteModel(6, "Matuidi Pareira", 'M', "17/08/1994", "302122324", "matuidipet@gmail.com", "78512457", "Rua champions 10 Kephas Franca",  "933000782");
        ClienteModel cliente7 = new ClienteModel(7, "Marta de Souza", 'F', "25/03/1993", "302121292", "martasouzapet@gmail.com", "4658237314", "Rua tesla 215 Canudos NH",  "93352012");
        ClienteModel cliente8 = new ClienteModel(8, "Aline Ferrari", 'F', "04/03/1990", "302121451", "alineferraripet@gmail.com", "8475123687", "Rua hyrule 32 Canudos NH",  "9334714747");
        ClienteModel cliente9 = new ClienteModel(9, "Samuel Coltinho", 'M', "09/02/1998", "302121189", "samuelcoltinhopet@gmail.com", "74595142487", "Rua floresta 12 Canudos NH",  "9330046364");
        ClienteModel cliente10 = new ClienteModel(10, "Felipe Luis", 'M', "12/06/1999", "3021212478", "felipeluispet@gmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        ClienteModel cliente11 = new ClienteModel(11, "George Bergson", 'M', "13/04/1987", "76820708", "george_bergson@hotmail.com", "845713647", "Rua marechal 1023 Canudos NH",  "933000874");
        
        ServicoModel servico1 = new ServicoModel(1, "Corte Simples", 18);
        ServicoModel servico2 = new ServicoModel(2, "Corte Degrade", 30);
        ServicoModel servico3 = new ServicoModel(3, "Barba Simples", 15);
        ServicoModel servico4 = new ServicoModel(4, "Barba Desenhada", 25);
        ServicoModel servico5 = new ServicoModel(5, "Sombrancelhas", 10);
        ServicoModel servico6 = new ServicoModel(6, "Penteados", 3);

        AgendamentoModel agendamento1 = new AgendamentoModel(1, cliente1, servico2, 30, "14/07/2018 09:30");
        AgendamentoModel agendamento2 = new AgendamentoModel(2, cliente3, servico4, 40, "14/07/2018 10:00");
        AgendamentoModel agendamento3 = new AgendamentoModel(3, cliente4, servico1, 18, "14/07/2018 10:30");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        cliente.add(cliente11);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendamento.add(agendamento1);
        agendamento.add(agendamento2);
        agendamento.add(agendamento3);
        
    }
    
    
}
