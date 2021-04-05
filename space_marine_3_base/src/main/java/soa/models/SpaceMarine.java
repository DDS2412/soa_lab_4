package soa.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import soa.enums.AstartesCategory;
import soa.enums.MeleeWeapon;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Data
@Accessors(chain = true)
@Entity
@Table(name = "space_marines")
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

    @Id
    @Min(0)
    @SequenceGenerator(name = "spaceMarinesIdSeq", sequenceName = "space_marines_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "spaceMarinesIdSeq")
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    @Column(nullable = false)
    private String name; //Поле не может быть null, Строка не может быть пустой

    @NotNull
    private Coordinates coordinates; //Поле не может быть null

    @NotNull
    private LocalDateTime creationDate = LocalDateTime.now(); //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    @Min(0)
    private long health; //Значение поля должно быть больше 0

    private Integer height; //Поле может быть null

    @NotNull
    private AstartesCategory category; //Поле не может быть null

    @NotNull
    private MeleeWeapon meleeWeapon; //Поле не может быть null

    private Chapter chapter; //Поле может быть null
}
