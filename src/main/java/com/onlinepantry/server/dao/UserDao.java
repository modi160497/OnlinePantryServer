package com.onlinepantry.server.dao;

import com.onlinepantry.server.model.Users;
import org.springframework.data.repository.CrudRepository;

//DAO= Database Access Object; DAO gets/puts objects from the db layer
//DAO has to be defined as an interface; Spring will implement it
//Crud: CReate, Update, Delete
public interface UserDao extends CrudRepository<Users,String> {



}
