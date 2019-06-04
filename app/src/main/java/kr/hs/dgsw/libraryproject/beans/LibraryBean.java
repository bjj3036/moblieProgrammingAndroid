package kr.hs.dgsw.libraryproject.beans;

public class LibraryBean {
    private String libraryName;
    private String location;
    private String closedDay;
    private String libraryImage;

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getClosedDay() {
        return closedDay;
    }

    public void setClosedDay(String closedDay) {
        this.closedDay = closedDay;
    }

    public String getLibraryImage() {
        return libraryImage;
    }

    public void setLibraryImage(String libraryImage) {
        this.libraryImage = libraryImage;
    }
}
