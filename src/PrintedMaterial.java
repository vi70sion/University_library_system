public abstract class PrintedMaterial {
    private String printedMaterialName;
    public PrintedMaterial(String printedMaterialName) {
        this.printedMaterialName = printedMaterialName;
    }
    public String getPrintedMaterialName() { return printedMaterialName; }

    public abstract String PrintedMaterialInfo();

}
