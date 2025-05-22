package com.fiap.N.I.B.ignore.gateways.requests;

import com.fiap.N.I.B.model.Profissional;
import com.fiap.N.I.B.model.Usuario;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoPatch {


    @Size(max = 25, message = "Rua deve ter no máximo 25 caracteres")
    private String ruaEndereco;

    private Integer numeroEndereco;

    @Size(max = 20, message = "Complemento deve ter no máximo 20 caracteres")
    private String complementoEndereco;

    @Size(max = 20, message = "Bairro deve ter no máximo 20 caracteres")
    private String bairroEndereco;

    @Size(max = 30, message = "Cidade deve ter no máximo 30 caracteres")
    private String cidadeEndereco;

    @Size(max = 9, message = "CEP deve ter no máximo 9 caracteres")
    private String cepEndereco;

    @Size(min = 2, max = 2, message = "Estado deve ter 2 caracteres")
    private String estadoEndereco;

    private Usuario usuario;

    private Profissional profissional;


}
