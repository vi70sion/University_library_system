import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UniversityLibrary implements LibraryManagement{
    public List<BookJournal> libraryList = new ArrayList<>();
    public List<BookJournal> getLibraryList() { return libraryList; }

    @Override
    public void addBookJournal(BookJournal bookJournal) {
        libraryList.add(bookJournal);
        System.out.println("Pridėta.");
    }

    @Override
    public void removeBookJournal(String printedMaterialName) {

    }

    @Override
    public void searchBookJournal(String printedMaterialName) {

    }

    public void printLibraryList(){
        System.out.println("Bibliotekos leidinių sąrašas:");
        int i = 0;
        for(BookJournal item : libraryList){
            i++;
            System.out.println(i + ". " + item.PrintedMaterialInfo());
        }
        System.out.println();
    }

    public void readBookJournalFromCSV(String filePathBooksCSV){
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePathBooksCSV));
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] lineValues = line.split(",");
                libraryList.add(new BookJournal(lineValues[0], lineValues[1], Integer.parseInt(lineValues[2])));
            }
            bufferedReader.close();
        } catch (IOException e){
            System.err.println("Nepavyko skaityti failo: " + e.getMessage());
        }
        System.out.println("Įvykdyta.");
        System.out.println();
    }

}
