package com.miulle.sqlspringbootreact.controller;

import com.miulle.sqlspringbootreact.modal.Komponist;
import com.miulle.sqlspringbootreact.service.KomponistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class KomponistController {

    @Autowired
    private KomponistService komponistService;

    @GetMapping("/komponist")
    public List<Komponist> get() {
        return komponistService.get();
    }

    @PostMapping("/komponist")
    public Komponist save(@RequestBody Komponist komponist) {
        komponistService.save(komponist);
        return komponist;
    }

    @GetMapping("/komponist/{id}")
    public String delete(@PathVariable int id) {
        komponistService.delete(id);
        return "Komponist removed with id + " + id;
    }

    @PutMapping("/komponist")
    public Komponist update(@RequestBody Komponist komponist) {
        komponistService.save(komponist);
        return komponist;
    }


}
