package com.fiap.N.I.B.Repositories;

import com.fiap.N.I.B.model.Diario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DiarioRepository extends JpaRepository<Diario, Long> {

    List<Diario> findByUsuario_CpfUser(String cpfUser);

    Optional<Diario> findRegistroByUsuario_CpfUserAndDataRegistro(String cpfUser, LocalDate dataRegistro);

}

