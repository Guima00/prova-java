/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author ice
 */
import java.util.*;
import java.util.Scanner;
public class Agenda {
    List<Contato> lista;
    
    public Agenda(){
        lista = new ArrayList<>();
    }
    public void adiciona (Contato x){
        lista.add(x);
    }
    
    public Contato retornacontato(String nome){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getNome().equals(nome)){
                return lista.get(i); 
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String a,b,c;
        Contato contato;
        for(int i=0;i<2;i++){
            contato=new Contato();
            a=teclado.nextLine();
            contato.setNome(a);
            b=teclado.nextLine();
            contato.setNumero(b);
            c=teclado.nextLine();
            contato.setAnotaçao(c);
           agenda.adiciona(contato); 
        }
        String d=teclado.nextLine();
        Contato nome2= agenda.retornacontato(d);
        if(nome2==null){
            System.out.println("contato nn existe");
        }
        else
            System.out.println("contato existe");
    }
    
    
}
