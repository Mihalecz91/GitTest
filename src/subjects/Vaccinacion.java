package subjects;

public class Vaccinacion {

	private String vaccinationDate;
	private String vaccineValidity;
	private String groundsForVaccination;

	public Vaccinacion() {

	}

	public String getVaccinationDate() {
		return vaccinationDate;
	}

	public void setVaccinationDate(String vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}

	public String getVaccineValidity() {
		return vaccineValidity;
	}

	public void setVaccineValidity(String vaccineValidity) {
		this.vaccineValidity = vaccineValidity;
	}

	public String getGroundsForVaccination() {
		return groundsForVaccination;
	}

	public void setGroundsForVaccination(String groundsForVaccination) {
		this.groundsForVaccination = groundsForVaccination;
	}

	public Vaccinacion(String vaccinationDate, String vaccineValidity, String groundsForVaccination) {
		super();
		this.vaccinationDate = vaccinationDate;
		this.vaccineValidity = vaccineValidity;
		this.groundsForVaccination = groundsForVaccination;
	}

	@Override
	public String toString() {
		return "vaccinationDate = " + vaccinationDate + ", vaccineValidity=" + vaccineValidity
				+ ", groundsForVaccination=" + groundsForVaccination;
	}

}
