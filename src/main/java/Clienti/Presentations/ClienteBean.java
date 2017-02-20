/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clienti.Presentations;

import Clienti.Presentations.entity.Cliente;
import Clienti.services.ClienteService;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author tss
 */
@Named
@RequestScoped
public class ClienteBean {

    @Inject
    ClienteService  clienteSrv;

    private List<Cliente> clienti;

    private Cliente cliente;

    @PostConstruct
    public void init() {

        this.clienti = clienteSrv.findAll();

        cliente = new Cliente();
    }

    public List<Cliente> getClienti() {

        return clienti;

    }

  

    public void onElimina(Long id) {

        clienteSrv.delete(id);

        this.clienti = clienteSrv.findAll();

    }

    public String onSave() {

        clienteSrv.save(cliente);

        clienti = clienteSrv.findAll();

        return "elencoClienti";

    }

    public String onModifica(Long id) {

        cliente = clienteSrv.find(id);

        return "modificaCliente";
    }
    
    
    /**get e set */
    
      public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
