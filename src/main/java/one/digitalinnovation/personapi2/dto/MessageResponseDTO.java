package one.digitalinnovation.personapi2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}