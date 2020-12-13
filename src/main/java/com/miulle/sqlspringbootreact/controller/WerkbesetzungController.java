package com.miulle.sqlspringbootreact.controller;

import com.miulle.sqlspringbootreact.modal.Werkbesetzung;
import com.miulle.sqlspringbootreact.service.WerkbesetzungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WerkbesetzungController {

    @Autowired
    private WerkbesetzungService werkbesetzungService;

    @GetMapping("/werkbesetzung")
    public List<Werkbesetzung> get() {
        return werkbesetzungService.get();
    }

    @PostMapping("/werkbesetzung")
    public Werkbesetzung save(@RequestBody Werkbesetzung werkbesetzung) {
        werkbesetzungService.save(werkbesetzung);
        return werkbesetzung;
    }

    @GetMapping("/werkbesetzung/{id}")
    public String delete(@PathVariable int id) {
        werkbesetzungService.delete(id);
        return "Employee removed with id + " + id;
    }

    @PutMapping("/werkbesetzung")
    public Werkbesetzung update(@RequestBody Werkbesetzung werkbesetzung) {
        werkbesetzungService.save(werkbesetzung);
        return werkbesetzung;
    }
}
