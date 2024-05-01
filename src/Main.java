import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Užduotis: Universiteto Bibliotekos Sistema
//        Tikslas: Parašyti programą bibliotekos valdymui, naudojant paveldėjimą, abstrakčias klases, išimčių valdymą ir sąsajas.
//        1. Pagrindiniai komponentai
//        Leidinys: Tai bus abstrakti klasė, kuri apibrėžia bendrąsias savybes ir funkcionalumą, būtiną
//        visiems bibliotekos leidiniams. Šioje klasėje turėtų būti bent šie elementai: Privatus kintamasis pavadinimas.
//        Konstruktorius, kuris priima pavadinimą. Abstrakti metodas rodytiInformacija(), kuris atvaizduoja leidinio informaciją.
//        Knyga ir Žurnalas: Tai konkretūs Leidinys klasių paveldėjimai. Kiekviena iš šių klasių turės
//        papildomų savybių, pavyzdžiui, autorių ar išleidimo datą, ir implementuos rodytiInformacija() metodą.
//        Paveldėjimas: Knyga ir Žurnalas klasės paveldės Leidinys klasę.
//        2.  Interface'as BibliotekosValdymas
//        Šis interface'as apibrėžia metodų, kuriuos turi implementuoti bet kokia bibliotekos valdymo klasė, rinkinį:
//          pridetiLeidini(Leidinys leidinys): pridėti naują leidinį į biblioteką.
//          pašalintiLeidini(String pavadinimas): pašalinti leidinį iš bibliotekos.
//          ieškotiLeidinio(String pavadinimas): rasti ir grąžinti leidinį pagal pavadinimą.
//        3. Klaidų valdymas
//        Sukurti kelias išimčių klases, pavyzdžiui, LeidinioNerastaException, kuri bus mesta, kai bandant
//        rasti leidinį pagal pavadinimą, jo bibliotekoje nėra.
//        Valdyti išimtis tinkamai visose vietose, kurios gali sukelti klaidas, pvz., paieškoje ar šalinime.
//        4. Pagrindinė įgyvendinimo klasė UniversitetoBiblioteka
//        Ši klasė implementuos BibliotekosValdymas sąsają ir valdys visus bibliotekos leidinius.
//        Turės privačią sąrašo kolekciją, kurioje saugomi visi leidiniai.
//                Implementuos visus sąsajos metodus, pridedant, šalinant ir ieškant leidinius, taip pat valdant išimtis, kai reikia.
//                Pavyzdinės Užduotys
//        Parašyti visas minėtas klases ir sąsajas.
//        Testuoti sistemą, pridedant įvairius leidinius ir bandant juos šalinti ar rasti.
//        Užtikrinti, kad klaidos būtų tvarkomos tinkamai, pavyzdžiui, mėginant pašalinti leidinį, kurio nėra.
//        EXTRA: Sukurti leidinių nuskaitymą iš failo


        Scanner scanner = new Scanner(System.in);
        UniversityLibrary library = new UniversityLibrary();
        String filePathBooksCSV = "C:\\JavaTest\\BookJournalList.csv";
        String choice = "";
        do{
            System.out.println("(1)- nuskaityti leidinius iš CSV failo, (2)- išvesti leidinių sąrašą,");
            System.out.println("(3)- pridėti leidinį, (4)- pašalinti leidinį, (5)- ieškoti leidinio,");
            System.out.println("(0)- pabaiga");
            choice = scanner.nextLine();
            switch(choice){
                case "1":
                    library.readBookJournalFromCSV(filePathBooksCSV);
                    break;
                case "2":
                    library.printLibraryList();
                    break;
                case "3":
                    System.out.println("Įveskite leidinį- (pavadinimas), (autorius), (išleidimo metai): ");
                    library.addBookJournal(new BookJournal(scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine())));
                    break;
                case "4":
                    break;
                case "5":
                    break;
            }
        } while(!choice.equals("0"));


    }
}