import java.util.Scanner;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class EntryPoint {

    public static void main(String[] args) {
        // configurez ici votre école :
        // - Instantiation de vos promotions, enseignants, salles...
        // - Le programme est déjà pré écrit, il ne reste qu'à compléter les TODO

        System.out.println("/_\\ Bienvenue sur 3IL room manager!");

        // la Console permet de faciliter la récupération d'une saisie de l'utilisateur dans la console
        Console console = new Console();
        int functionToRun = -1;
        do {
            System.out.println("Qu'est-ce que tu veux faire?");
            System.out.println("1 - Lister les salles disponibles");
            System.out.println("2 - Effectuer une réservation");
            System.out.println("3 - J'ai fini");

            functionToRun = console.captureInt(1, 4);
                // contrôle de la saisie
                switch(functionToRun) {
                    case 1:
                        // TODO FS1 : Lister les salles disponibles
                        System.out.println("Voici la liste des salles disponibles");
                        break;
                    case 2:
                        // TODO FP1 : réserver une salle
                        System.out.println("Voici la liste des enseignants");
                        break;
                        break;
                    case 3:
                        System.out.println("A la prochaine!");
                    default:
                        System.err.println("Saisie invalide... tu dois choisir entre 1 et 3");
                }
            System.out.println("###################################################");

        } while(functionToRun != 3);

    }
}
