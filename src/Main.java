import java.util.InputMismatchException;
import java.util.Scanner;

import exception.BadCharException;
import repository.ButtonActions1;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		final ButtonActions1 buttonActions1 = new ButtonActions1();
		Scanner sc;

		int statusMain = 0;

		while (statusMain != 9) {
			sc = new Scanner(System.in);
			System.out.println("------------------Üdvözöljük!-------------------");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°Menü°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("A számok lenyomásával választhat az alábbi menûsor közül");
			System.out.println("1-es gomb kisállat felvétele gazdi azonositó alapján!");
			System.out.println("2-es gomb keresés Gazdi azonosito alapján");
			System.out.println("3-as gomb Oltások listázása");

			try {
				statusMain = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Nem jo karaktert adtál meg!");
				continue;
			}
			try {

				switch (statusMain) {
				case 1:
					while (statusMain != 0) {
						System.out.println("1-es gomb uj állat felvétele új gazdával!");
						System.out.println("2-es gomb uj állat felvétele meglévõ gazdával!");

						statusMain = sc.nextInt();
						switch (statusMain) {
						case 1:
							buttonActions1.newPerson();
							break;
						case 2:
							buttonActions1.newPets();
							break;
						}
					}
					continue;

				case 2:
					while (statusMain != 0) {
						System.out.println("1es gomb Gazdi keresés személyigazolvány alapján!");
						System.out.println("2-es gomb keresés név és email cim alapján");
						System.out.println("3as gomb keresés chipszám alapján");
						System.out.println("9es gomb kilépés");
						statusMain = sc.nextInt();
						switch (statusMain) {
						case 1:
							buttonActions1.searchByPeopleId();
							break;
						case 2:
							buttonActions1.searcByEmail();
							break;
						case 3:
							buttonActions1.searcByChipNumber();
							break;

						case 9:
							System.out.println("A PROGRAM LEÁLLT!");
							break;
						default:
							break;
						}
					}

					break;

				default:
					throw new BadCharException();
				}
			} catch (BadCharException e) {
				System.err.println(e.getMessage());
			}
			sc.close();
		}

	}
}