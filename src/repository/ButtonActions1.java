package repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.stream.Collectors;

import subjects.Person;
import subjects.Pet;
import subjects.Util;
import subjects.Vaccinacion;

public class ButtonActions1 {

	Scanner sc = new Scanner(System.in);

	Vaccinacion v1 = new Vaccinacion("2020.08.12", "2025.08.12", "veszetség");
	Vaccinacion v2 = new Vaccinacion("2019.04.18", "2024.04.18", "malária");
	Vaccinacion v3 = new Vaccinacion("2017.02.12", "2023.02.12", "leimkór");
	Vaccinacion v4 = new Vaccinacion("2018.11.28", "2024.11.28", "csontritkulás");
	Vaccinacion v5 = new Vaccinacion("2020.01.08", "2025.01.08", "porcerõsitõ");
	Vaccinacion v6 = new Vaccinacion("2014.09.25", "2034.09.25", "gyengeség");
	List<Vaccinacion> vaccina = new ArrayList<>(Arrays.asList(v1, v2, v3, v4, v5, v6));

	Pet p1 = new Pet("Mocsok", "Puli", "Kutya", "barna", "2015.12.28", "3.5", "12315158");
	Pet p2 = new Pet("Susi", "Tulvilági", "Hörcsög", "fekete", "2020.01.28", "0.5", " 7865868");
	Pet p3 = new Pet("Bicikli", "Sarga", "Macska", "sarga", "2018.07.12", "1.2", " 213574856");
	Pet p4 = new Pet("Zeus", "Amerikai", "Ló", "szurke", "2019.09.25", "140", "896577547");
	Pet p5 = new Pet("Bady", "Labrador", "Kutya", "fehér", "2017.02.22", "8.7", "1356865");
	Pet p6 = new Pet("Csitli", "Puli", "Kutya", "fekete", "2018.12.28", "2.4", "69875468");
	List<Pet> petsList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
	Person a1 = new Person("1231485", "Oreg Endre", "nagyon@gmail.com", "+363025154");
	Person a2 = new Person("5461646", "Nagy Bertold", "bertike@gmail.com", "+36876575");
	Person a3 = new Person("8697865", "Gyore Robert", "robi23@gmail.com", "+365645654");
	Person a4 = new Person("6875888", "David Endre", "hovahova@gmail.com", "+36302324");
	Person a5 = new Person("7887686", "Peter Gyöngyi", "gyongyom@gmail.com", "+363014757");
	Person a6 = new Person("4568788", "Burany Laszlo", "zmaj142@gmail.com", "+363021857");

	List<Person> people = new ArrayList<>(Arrays.asList(a1, a2, a3, a4, a5, a6));

	public List<Person> newPerson() {
		List<Person> newPeopleList = new ArrayList<>();
		System.out.println("Kérem az gazdi adatait vesszsõvel elválasztva  IdNumber,name,email,telephoneNumber !");
		String adatok = sc.nextLine();
		adatok = adatok.replaceAll(Util.SPACE, Util.EMPTY);
		String[] adatTomb = adatok.split(Util.COMMA);

		String name = adatTomb[1];
		boolean nevDontes = false;
		for (Person person : people) {
			if (name.equalsIgnoreCase(person.getName())) {
				nevDontes = true;
			}
		}
		if (nevDontes) {
			System.out.println("Iyen ember már szerepel a Listában");
		} else {
			Person person = peopleParsen(adatTomb);
			// person = (Person) ujAllathozzaadas(); ///ITT VOLT A GOND
			newPeopleList.add(person);
			people.add(person);
			System.out.println(person);

		}
		return newPeopleList;
	}

