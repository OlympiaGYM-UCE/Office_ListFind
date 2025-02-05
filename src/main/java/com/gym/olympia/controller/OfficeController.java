package com.gym.olympia.controller;


import com.gym.olympia.entity.Office;
import com.gym.olympia.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/office")
public class OfficeController {

    @Autowired
    OfficeService officeService;


    @GetMapping
    public List<Office> listarTodas() {
        return officeService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Office> buscarPorId(@PathVariable Long id) {
        return officeService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
