package com.fc.mairiedigital.mdigitkati;

import com.fc.mairiedigital.mdigitkati.model.Etat;
import com.fc.mairiedigital.mdigitkati.model.Personnes;
import com.fc.mairiedigital.mdigitkati.model.Profils;
import com.fc.mairiedigital.mdigitkati.repository.PersonneRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MdigitkatiApplication implements CommandLineRunner {
	@Autowired
	PersonneRepository personneRepository;

	public static void main(String[] args) {
		SpringApplication.run(MdigitkatiApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		List<Personnes> personneList = personneRepository.findAll();
		if (personneList.size() <= 0) {
			LocalTime deheure = LocalTime.now();
			String dteure = deheure.toString();
			char[] dt = dteure.toCharArray();
			Personnes personnes = new Personnes();
			personnes.setNom("DIARRA");
			personnes.setPrenom("Fatoumata");
			personnes.setEtat(Etat.ACTIVER);
			personnes.setNumeros("+22390916715");
			personnes.setProfils(Profils.ADMIN);
			personnes.setEmail("fatou@gmail.com");
			personnes.setPassword("azerty2000");
			personneRepository.save(personnes);

		}

	}
}


