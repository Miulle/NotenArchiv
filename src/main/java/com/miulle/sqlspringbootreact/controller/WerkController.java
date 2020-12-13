package com.miulle.sqlspringbootreact.controller;

import com.miulle.sqlspringbootreact.modal.Werk;
import com.miulle.sqlspringbootreact.service.WerkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WerkController {

    @Autowired
    private WerkService werkService;

    @GetMapping("/werk")
    public List<Werk> get() {
        return werkService.get();
    }

    @PostMapping("/werk")
    public Werk save(@RequestBody Werk werk) {
        werkService.save(werk);
        return werk;
    }

    @GetMapping("/werk/{id}")
    public String delete(@PathVariable int id) {
        werkService.delete(id);
        return "Werk removed with id + " + id;
    }

    @PutMapping("/werk")
    public Werk update(@RequestBody Werk werk) {
        werkService.save(werk);
        return werk;
    }
}
