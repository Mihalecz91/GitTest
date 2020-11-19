
import java.util.InputMismatchException;
import java.util.Scanner;

import exception.BadCharException;
import repository.ButtonActions1;

public class Main {
	@SuppressWarnings("unused")
	private static Scanner sc;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		final ButtonActions1 buttonActions1 = new ButtonActions1();
		Scanner sc;
		int statusMain = 0;
		int statusSub1 = -1;
		int statusSub2 = -1;
		while (statusMain != 5) {
			sc = new Scanner(System.in);
			System.out.println("------------------Üdvözöljük!-------------------");
			System.out.println("°°°°°°°°°°°°°°°°°°°°°Menü°°°°°°°°°°°°°°°°°°°°°°°°°");
			System.out.println("A számok lenyomásával választhat az alábbi menûsor közül");
			System.out.println("1-es gomb Kisállat felvétele!");
			System.out.println("2-es gomb Keresés");
			System.out.println("3-as gomb Oltások listázása");
			System.out.println("5-ös gomb KILÉPÉS");

			try {
				statusMain = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Nem jo karaktert adtál meg!");
				continue;
			}
			try {

				switch (statusMain) {
				case 1:
					System.out.println("-----------Kisállat felévtele------------");
					System.out.println("1 -es gomb meglévõ gazdához!");
					System.out.println("2- es gomb új gazdával!");

					while (statusSub1 != 0) {
						try {
							sc = new Scanner(System.in);
							statusSub1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.err.println("Nem jo karaktert adtál meg");
						}
						try {
							switch (statusSub1) {

							case 1:
								buttonActions1.byPerson();
								break;
							case 2:
								buttonActions1.peopleList();
								break;

							default:
								throw new BadCharException();
							}
						} catch (BadCharException e) {
							System.err.println(e.getMessage());
							buttonActions1.newPets();

						}
					}
				case 2:
					System.out.println("-----------Kisállat keresése------------");
					System.out.println("1 -es gomb gazdi  email cime alapjan!");
					System.out.println("2 -es gomb kisállat alapján!");

					while (statusSub1 != 0) {
						try {
							sc = new Scanner(System.in);
							statusSub1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.err.println("Nem jo karaktert adtál meg");
						}
						try {
							switch (statusSub1) {

							case 1:
								buttonActions1.searcByEmail();
								break;
							case 2:
								buttonActions1.searcByChipNumber();
								break;

							default:
								throw new BadCharException();
							}
						} catch (BadCharException e) {
							System.err.println(e.getMessage());
							buttonActions1.newPets();
						}
					}
				case 3:
					System.out.println("-----------Kisállat Oltásai------------");
					System.out.println("1 -es gomb új oltás");
					System.out.println("2 -es gomb eddigi oltások listázása!");

					while (statusSub2 != 0) {
						try {
							sc = new Scanner(System.in);
							statusSub2 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.err.println("Nem jo karaktert adtál meg");
						}
						try {
							switch (statusSub2) {

							case 1:
								buttonActions1.searcByChipNumber();
								break;
							case 2:
								buttonActions1.searcByChipNumberPet();
								break;

							default:
								throw new BadCharException();
							}
						} catch (BadCharException e) {
							System.err.println(e.getMessage());

						}

					}
				case 5:
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
