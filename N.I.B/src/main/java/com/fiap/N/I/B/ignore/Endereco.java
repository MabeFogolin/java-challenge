package com.fiap.N.I.B.ignore;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fiap.N.I.B.model.Profissional;
import com.fiap.N.I.B.model.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Endereco extends RepresentationModel<Endereco> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 25, message = "Rua deve ter no máximo 25 caracteres")
    private String ruaEndereco;

    @NotNull
    private int numeroEndereco;

    @Size(max = 20, message = "Complemento deve ter no máximo 20 caracteres")
    private String complementoEndereco; // Campo permite NULL

    @NotNull
    @Size(max = 20, message = "Bairro deve ter no máximo 20 caracteres")
    private String bairroEndereco;

    @NotNull
    @Size(max = 30, message = "Cidade deve ter no máximo 30 caracteres")
    private String cidadeEndereco;

    @NotNull
    @Size(max = 9, message = "CEP deve ter no máximo 9 caracteres")
    private String cepEndereco;

    @NotNull
    @Size(min = 2, max = 2, message = "Estado deve ter 2 caracteres")
    private String estadoEndereco;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @OneToOne(fetch = FetchType.LAZY)
    private Profissional profissional;
}