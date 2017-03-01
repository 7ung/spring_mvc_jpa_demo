/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webmaven.controller;

import com.google.common.collect.Lists;
import com.mycompany.webmaven.DAO.PokemonDAO;
import com.mycompany.webmaven.model.Pokemon;
import com.mycompany.webmaven.repositories.Config;
import com.mycompany.webmaven.repositories.PokemonRepository;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.text.html.FormSubmitEvent.MethodType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.EntityInformation;
import org.springframework.data.repository.core.RepositoryMetadata;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Stevie
 */
@Controller
@Service
public class PokemonController {
    
//    @Autowired
//    Config config;
    
    @Autowired(required = false)
    PokemonRepository repo;
//    @Autowired 
//    PokemonRepository repo;
    
    @RequestMapping(value="/pokemon", method=RequestMethod.GET)
    public String index(ModelMap model){
        List<Pokemon> pokemons = Lists.newArrayList(repo.findAll().iterator());
//        List<Pokemon> pokemons = dao.getAll();
        model.addAttribute("pokemonName", pokemons.get(0).getName());
        model.addAttribute("count", pokemons.size());
        return "pokemon";
    }
}
