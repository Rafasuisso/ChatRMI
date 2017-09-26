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
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
public interface ServidorChat extends Remote {
public void enviarMensagem(String mensagem) throws RemoteException;
public ArrayList<String> lerMensagem()  throws RemoteException;
public ArrayList<String> lerUsuarios() throws RemoteException;
}
