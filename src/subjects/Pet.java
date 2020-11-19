package subjects;

import java.util.List;

public class Pet {

	private String name;
	private String type;
	private String species;
	private String colour;
	private String date;
	private String weight;
	private String chipNumber;
	private List<Vaccinacion> vaccinacions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getChipNumber() {
		return chipNumber;
	}

	public void setChipNumber(String chipNumber) {
		this.chipNumber = chipNumber;
	}

	public List<Vaccinacion> getVaccinacions() {
		return vaccinacions;
	}

	public void setVaccinacions(List<Vaccinacion> vaccinacions) {
		this.vaccinacions = vaccinacions;
	}

	public Pet(String name, String type, String species, String colour, String date, String weight, String chipNumber) {
		super();
		this.name = name;
		this.type = type;
		this.species = species;
		this.colour = colour;
		this.date = date;
		this.weight = weight;
		this.chipNumber = chipNumber;
	}

	public Pet(String name, String type, String species, String colour, String date, String weight, String chipNumber,
			List<Vaccinacion> vaccinacions) {
		super();
		this.name = name;
		this.type = type;
		this.species = species;
		this.colour = colour;
		this.date = date;
		this.weight = weight;
		this.chipNumber = chipNumber;
		this.vaccinacions = vaccinacions;
	}

	public Pet() {

	}

	@Override
	public String toString() {
		return "Név :" + name + ", tipus : " + type + ", fajta :" + species + ", szine : " + colour + ", szül.dátuma : "
				+ date + "\n" + ", súlya: " + weight + "kg" + ", chipszáma :" + "CHIP" + chipNumber + "\n"
				+ ", védõoltásai" + vaccinacions;
	}

}
