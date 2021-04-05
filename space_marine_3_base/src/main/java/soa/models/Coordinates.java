package soa.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Embeddable;
import javax.validation.constraints.Min;

@Data
@Accessors(chain = true)
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Coordinates {
    @Min(-897)
    private double x; //Значение поля должно быть больше -897

    @Min(-726)
    private long y; //Значение поля должно быть больше -726
}
