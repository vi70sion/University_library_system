public class BookJournal extends PrintedMaterial{
    private String bookAuthor;
    private int publicationYear;
    public BookJournal(String printedMaterialName, String bookAuthor, int publicationYear) {
        super(printedMaterialName);
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }

    @Override
    public String PrintedMaterialInfo() {
        return super.getPrintedMaterialName() + " " + bookAuthor + " " + publicationYear;
    }
}
