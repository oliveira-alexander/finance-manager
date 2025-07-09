package edu.financemanager.dtos.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCreateDTO {
    @NotNull (message = "O nome deve ser informado!")
    @Size (min = 5, message = "O nome deve ter no mínimo 5 caracteres!")
    @Size (max = 50, message = "O nome deve ter no máximo 50 caracteres!")
    private String name;

    @NotNull (message = "O E-mail deve ser informado!")
    @Email (message = "E-mail inválido!")
    private String email;
}
