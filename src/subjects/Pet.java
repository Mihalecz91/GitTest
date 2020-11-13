package subjects;

public class Pet {

	private String name;
	private String type;
	private String species;
	private String colour;
	private String date;
	private String weight;
	private String chipNumber;
	private Vaccinacion vaccina;

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

	public Vaccinacion getVaccina() {
		return vaccina;
	}

	public void setVaccina(Vaccinacion vaccina) {
		this.vaccina = vaccina;
	}

	public Pet(String name, String type, String species, String colour, String date, String weight, String chipNumber,
			Vaccinacion vaccina) {
		super();
		this.name = name;
		this.type = type;
		this.species = species;
		this.colour = colour;
		this.date = date;
		this.weight = weight;
		this.chipNumber = chipNumber;
		this.vaccina = vaccina;
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

	public Pet() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chipNumber == null) ? 0 : chipNumber.hashCode());
		result = prime * result + ((colour == null) ? 0 : colour.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((species == null) ? 0 : species.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((vaccina == null) ? 0 : vaccina.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		if (chipNumber == null) {
			if (other.chipNumber != null)
				return false;
		} else if (!chipNumber.equals(other.chipNumber))
			return false;
		if (colour == null) {
			if (other.colour != null)
				return false;
		} else if (!colour.equals(other.colour))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (vaccina == null) {
			if (other.vaccina != null)
				return false;
		} else if (!vaccina.equals(other.vaccina))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name = " + name + ", type=" + type + ", species=" + species + ", colour=" + colour + ", date=" + date
				+ ", weight=" + weight + ", chipNumber=" + chipNumber + ", vaccina =" + vaccina;
	}

}
