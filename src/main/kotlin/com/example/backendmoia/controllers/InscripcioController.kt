package com.example.backendmoia.controllers

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import com.example.backendmoia.repositories.Inscripcio
import com.example.backendmoia.repositories.InscripcioRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping

@RestController
@CrossOrigin
class InscripcioController (private val inscripcioRepository: InscripcioRepository) {

    @GetMapping("/inscripcions")
    fun allInscripcions(): List<Inscripcio?>? {
        return inscripcioRepository.findAll()
    }
    @PostMapping("/inscripcions")
    fun inscripcio(@RequestBody inscripcio: Inscripcio): Inscripcio? {
        return inscripcioRepository.save(inscripcio)
    }
}