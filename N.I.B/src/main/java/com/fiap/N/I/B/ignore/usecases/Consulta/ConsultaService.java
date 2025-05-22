package com.fiap.N.I.B.ignore.usecases.Consulta;

import com.fiap.N.I.B.model.Consulta;
import com.fiap.N.I.B.ignore.gateways.requests.ConsultaPatch;
import com.fiap.N.I.B.ignore.gateways.responses.ConsultaPostResponse;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ConsultaService {

    ConsultaPostResponse criarConsulta(String cpfUser, String registroProfissional, Consulta consultaParaInserir);

    List<Consulta> consultasPorUsuario(String cpfUser);

    Optional<Consulta> atualizarConsultaTotalmente(String cpfUser, LocalDate dataConsulta, Consulta consultaParaAtualizar);

    boolean deletarRegistro(String cpfUser, LocalDate dataConsulta);

    Optional<Consulta> atualizarInformacoesConsulta(String cpfUser, String registroProfissional, LocalDate dataConsulta, ConsultaPatch consultaPatch);

    List<Consulta> todosRegistros();

    List<Consulta> consultasPorProfissional(String registroProfissional);

    Optional<Consulta> buscarConsultaPorData(String cpfUser, LocalDate dataConsulta);
}
