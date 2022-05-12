package com.example.formula1tfc.models;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
public class Admin extends Usuario {

    public Admin(String nombre, String email, String password, String foto) {
        super(nombre, email, password, foto);
    }

    //TEST
    public Admin(UUID id, String nombre, String email, String password, String foto) {
        super(id, nombre, email, password, foto);
    }
}