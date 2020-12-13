package com.miulle.sqlspringbootreact.controller;

import com.miulle.sqlspringbootreact.modal.Instrument;
import com.miulle.sqlspringbootreact.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @GetMapping("/instrument")
    public List<Instrument> get() {
        return instrumentService.get();
    }

    @PostMapping("/instrument")
    public Instrument save(@RequestBody Instrument instrument) {
        instrumentService.save(instrument);
        return instrument;
    }

    @GetMapping("/instrument/{id}")
    public String delete(@PathVariable int id) {
        instrumentService.delete(id);
        return "Instrument removed with id + " + id;
    }

    @PutMapping("/instrument")
    public Instrument update(@RequestBody Instrument instrument) {
        instrumentService.save(instrument);
        return instrument;
    }
}
