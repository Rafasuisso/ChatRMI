/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testermi;

/**
 *
 * @author e.rafael.medeiros
 */
import java.rmi.*;
import javax.swing.*;
import java.util.Scanner;
import java.lang.Thread.*;
import java.util.ArrayList;
import java.rmi.RemoteException;
public class Cliente {
    String nome;
    public Cliente(String nome){
        this.nome = nome;
         try {
            final ServidorChat chat = (ServidorChat) Naming.lookup( "rmi://localhost:1098/ServidorChat" );
            Scanner scanner = new Scanner(System.in);
            String msg = "";
            Thread thread = new Thread(new Runnable() {
                int cont = chat.lerMensagem().size();
                @Override
                public void run() {
                    try {
                        while(true){
                            if (chat.lerMensagem().size() > cont){
                                System.out.println(chat.lerMensagem().get(chat.lerMensagem().size()-1));
                                cont++;
                            }
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
            while(msg != "exit"){
                System.out.println(nome+": ");
                msg = scanner.nextLine();
                chat.enviarMensagem(nome+": "+msg);
       
            }
        }
        catch( Exception e ) {
            e.printStackTrace();
        }
            
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente(scanner.nextLine());
    }
   
    
}
