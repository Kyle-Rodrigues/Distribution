package com.example.model;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;
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
public class Item {
    public enum Brand {
        Nike("Nike"), Adidas("Adidas"), Gucci("Gucci");

        public final String title;

        private Brand(String title) {
            this.title = title;
        }
    }

    @Id
    private long id;
    @NotBlank
    private String name;
    @Min(2021)
    private int yearCreated;
    @Min(1000)
    private float price;
    private int quantity;
    private Brand brand;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(nullable = false)
    private DistributionCentre distributionCentre;
}
