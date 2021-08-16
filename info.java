
import java.util.Scanner;
import java.util.Arrays;





public class info {

    public static void main(String[] args) {
      
// List of hospitals to donate supplies too
        String[] hospitals = {"Hospitals to donate supplies too:" +
                "\n•GHESKIO Center\n" +
                "33 Boulevard Harry Truman, Port-au-Prince, Haiti\n" +
                "+509 44 47 8738\n" +
                "https://www.gheskio.org\n" +
                "" +
                "\n•Petition Ville Hospital:\n" +
                "Hospital Notre Dame SA-Petition Ville\n" +
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
                "\n.Zanmi Lasante(Associated with Partners in health-\n" +
                "https://zanmilasante.org/home\n" +
                "\nDesjardines, Haiti:\n" +
                "Hospital Albert Schweitzer:\n" +
                "Fax: 412-361-5400\n" +
                " (412) 361-5200\n" +
                "\n" +
                "https://hashaiti.org\n" +
                "\n" +
                "Email: info@hashaiti.org"};

// english supplies list
        String[] englishsupplies = {"\n" +
                "Betadine\n" +
                "Lidocaine\n" +
                "Hydrogen peroxide\n" +
                "syrigine\n" +
                "suture\n" +
                "sterile gauze\n" +
                "solutes(NACI/RL,DW)\n" +
                "Scalepl\n" +
                "Bandage\n" +
                "Adhesive\n" +
                "Connection\n" +
                "Intracath\n" +
                "Gloves\n" +
                "Dicolofenac\n" +
                "tramadol\n" +
                "antibiotics\n" +
                "soft band\n" +
                "gypsona\n" +
                "cervical collar\n" +
                "blood pressure moinitor\n" +
                "glucomoeter/strips\n" +
                "satometer\n" +
                "stethoscope\n" +
                "masks"};

// french/kreyol supply list

        String[] frsupplies = {"\n" +
                "Betadine\n" +
                "lidocaine\n" +
                "eau oxygénée \n" +
                "Seringe\n" +
                "fil de suture\n" +
                "Gaze stérile \n" +
                "Solutés(NACI/RL,DW)\n" +
                "Bistouri\n" +
                "pansements\n" +
                "Adhesif\n" +
                "Raccord\n" +
                "Intracath\n" +
                "Gants\n" +
                "Dicolofenac\n" +
                "Tramadol\n" +
                "Antibiotiques \n" +
                "Tissus\n" +
                "Soft band\n" +
                "Gyponsa\n" +
                "Collier cervical\n" +
                "Tensiometre\n" +
                "Glucometre+bandelettes\n" +
                "sautrometre\n" +
                "Stethoscope\n" +
                "Masques"};

        Scanner scan = new Scanner(System.in);
        //Current situation/title(english and French)

        System.out.println("---------------------------" +
                "\n     Haitian Situation\uD83C\uDDED\uD83C\uDDF9\uD83C\uDDED\uD83C\uDDF9" +
                "\n-------------------------------");


        System.out.println("On Sunday,August 16th, a 7.2 magnitude earthquake occurred in the southern peninsula of Haiti." +
                "\nSpecifically effecting the following cities: Les Cayes(Aux Cayes),Jeremie, and Petit Trou de Nippes" +
                "\nand affected the departments of: Sud,Nippes, and Grand'Anse(southern peninsula as well)" +
                "\nAs of now, the death toll has reached 1297 people, with injuries of reaching 5700 people." +
                "\nIn addition to, many hospitals,especially in Les Cayes, are currently overwhelmed with injured patients");

        scan.nextLine();

        // Hospitals
        System.out.println("In addition too, many of these hospitals are in need of supplies as well." +
                "\nSo after researching which Haitian based hospitals/organizations are currently supplying to the regions affected." +
                "\nI came up with the following list of hospitals(Haitian based, not so much foreign based)" +
                "\nwhich are currently in need of supplies in order to aid those affected by the quake." +
                "\nSo if you or anyone you know is able too, here are some  Haitian based hospitals i found that are currently" +
                "\nbringing supplies and aiding those who are affected." +
                "\nlist consists of the locations,emails,websites,phone #'s" +
                "\n" +
                "\n"+Arrays.toString(hospitals));

        scan.nextLine();
        // supplies

        System.out.println("In addition to, here are some supplies that are requested by not only these hospitals." +
                "\nbut many other hospitals around the southern peninsula are in need of as well" +
                "\n"+Arrays.toString(englishsupplies));

        // warning

        System.out.println("Also, here's just some advice, before you start sending supplies, or even money towards haiti" +
                "\nMAKE SURE YOU DO YOUR RESEARCH before sending anything, ESPECIALLY MONEY, towards the relief effort." +
                "\nIn addition to,it would be better to donate to Haitian/Haiti based organizations, rather than foreign ones" +
                "\nwhen it comes to donating materials.");
    }
  
}


