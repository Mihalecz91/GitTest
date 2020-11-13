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
			System.out.println("------------------�dv�z�lj�k!-------------------");
			System.out.println("���������������������Men��������������������������");
			System.out.println("A sz�mok lenyom�s�val v�laszthat az al�bbi men�sor k�z�l");
			System.out.println("1-es gomb kis�llat felv�tele gazdi azonosit� alapj�n!");
			System.out.println("2-es gomb keres�s Gazdi azonosito alapj�n");
			System.out.println("3-as gomb Olt�sok list�z�sa");

			try {
				statusMain = sc.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Nem jo karaktert adt�l meg!");
				continue;
			}
			try {

				switch (statusMain) {
				case 1:
					while (statusMain != 0) {
						System.out.println("1-es gomb uj �llat felv�tele �j gazd�val!");
						System.out.println("2-es gomb uj �llat felv�tele megl�v� gazd�val!");

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
						System.out.println("1es gomb Gazdi keres�s szem�lyigazolv�ny alapj�n!");
						System.out.println("2-es gomb keres�s n�v �s email cim alapj�n");
						System.out.println("3as gomb keres�s chipsz�m alapj�n");
						System.out.println("9es gomb kil�p�s");
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
							System.out.println("A PROGRAM LE�LLT!");
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