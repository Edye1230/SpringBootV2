package com.gestionempleados.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionempleados.repositories.EmpleadoRepository;
import com.gestionempleados.models.Empleado;

@RestController
@RequestMapping("/api/v1/")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoRepository repository;

    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados() {
        return repository.findAll();
    }

    @PostMapping("/empleados")
    public Empleado postEmpleado(@RequestBody Empleado empleado){
        return repository.save(empleado);
    }

    /*   @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }*/

        //show me all repository methods
        //repository.findAll();
        //repository.findById();
        //repository.save();
        //repository.delete();
        //repository.count();
        //repository.existsById();
        //repository.findAllById();
        //repository.deleteById();
        //repository.deleteAll();
        //repository.deleteAllById();
        //repository.findAll(Sort sort);
        //repository.findAllById(Iterable<ID> ids);
        //repository.findAllById(Iterable<ID> ids, Sort sort);
        //repository.findAll(Specification<S> spec);
        //repository.findAll(Specification<S> spec, Sort sort);
        //repository.findAll(Pageable pageable);
        //repository.findAll(Specification<S> spec, Pageable pageable);
        //repository.saveAll(Iterable<S> entities);
        //repository.flush();
        //repository.saveAndFlush(S entity);
        //repository.deleteInBatch(Iterable<S> entities);
        //repository.deleteAllInBatch();
        //repository.getOne(ID id);/
        //repository.getById(ID id);
        //repository.count(Specification<S> spec);
        //repository.exists(Specification<S> spec);
        //repository.findOne(Specification<S> spec);
        //repository.findOne(Specification<S> spec, Sort sort);
        //repository.findOne(Specification<S> spec, Pageable pageable);
        //repository.findAll(Example<S> example);
        //repository.findAll(Example<S> example, Sort sort);
        //repository.findAll(Example<S> example, Pageable pageable);
        //repository.findAll(Example<S> example, ExampleMatcher matcher);
        //repository.findAll(Example<S> example, ExampleMatcher matcher, Sort sort);
        //repository.findAll(Example<S> example, ExampleMatcher matcher, Pageable pageable);
        //repository.count(Example<S> example);
        //repository.count(Example<S> example, ExampleMatcher matcher);
        //repository.exists(Example<S> example);
        //repository.exists(Example<S> example, ExampleMatcher matcher);
        //repository.findOne(Example<S> example);
        //repository.findOne(Example<S> example, ExampleMatcher matcher);

    }
