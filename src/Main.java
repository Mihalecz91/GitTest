
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
			System.out.println("------------------�dv�z�lj�k!-------------------");
			System.out.println("���������������������Men��������������������������");
			System.out.println("A sz�mok lenyom�s�val v�laszthat az al�bbi men�sor k�z�l");
			System.out.println("1-es gomb Kis�llat felv�tele!");
			System.out.println("2-es gomb Keres�s");
			System.out.println("3-as gomb Olt�sok list�z�sa");
			System.out.println("5-�s gomb KIL�P�S");

			try {
				statusMain = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Nem jo karaktert adt�l meg!");
				continue;
			}
			try {

				switch (statusMain) {
				case 1:
					System.out.println("-----------Kis�llat fel�vtele------------");
					System.out.println("1 -es gomb megl�v� gazd�hoz!");
					System.out.println("2- es gomb �j gazd�val!");

					while (statusSub1 != 0) {
						try {
							sc = new Scanner(System.in);
							statusSub1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.err.println("Nem jo karaktert adt�l meg");
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
					System.out.println("-----------Kis�llat keres�se------------");
					System.out.println("1 -es gomb gazdi  email cime alapjan!");
					System.out.println("2 -es gomb kis�llat alapj�n!");

					while (statusSub1 != 0) {
						try {
							sc = new Scanner(System.in);
							statusSub1 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.err.println("Nem jo karaktert adt�l meg");
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
					System.out.println("-----------Kis�llat Olt�sai------------");
					System.out.println("1 -es gomb �j olt�s");
					System.out.println("2 -es gomb eddigi olt�sok list�z�sa!");

					while (statusSub2 != 0) {
						try {
							sc = new Scanner(System.in);
							statusSub2 = sc.nextInt();
						} catch (InputMismatchException e) {
							System.err.println("Nem jo karaktert adt�l meg");
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
