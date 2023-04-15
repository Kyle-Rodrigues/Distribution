package com.example.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class DistributionCentre {
    @Id
    private long id;

    @NotBlank
    private String name;

    private List<Item> itemsAvailable;

    private float longitude;
    private float latitude;
    
}
