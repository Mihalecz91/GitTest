package repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

import java.util.stream.Collectors;

import subjects.Person;
import subjects.Pet;

import subjects.Vaccinacion;

public class ButtonActions1 {

	Vaccinacion v1 = new Vaccinacion("2020.08.12", "2025.08.12", "veszets�g");
	Vaccinacion v2 = new Vaccinacion("2019.04.18", "2024.04.18", "mal�ria");
	Vaccinacion v3 = new Vaccinacion("2017.02.12", "2023.02.12", "leimk�r");
	Vaccinacion v4 = new Vaccinacion("2018.11.28", "2024.11.28", "csontritkul�s");
	Vaccinacion v5 = new Vaccinacion("2020.01.08", "2025.01.08", "porcer�sit�");
	Vaccinacion v6 = new Vaccinacion("2014.09.25", "2034.09.25", "gyenges�g");
	List<Vaccinacion> vaccina = new ArrayList<>(Arrays.asList(v1, v2, v3, v4, v5, v6));

	Pet p1 = new Pet("Mocsok", "Puli", "Kutya", "barna", "2015.12.28", "3.5", "12315158", vaccina);
	Pet p2 = new Pet("Susi", "Tulvil�gi", "H�rcs�g", "fekete", "2020.01.28", "0.5", " 7865868", vaccina);
	Pet p3 = new Pet("Bicikli", "Sarga", "Macska", "sarga", "2018.07.12", "1.2", " 213574856", vaccina);
	Pet p4 = new Pet("Zeus", "Amerikai", "L�", "szurke", "2019.09.25", "140", "896577547", vaccina);
	Pet p5 = new Pet("Bady", "Labrador", "Kutya", "feh�r", "2017.02.22", "8.7", "1356865", vaccina);
	Pet p6 = new Pet("Csitli", "Puli", "Kutya", "fekete", "2018.12.28", "2.4", "69875468", vaccina);
	List<Pet> petsList = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));
	Person a1 = new Person("1231485", "Oreg Endre", "nagyon@gmail.com", "+363025154", petsList);
	Person a2 = new Person("5461646", "Nagy Bertold", "bertike@gmail.com", "+36876575", petsList);
	Person a3 = new Person("8697865", "Gyore Robert", "robi23@gmail.com", "+365645654", petsList);
	Person a4 = new Person("6875888", "David Endre", "hovahova@gmail.com", "+36302324", petsList);
	Person a5 = new Person("7887686", "Peter Gy�ngyi", "gyongyom@gmail.com", "+363014757", petsList);
	Person a6 = new Person("4568788", "Burany Laszlo", "zmaj142@gmail.com", "+363021857", petsList);

	List<Person> people = new ArrayList<>(Arrays.asList(a1, a2, a3, a4, a5, a6));
	Scanner sc = new Scanner(System.in);

	public void peopleList() {

		Person person = new Person();
		System.out.println("Add meg a gazdi id sz�m�t!");
		person.setIdNumber(sc.next());
		System.out.println("Add meg a gazdi nev�t!");
		person.setName(sc.next());
		System.out.println("Add meg a gazdi email cim�t!");
		person.setEmail(sc.next());
		System.out.println("Add meg a gazdi telefonsz�m�t!");
		person.setTelephoneNumber(sc.next());
		System.out.println("Add meg a gazdihoz tartoz� �llatot!");
		person.setPets(newPets());
		people.add(person);
		System.out.println(person);

	}

	public List<Pet> newPets() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		List<Pet> newPetsList = new ArrayList<>();
		Pet pets = new Pet();
		System.out.println("Adja meg az �llat nev�t!");
		pets.setName(sc.next());
		System.out.println("Adja meg az �llat tipus�t!");
		pets.setType(sc.next());
		System.out.println("Adja meg az �llat fajt�t!");
		pets.setSpecies(sc.next());
		System.out.println("Adja meg az �llat szin�t!");
		pets.setColour(sc.next());
		System.out.println("Adja meg az �llat sz�let�si d�tum�t!");
		pets.setDate(sc.next());
		System.out.println("Adja meg az �llat s�ly�t!");
		pets.setWeight(sc.next());
		System.out.println("Adja meg az �llat chipsz�m�t!");
		pets.setChipNumber("Chip" + sc.next());
		System.out.println("Adja meg az �llat olt�sait!");
		pets.setVaccinacions(newVaccina());
		newPetsList.add(pets);
		petsList.add(pets);
		return newPetsList;

	}

	public List<Vaccinacion> newVaccina() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		List<Vaccinacion> newVaccinaList = new ArrayList<>();
		Vaccinacion vaccinacion = new Vaccinacion();
		System.out.println("Adja meg a vakcina nev�t vagy tipus�t!");
		vaccinacion.setGroundsForVaccination(sc.next());
		System.out.println("Adja meg a vakcina bead�s�n�k id�pontj�t!");
		vaccinacion.setVaccinationDate(sc.next());
		System.out.println("Adaj meg a vakcina �rv�nyes�g�nek id�pontj�t!");
		vaccinacion.setVaccineValidity(sc.next());
		newVaccinaList.add(vaccinacion);
		vaccina.add(vaccinacion);
		return newVaccinaList;

	}

	public Person byPerson() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a gazdi szem�lyigazolv�ny sz�m�t!");
		String id = sc.next();
		people.forEach(p -> {
			if (p.getIdNumber().equals(id)) {
				System.out.println(p);
				p.setPets(newPets());
				System.out.println(p);

			} else {
				System.err.println("Hib�s adat!");
			}

		});
		return null;
	}

	public void searchByPeopleId() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a gazdi szem�lyigazolv�ny sz�m�t!");

		people.forEach(p -> {
			if (p.getIdNumber().equals(sc.next())) {
				System.out.println(p);
			}
		});

	}

	public void searcByEmail() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a gazdi email cim�t!");
		String email = sc.next();
		List<Person> byEmail = people.stream().filter(p -> p.getEmail().equals(email)).collect(Collectors.toList());

		byEmail.forEach(p -> {
			if (p.getEmail().equals(email)) {
				System.out.println(p);
			}
		});
	}

	public void searcByChipNumber() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a kis�llat chipsz�m�t!");
		String chipNum = sc.next();
		List<Pet> byChip = petsList.stream().filter(p -> p.getChipNumber().equals(chipNum))
				.collect(Collectors.toList());
		byChip.forEach(p -> System.out.println(p));
	}

	public void searcByChipNumberPet() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Adja meg a kis�llat chipsz�m�t!");
		String chipNum = sc.next();
		List<Pet> byChip = petsList.stream().filter(p -> p.getChipNumber().equals(chipNum))
				.collect(Collectors.toList());
		byChip.forEach(p -> System.out.println(p.getVaccinacions()));
	}

}
