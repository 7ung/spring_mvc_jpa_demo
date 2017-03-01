/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webmaven.DAO;

import com.google.common.collect.Lists;
import com.mycompany.webmaven.model.Pokemon;
import com.mycompany.webmaven.repositories.PokemonRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Stevie
 */
public class PokemonDAO {

    private final PokemonRepository repository;

    
    public PokemonDAO(PokemonRepository repo) {
        this.repository = repo;
    }
    
//    public List<Pokemon> getAll(){
//        return Lists.newArrayList(repository.findAll().iterator());
//    }
}
