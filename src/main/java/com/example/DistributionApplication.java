package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.DistributionCentre;
import com.example.model.Item;
import com.example.repository.DistributionCentreRepository;
import com.example.repository.ItemRepository;

@SpringBootApplication
public class DistributionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributionApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(ItemRepository itemRepository, DistributionCentreRepository dcRepository) {
		return args -> {
			var distributionCentre1 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 1").latitude(53.5229f).longitude(-113.6216f)
							.build());

			itemRepository
					.save(Item.builder().name("Polo Shirt").price(1099.99f).quantity(17).yearCreated(2021)
							.brand("Nike").distributionCentre(distributionCentre1).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(1399.00f).quantity(7).yearCreated(2021)
							.brand("Adidas").distributionCentre(distributionCentre1).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(1100.39f).quantity(8).yearCreated(2021)
							.brand("Gucci").distributionCentre(distributionCentre1).build());

			var distributionCentre2 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 2").latitude(53.5229f).longitude(-113.6216f)
							.build());

			itemRepository
					.save(Item.builder().name("Polo Shirt").price(1000.09f).quantity(1).yearCreated(2021)
							.brand("Nike").distributionCentre(distributionCentre2).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(1700.89f).quantity(18).yearCreated(2021)
							.brand("Adidas").distributionCentre(distributionCentre2).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(1001.99f).quantity(0).yearCreated(2021)
							.brand("Gucci").distributionCentre(distributionCentre2).build());

			var distributionCentre3 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 3").latitude(53.5229f).longitude(-113.6216f)
							.build());
			itemRepository
					.save(Item.builder().name("Polo Shirt").price(1000.39f).quantity(0).yearCreated(2021)
							.brand("Nike").distributionCentre(distributionCentre3).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(1079.99f).quantity(3).yearCreated(2021)
							.brand("Adidas").distributionCentre(distributionCentre3).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(1029.99f).quantity(17).yearCreated(2021)
							.brand("Gucci").distributionCentre(distributionCentre3).build());

			var distributionCentre4 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 4").latitude(80.5124f).longitude(-20.6216f)
							.build());
			itemRepository
					.save(Item.builder().name("Polo Shirt").price(1000.39f).quantity(0).yearCreated(2021)
							.brand("Nike").distributionCentre(distributionCentre4).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(1079.99f).quantity(3).yearCreated(2021)
							.brand("Adidas").distributionCentre(distributionCentre4).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(1029.99f).quantity(17).yearCreated(2021)
							.brand("Gucci").distributionCentre(distributionCentre4).build());
		};
	}
}
