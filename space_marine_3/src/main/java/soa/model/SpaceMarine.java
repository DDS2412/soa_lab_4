package soa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import soa.enums.AstartesCategory;
import soa.enums.MeleeWeapon;

import java.time.LocalDateTime;


@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SpaceMarine {
    public SpaceMarine(
            String name,
            Coordinates coordinates,
            Integer height,
            AstartesCategory category,
            long health,
            MeleeWeapon meleeWeapon,
            Chapter chapter){
        this.name = name;
        this.coordinates = coordinates;
        this.height = height;
        this.category = category;
        this.health = health;
        this.meleeWeapon = meleeWeapon;
        this.chapter = chapter;
    }

    public SpaceMarine(
            String name,
            Coordinates coordinates,
            Integer height,
            AstartesCategory category,
            MeleeWeapon meleeWeapon,
            Chapter chapter){
        this.name = name;
        this.coordinates = coordinates;
        this.height = height;
        this.category = category;
        this.meleeWeapon = meleeWeapon;
        this.chapter = chapter;
    }

   private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    private String name; //Поле не может быть null, Строка не может быть пустой

    private Coordinates coordinates; //Поле не может быть null

    private LocalDateTime creationDate = LocalDateTime.now(); //Поле не может быть null, Значение этого поля должно генерироваться автоматически

   private long health; //Значение поля должно быть больше 0

    private Integer height; //Поле может быть null

   private AstartesCategory category; //Поле не может быть null

    private MeleeWeapon meleeWeapon; //Поле не может быть null

    private Chapter chapter; //Поле может быть null

    private Starship starship;
}