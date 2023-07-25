package com.example.backendmoia.repositories

import jakarta.persistence.*


@Table(name = "inscripcions")
@Entity
data class Inscripcio(
    var nomCognoms: String,
    var dataNaixement: Long?,
    var nomPares: String,
    var documentIdentitat: Long?,
    var correu: String,
    var telefon: Long,
    var residencia: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
)
