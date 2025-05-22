package com.fiap.N.I.B.ignore;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fiap.N.I.B.model.Usuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Historico extends RepresentationModel<Historico> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToOne
    private Usuario usuario;

    @NotNull
    @Min(value = 0, message = "O valor mínimo permitido é 0")
    @Max(value = 999, message = "O valor máximo permitido é 999")
    private int tratamentoHistorico;

    @NotNull
    @Min(value = 0, message = "O valor mínimo permitido é 0")
    @Max(value = 999, message = "O valor máximo permitido é 999")
    private int canalHistorico;

    @NotNull
    @Min(value = 0, message = "O valor mínimo permitido é 0")
    @Max(value = 999, message = "O valor máximo permitido é 999")
    private int limpezaHistorico;

    @NotNull
    @Min(value = 0, message = "O valor mínimo permitido é 0")
    @Max(value = 999, message = "O valor máximo permitido é 999")
    private int carieHistorico;

    @NotNull
    @Min(value = 0, message = "O valor mínimo permitido é 0")
    @Max(value = 999, message = "O valor máximo permitido é 999")
    private int ortodonticoHistorico;

    @NotNull
    @Min(value = 0, message = "O valor mínimo permitido é 0")
    @Max(value = 999, message = "O valor máximo permitido é 999")
    private int cirurgiaHistorico;

}