/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.veron.sister.mahasiswa.controller;

import com.veron.sister.mahasiswa.entity.Mahasiswa;
import com.veron.sister.mahasiswa.service.MahasiswaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS ID
 */

@RestController
@RequestMapping("api/v1/mahasiswa")
public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;
    
    @GetMapping
    private List<Mahasiswa> getAll() {
        return mahasiswaService.getAll();
    }
    
    @PostMapping
    public void insert(@RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.insert(mahasiswa);
    }
}
