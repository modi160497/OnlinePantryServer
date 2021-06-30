package com.onlinepantry.server.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data //lombok setters and getters
@NoArgsConstructor //needed by JPA for deserialization
@AllArgsConstructor
@Entity
@Table(name="users") //the table name in the db
public class User {

    @Id //primary key for the table
    private String username;
    @Basic(optional = false) //basic field but still mandatory
    private String passwordHash;
    @Basic(optional = false) //basic field but still mandatory
    private String email;


}
