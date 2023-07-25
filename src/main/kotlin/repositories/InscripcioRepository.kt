package repositories

import jakarta.persistence.metamodel.SingularAttribute
import org.springframework.data.jpa.domain.AbstractPersistable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.io.Serializable
import java.util.Optional

@Repository
interface InscripcioRepository: JpaRepository<Inscripcio, Long> {
    fun findById (id: SingularAttribute<AbstractPersistable<Serializable>, Serializable>?): Optional<Inscripcio>
}