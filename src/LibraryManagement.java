public interface LibraryManagement {

    public void addBookJournal(BookJournal bookJournal);
    public void removeBookJournal(String printedMaterialName);
    public void searchBookJournal(String printedMaterialName);
    public void printLibraryList();
    public void readBookJournalFromCSV(String filePathBooksCSV);

}
