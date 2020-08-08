package com.miulle.sqlspringbootreact.controller;

import com.miulle.sqlspringbootreact.modal.Konzert;
import com.miulle.sqlspringbootreact.service.KonzertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KonzertController {

    @Autowired
    private KonzertService konzertService;

    @GetMapping("/konzert")
    public List<Konzert> get() {
        return konzertService.get();
    }

    @PostMapping("/konzert")
    public Konzert save(@RequestBody Konzert konzert) {
        konzertService.save(konzert);
        return konzert;
    }

    @GetMapping("/konzert/select{id}")
    public List<Konzert> getForID(@PathVariable int id) {
        return konzertService.getForID(id);
    }

    @GetMapping("/konzert/{id}")
    public String delete(@PathVariable int id) {
        konzertService.delete(id);
        return "Konzert removed with id + " + id;
    }

    @PutMapping("/konzert")
    public Konzert update(@RequestBody Konzert konzert) {
        konzertService.save(konzert);
        return konzert;
    }
}
