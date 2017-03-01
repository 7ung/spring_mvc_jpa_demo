/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webmaven.repositories;

import com.mycompany.webmaven.model.Pokemon;
import java.io.Serializable;
import javax.annotation.Resource;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Stevie
 */
public interface PokemonRepository extends JpaRepository<Pokemon, Integer>{
    
}
//@Repository
//public abstract class PokemonRepository{
//    
//}

