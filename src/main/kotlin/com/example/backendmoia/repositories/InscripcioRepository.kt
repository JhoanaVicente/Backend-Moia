package com.example.backendmoia.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface InscripcioRepository: JpaRepository<Inscripcio, Long> {
}