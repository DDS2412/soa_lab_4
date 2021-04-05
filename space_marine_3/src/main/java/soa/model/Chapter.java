package soa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {
    public Chapter(String name) {
        this.name = name;
    }

    private String name; //Поле не может быть null, Строка не может быть пустой

    private int marinesCount; //Значение поля должно быть больше 0, Максимальное значение поля: 1000
}
