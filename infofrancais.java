import java.util.Scanner;
import java.util.Arrays;
public class infofrancais {

    public static void main(String[] args) {

// hospitals
        String[] hospitals = {"Hôpitaux à donner les provisions:" +
                "\n•GHESKIO Center\n" +
                "33 Boulevard Harry Truman, Port-au-Prince, Haiti\n" +
                "+509 44 47 8738\n" +
                "https://www.gheskio.org\n" +
                "" +
                "\n•L'hôpital Petition Ville:\n" +
                "L'hôpital  Notre Dame SA-Petition Ville\n" +
                "#13 Audant Street, Route de Frere, Petion-Ville\n" +
                "3214-6622 / 2996-3232\n" +
                "\n" +
                "https://www.hndsa.com\n" +
                "." +
                "\n.Mirebalais, Haiti:\n" +
                "Hôpital Universitaire de Mirebalais/ Partners in health hospital:\n" +
                "Rte Départmentale 11, Arrondissement de Mirebalais, Haiti\n" +
                "tel:\n" +
                "+509 28 10 6828\n" +
                "https://www.pih.org/pages/mirebalais" +
                "\n" +
                "\n.Zanmi Lasante(Associated avec Partners in health-\n" +
                "https://zanmilasante.org/home\n" +
                "\nDesjardines, Haiti:\n" +
                "L'Hôpital Albert Schweitzer:\n" +
                "Fax: 412-361-5400\n" +
                " (412) 361-5200\n" +
                "\n" +
                "https://hashaiti.org\n" +
                "\n" +
                "Email: info@hashaiti.org"};

// les provisions
        String[] frsupplies = {"" +
                "\nBetadine" +
                "\nlidocaine" +
                "\neau oxygénée " +
                "\nSeringe" +
                "\nfil de suture" +
                "\nGaze stérile " +
                "\nSolutés(NACI/RL,DW)" +
                "\nBistouri" +
                "\npansements" +
                "\nAdhesif" +
                "\nRaccord" +
                "\nIntracath" +
                "\nGants" +
                "\nDicolofenac" +
                "\nTramadol" +
                "\nAntibiotiques " +
                "\nTissus" +
                "\nSoft band" +
                "\nGyponsa" +
                "\nCollier cervical" +
                "\nTensiometre" +
                "\nGlucometre+bandelettes" +
                "\nsautrometre" +
                "\nStethoscope" +
                "\nMasques"};


        Scanner scan = new Scanner(System.in);
        // titre
        System.out.println("---------------------------" +
                          "\nLa Situation Haïtien\uD83C\uDDED\uD83C\uDDF9\uD83C\uDDED\uD83C\uDDF9" +
                          "\n---------------------------");

        // Dimanche

        System.out.println("Sur Lundi, 14 Août, un 7.2 magintude tremblement de terre s'est produit a 8h30 dans le matin en la péninsule du sud. " +
                "\nÊtre plus specific, les villes: Les Cayes(Aux cayes), Jérémie, et Petiti trou de nippes sont affectés par le tremblement de terre. " +
                "\nAussi, les départements: Sud, Nippes, et Grand'Anse(la pensiule sud) sont affectés par le tremblement de terre aussi. " +
                "\n Au le momemnt, 1297 gens sont morts et plus que 5700 gens sont blessés par le tremblement de terre. " +
                "\nAussi, beaucoup des hôpitaux dans Les Cayes ont trop des patients blessés.");

        scan.nextLine();

        System.out.println("En plus que, beaucoup des hôpitaux besoin provisions aussi. " +
                         "\nApres je faisais  quelque chercherais lequel hôpitals et organisations haïtiennes sont aident les régions qui sont affectés par le tremblement de terre. " +
                         "\nJe faisais une listes des hôpitaux(les organisations haïtiennes, et pas vraiment les organisations étrangères) " +
                         "\nlequel besion l'aide et apportant les provisions pour les gens quisont affectés ou blessés par le tremblement de terre.");

//hospitals
        System.out.println("Alors, si vous ou vous connaissez quelqu'un qui pourrait, je trouve quelques hôpitaux ça sont apporte les provisions et aides les gens qui sont affectés\n" +
                "\n*La liste consister en les locations, les numerous des téléphones, les websites,et les courriers électroniques*" +
                "\n"+Arrays.toString(hospitals));
System.out.println();
scan.nextLine();
// les provisions

        System.out.println("Aussi, une liste du les provisions qui sont demandés par pas juste les hôpitaux dans cette liste." +
                "\nMais aussi pour beaucoup des autres hôpitaux dans la pensiule sud." +
                "\n"+Arrays.toString(frsupplies));
scan.nextLine();
System.out.println();
        //faire gaffe

        System.out.println("Aussi, avant vous donnez les provisions ou l'argent à haïti, FAIRE GAFFE, " +
                "\nET FAISAIS TA RECHERE avant vous donnez quelque chose, PARTICULEMENT L'ARGENT.  " +
                "\nAussi, c'est plus mieux si vous donnez à les organisations et hôpitaux haïtiens autre que les organisations étrangères.");
    }

}
