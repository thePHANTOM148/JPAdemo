package com.jpademo.JPAdemo.Entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@AttributeOverrides({
        @AttributeOverride(name = "Area",
        column = @Column(name = "city"))//if more add it
})
public class Address {

    private String Area;//Area is given as city in database so to match attribute override
    private Long Pincode;

}
