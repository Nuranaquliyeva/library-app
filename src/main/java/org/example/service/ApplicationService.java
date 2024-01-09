package org.example.service;

import java.util.Scanner;
import java.util.Stack;

public class ApplicationService {
    AuthenticationService authenticationService;
    LibraryService libraryService;
    Scanner scanner;

    public ApplicationService() {
        this.authenticationService = new AuthenticationService();
        this.libraryService = new LibraryService();
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        if (!authenticateUser()) {
            System.out.println("Siz giris ede bilmediniz cehdleriniz bitdi Proqram dayanir...");
            return;
        }

        boolean running = true;
        while (running) {
            printMenu();
            int secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    libraryService.showBooks();
                    break;
                case 2:
                    libraryService.addBook();
                    break;
                case 3:
                    libraryService.deleteBook();
                    break;
                case 4:
                    running = false;
                    System.out.println("Proqramdan istifade etdiyiniz ucun tesekurler");
                    break;
                default:
                    System.out.println("Dogru secim etmemisiniz dogru secim edin");
            }

        }

    }

    private boolean authenticateUser() {
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.println("Usernameni daxil edin : ");
            String username = scanner.nextLine();
            System.out.println("Sifreni daxil edin : ");
            String password = scanner.nextLine();

            boolean authenticate = authenticationService.authenticate(username, password);

            if (authenticate) {
                return true;
            } else {
                attempts++;
            }

        }
        return false;

    }

    private void printMenu() {
        System.out.println("1 - Kitaplari goster");
        System.out.println("2 - Kitap elave et");
        System.out.println("3 - Kitapi sil");
        System.out.println("4 - Proqrami dayandir");
        System.out.println("Secim edin : ");
    }
}