	public List<Pet> newPets() {
		List<Pet> newPetsList = new ArrayList<>();

		System.out.println("Kérem adja meg az uj állat adatait vesszõvel elválasztva!" + "name;" + "	 type;"
				+ "	 species;" + "	 colour;" + "	date;" + "	 weight;" + "	 chipNumber; ");
		String uj = sc.nextLine();
		uj = uj.replaceAll(Util.SPACE, Util.EMPTY);
		String[] adatTomb = uj.split(Util.COMMA);
		String chip = adatTomb[6];
		boolean chipNum = false;
		for (Pet pet : petsList) {
			if (chip.equalsIgnoreCase(pet.getChipNumber())) {
				chipNum = true;
			}
		}
		if (chipNum) {
			System.out.println("Evvel a chipszámmal már van állat!");
		} else {

			Pet pet = petsParsen(adatTomb);
			// pet = (Pet) vaccinacions((Vaccinacion) vaccina);
			newPetsList.add(pet);
			petsList.add(pet);

		}
		return newPetsList;

	}

	public List<Vaccinacion> vaccinacions(Vaccinacion vaccina) {

		Vaccinacion vaccinacion = new Vaccinacion();
		System.out.println("Kérem adja meg a vakcinához szükséges adatokat");
		String vakcina = sc.nextLine();
		vakcina = vakcina.replace(Util.SPACE, Util.EMPTY);
		String[] adatTomb = vakcina.split(Util.COMMA);
		vaccina.setGroundsForVaccination(vakcina);
		vaccina.setVaccinationDate(vakcina);
		vaccina.setVaccineValidity(vakcina);
		Vaccinacion vaccina1 = vaccinaParsen(adatTomb);

		return vaccinacions(vaccina1);

	}

	private Person peopleParsen(String[] adatok) {
		return new Person(adatok[0], adatok[1], adatok[2], adatok[3]);
	}

	private Pet petsParsen(String[] adatok) {
		return new Pet(adatok[0], adatok[1], adatok[2], adatok[3], adatok[4], adatok[5], adatok[6]);
	}

	private Vaccinacion vaccinaParsen(String[] adatok) {
		return new Vaccinacion(adatok[0], adatok[1], adatok[2]);
	}

	public Person byPerson() {
		System.out.println("Adja meg a gazdi személyigazolvány számát!");
		String adat = sc.next();
		people.forEach(p -> {
			if (p.getIdNumber().equals(adat)) {
				p.setPets((Pet) newPets());
				;
			} else {
				System.err.println("Hibás adat!");
			}
			;

		});
		return null;
	}

	public void searchByPeopleId() {
		System.out.println("Adja meg a gazdi személyigazolvány számát!");
		String adat = sc.next();
		people.forEach(p -> {
			if (p.getIdNumber().equals(adat)) {
				System.out.println(p);
			}
		});

	}

	public void searcByEmail() {
		System.out.println("Adja meg a gazdi nevét!");
		String name = sc.next();
		List<Person> byName = people.stream().filter(p -> p.getName().equals(name)).collect(Collectors.toList());
		System.out.println(byName.toString());
		String email = sc.next();
		byName.forEach(p -> {
			if (p.getEmail().equals(email)) {
				System.out.println(p);
			}
		});
	}

	public void searcByChipNumber() {
		System.out.println("Adja meg a kisállat chipszámát!");
		String chipNum = sc.next();
		List<Pet> byChip = petsList.stream().filter(p -> p.getChipNumber().equals(chipNum))
				.collect(Collectors.toList());
		byChip.forEach(p -> System.out.println(p));
	}

	/// EZEKET MEG SE HIVTAM
	private static void addVaccinaToPet(List<Pet> pets, List<Vaccinacion> vaccinacions) {
		Random random = new Random();
		pets.forEach(p -> p.setVaccina(vaccinacions.get(random.nextInt(vaccinacions.size()))));
		System.out.println(pets);

	}

	private static void addPetToPerson(List<Person> people, List<Pet> pets) {
		Random random = new Random();
		people.forEach(p -> p.setPets(pets.get(random.nextInt(pets.size()))));
		System.out.println(people);

	}

}
