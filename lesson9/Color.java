package lesson9;

public enum Color {
    RED("#ff0000"),
    BLACK("#uefvf"),
    YELLOW("#uefvf"),
    GREEN("#uefvf"),
    BLUE("#uefvf");
    private String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    public String getColorCode(){
        return colorCode;
    }
}
