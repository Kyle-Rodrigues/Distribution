package com.example.Distribution;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.DistributionCentre;
import com.example.model.Item;
import com.example.model.Item.Brand;
import com.example.repository.DistributionCentreRepository;
import com.example.repository.ItemRepository;

@SpringBootApplication
public class DistributionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributionApplication.class, args);
	}

	@Bean
	CommandLineRunner dataLoader(ItemRepository itemRepository, DistributionCentreRepository dcRepository) {
		return args -> {
			var distributionCentre_1 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 1").latitude(53.5229f).longitude(-113.6216f)
							.build());

			itemRepository
					.save(Item.builder().name("Polo Shirt").price(39.99f).quantity(17).yearCreated(2021)
							.brand(Brand.Nike).distributionCentre(distributionCentre_1).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(79.99f).quantity(7).yearCreated(2021)
							.brand(Brand.Adidas).distributionCentre(distributionCentre_1).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(29.99f).quantity(8).yearCreated(2021)
							.brand(Brand.Gucci).distributionCentre(distributionCentre_1).build());

			var distributionCentre_2 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 1").latitude(53.5229f).longitude(-113.6216f)
							.build());

			itemRepository
					.save(Item.builder().name("Polo Shirt").price(39.99f).quantity(1).yearCreated(2021)
							.brand(Brand.Nike).distributionCentre(distributionCentre_2).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(79.99f).quantity(18).yearCreated(2021)
							.brand(Brand.Adidas).distributionCentre(distributionCentre_2).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(29.99f).quantity(0).yearCreated(2021)
							.brand(Brand.Gucci).distributionCentre(distributionCentre_2).build());

			var distributionCentre_3 = dcRepository
					.save(DistributionCentre.builder().name("Warehouse 1").latitude(53.5229f).longitude(-113.6216f)
							.build());

			itemRepository
					.save(Item.builder().name("Polo Shirt").price(39.99f).quantity(0).yearCreated(2021)
							.brand(Brand.Nike).distributionCentre(distributionCentre_3).build());
			itemRepository
					.save(Item.builder().name("Hoodie").price(79.99f).quantity(3).yearCreated(2021)
							.brand(Brand.Adidas).distributionCentre(distributionCentre_3).build());
			itemRepository
					.save(Item.builder().name("T-Shirt").price(29.99f).quantity(17).yearCreated(2021)
							.brand(Brand.Gucci).distributionCentre(distributionCentre_3).build());
		};
	}
}
