package repositories

import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DataLoader {
    class DataLoader(private val inscripcioRepository: InscripcioRepository) {
        @PostConstruct
        fun load() {
            val inscripcions = listOf(
                Inscripcio (
                    "Jhoana Vicente Morales",13061985, "Raul-Rita", 46430355, "jvicentemorales13@gmail.com", 673408687, "Barcelona", 1
                ),
            )
            inscripcioRepository.saveAll(inscripcions)
            println("$inscripcions")
        }
    }
}