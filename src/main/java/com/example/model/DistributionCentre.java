package com.example.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotNull
    private float longitude;
    @NotNull
    private float latitude;
    @OneToMany(mappedBy = "distributionCentre")
    private List<Item> itemsAvailable;
}
