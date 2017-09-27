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
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Servidor {
public Servidor(int tamanho){
    try {
        Registry registry = LocateRegistry.createRegistry(1098);
        ServidorChat server = new ServidorChatImpl(tamanho);
        Naming.rebind("rmi://localhost:1098/ServidorChat",server);
        } catch (Exception e){
            System.out.println("Trouble: "+e);
        }
    }

}
