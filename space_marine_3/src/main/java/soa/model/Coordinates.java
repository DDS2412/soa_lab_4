package soa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Coordinates {
    private double x; //Значение поля должно быть больше -897

    private long y; //Значение поля должно быть больше -726
}
