package controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import repositories.Inscripcio
import repositories.InscripcioRepository

@RestController
class InscripcioController (@Autowired private val inscripcioRepository: InscripcioRepository){
    @PostMapping("/inscripcions")
    fun addInscripcio(@RequestBody inscripcio: Inscripcio): Inscripcio? {
        return inscripcioRepository.save(inscripcio)
    }
}