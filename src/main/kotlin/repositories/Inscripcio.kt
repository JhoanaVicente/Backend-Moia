package repositories

import jakarta.persistence.*


@Table(name = "inscripcions")
@Entity
data class Inscripcio(
    var nomCognoms: String,
    @Lob
    var dataNaixement: Long?,
    var nomPares: String,
    var documentIdentitat: Long?,
    @Lob
    var correu: String,
    var telefon: Long,
    var residencia: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
)
