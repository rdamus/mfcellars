package dev.brassrat.model

import com.fasterxml.jackson.annotation.JsonFormat
import io.micronaut.core.annotation.Introspected

import javax.validation.constraints.NotBlank
import java.time.LocalDate
import java.time.LocalDateTime

@Introspected
class Wine {
    enum Grape{
        BURGUNDY_RED,BURGUNDY_WHITE,BORDEAUX
    }
    @NotBlank
    String region
    @NotBlank
    String vineyard
    @NotBlank
    Grape grape
    String wineMaker
    @NotBlank
    Integer year

    Float score
    String comments

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate dateTasted
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    LocalDateTime dateUpdated

    Wine(){}
}
