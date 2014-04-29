package fr.treeptik.runtime;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Animal;
import fr.treeptik.model.Personne;
import fr.treeptik.service.PersonneService;

public class Runtime {

	public static void main(String[] args) throws ServiceException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		/**
		 * Nouveau commentaire pour le commit git
		 */

		
		PersonneService personneService = context
				.getBean(PersonneService.class);
		
		Personne personne = new Personne();
		personne = personneService.findById(11);
		personne.setAnimal(null);
		personneService.remove(personne);
		
		
		
//		Personne personne = new Personne();
//		personne.setDateNaissance(new Date());
//		List<Animal> listAnimal1 = new ArrayList<>();
//		Animal animal = new Animal();
//		animal.setNom("Chien");
//		Animal animal2 = new Animal();
//		animal2.setNom("Chat");
//		Animal animal3 = new Animal();
//		animal3.setNom("Tortue");
//		listAnimal1.add(animal);
//		listAnimal1.add(animal2);
//		listAnimal1.add(animal3);
//		personne.setAnimal(listAnimal1);
//		personneService.save(personne);
//		System.out.println("avant " + personne);
//		
//		Personne findById = personneService.findById(personne.getId());
//		findById.setNom("Test");
//		List<Animal> listAnimal2 = new ArrayList<>();
//		Animal animal4 = new Animal();
//		animal4.setNom("Loup");
//		Animal animal5 = new Animal();
//		animal5.setNom("Pigeon");
//		Animal animal6 = new Animal();
//		animal6.setNom("Poisson");
//		listAnimal2.add(animal4);
//		listAnimal2.add(animal5);
//		listAnimal2.add(animal6);
//		findById.setAnimal(listAnimal2);
//		personneService.update(findById);
//		System.out.println("apres " + findById);
		
//		personne.setNom("MArtin");
//		personne.setPrenom("Paul");
//		List<Animal> animal = new ArrayList<>();
//		animal.add(new Animal());
//		animal.add(new Animal());
//		personne.setAnimal(animal);
//		
//		personneService.save(personne);
//		

	}

}
