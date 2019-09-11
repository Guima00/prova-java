/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.provita;

/**
 *
 * @author Principal
 */
import java.util.Scanner;
import java.lang.Math;
public class LocalizaPessoasMaisProximas {
    
    public void calcula(Pessoa p1, Pessoa p2, Pessoa p3){
        double d1,d2,d3;
        d1=Math.sqrt(Math.pow((double)(p1.getCoordenada().getX()-p2.getCoordenada().getX()),2)+Math.pow((double)(p1.getCoordenada().getY()-p2.getCoordenada().getY()),2));
        d2=Math.sqrt(Math.pow((double)(p2.getCoordenada().getX()-p3.getCoordenada().getX()),2)+Math.pow((double)(p2.getCoordenada().getY()-p3.getCoordenada().getY()),2));
        d3=Math.sqrt(Math.pow((double)(p1.getCoordenada().getX()-p3.getCoordenada().getX()),2)+Math.pow((double)(p1.getCoordenada().getY()-p3.getCoordenada().getY()),2));
        if(d1>d2 && d1>d3){
            System.out.println("as pessoas mais próximas são: " + p1.getNome() + " e " + p2.getNome());
        }
        if(d2>d1 && d2>d3){
            System.out.println("as pessoas mais próximas são: " + p2.getNome() + " e " + p3.getNome());
        }
        if(d3>d1 && d3>d2){
            System.out.println("as pessoas mais próximas são: " + p1.getNome() + " e " + p3.getNome());
        }
    }
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Pessoa p1= new Pessoa();
        Pessoa p2= new Pessoa();
        Pessoa p3= new Pessoa();
        String nome = teclado.nextLine();
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        p1.setNome(nome);
        p1.setCoordenada(x,y);
        String nome2 = teclado.nextLine();
        int x2 = teclado.nextInt();
        int y2 = teclado.nextInt();
        p2.setNome(nome2);
        p2.setCoordenada(x2, y2);
        nome = teclado.nextLine();
        x = teclado.nextInt();
        y = teclado.nextInt();
        p3.setCoordenada(x, y);
        p3.setNome(nome);
        LocalizaPessoasMaisProximas ok = new LocalizaPessoasMaisProximas();
        ok.calcula(p1, p2, p3);   
    }
    
}
