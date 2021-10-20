package one.digitalinnovation.personapi2.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    NOME("Home"),
    MOBILE("Mobile"),
    COMMERCIAL("Comercial");

    private final String description;
}
