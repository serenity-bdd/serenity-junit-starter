package starter;

public enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF"), YELLOW("#FFFF00"), BLACK("000000"), WHITE("#FFFFFF");

    private final String rgbHexValue;

    Color(String rgbHexValue){
        this.rgbHexValue = rgbHexValue;
    }

    public String rgbHexValue() {
        return rgbHexValue;
    }
}
