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
import java.rmi.RemoteException;
import java.util.ArrayList;
public class ServidorChatImpl extends java.rmi.server.UnicastRemoteObject implements ServidorChat {

    ArrayList<String> mensagens;
    ArrayList<String> usuarios;
    //int nMensagens;
    public ServidorChatImpl() throws RemoteException {
        super();
        this.mensagens = new ArrayList<String>();
        this.usuarios  = new ArrayList<String>();

    }
    public void enviarMensagem(String mensagem) throws RemoteException{
        mensagens.add(mensagem);
    }

    public ArrayList<String> lerMensagem() throws RemoteException{
        return mensagens;
    }
    public ArrayList<String> lerUsuarios() throws RemoteException{
        return usuarios;
    }

   
    
}