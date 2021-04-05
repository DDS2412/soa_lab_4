package soa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Accessors(chain = true)
@Entity()
@Table(name = "starships")
@AllArgsConstructor
@NoArgsConstructor
public class Starship {
    @Id
    private Long id;

    private String name;

    private String spaceMarineIds;

    public List<Integer> getSpaceMarineIntegerIds(){
        if (spaceMarineIds.isEmpty()){
            return new ArrayList<>();
        }

        return Arrays
                .stream(this.spaceMarineIds.trim().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public void removeSpaceMarine(Integer spaceMarineId){
        List<Integer> spaceMarineIntegerIds = getSpaceMarineIntegerIds();

        if(spaceMarineIntegerIds.removeIf(oldSpaceMarineId -> oldSpaceMarineId.equals(spaceMarineId))){
            this.spaceMarineIds = spaceMarineIntegerIds
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "));
        }
    }
}
