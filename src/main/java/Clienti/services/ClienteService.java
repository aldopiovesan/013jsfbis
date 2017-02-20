/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clienti.services;

import Clienti.Presentations.entity.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author tss
 */
@Stateless  //mi serve x utilizzare java entreprise jav bean in modo tale da utilizzare certi servizi, le classi di gestione hanno tutte stateless   
public class ClienteService {

    @PersistenceContext   //persistance manager la gestisce in auto la creazione di un istanza senza usare la procedura entitymanager
    EntityManager em;

    public List<Cliente> findAll() {

        return em.createNamedQuery("Cliente.all")
                .getResultList();
    }

    public Cliente save(Cliente tosave) {

        return em.merge(tosave);
    }

    public void delete(Long id) {
        Cliente finded = em.find(Cliente.class, id);
        em.remove(finded);
    }

    public Cliente find(long id) {

        return em.find(Cliente.class, id);
    }

}
