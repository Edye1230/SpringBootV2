package com.gestionempleados.models;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", length = 60, nullable = false, unique = true)
    private String email;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 60, nullable = false)
    private String apellido;

    //show me all @Column properties
    //name
    //length
    //nullable
    //unique
    //precision
    //scale
    //table
    //columnDefinition
    //insertable
    //updatable

    public Empleado() {

    }


    public Empleado(Long id, String email, String nombre, String apellido) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}
