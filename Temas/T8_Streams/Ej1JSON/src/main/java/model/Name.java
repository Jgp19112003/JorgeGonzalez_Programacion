package model;

public class Name {

    private String first, last, tittle;

    public Name(String first, String last, String tittle) {
        this.first = first;
        this.last = last;
        this.tittle = tittle;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", tittle='" + tittle + '\'' +
                '}';
    }
}
