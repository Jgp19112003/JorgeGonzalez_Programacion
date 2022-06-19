package model;

import java.io.Serializable;

public class Factura implements Serializable {


    private String _id, company, country, phone;
    private int invoice;


    public Factura(String _id, String company, String country, String phone, int invoice) {
        this._id = _id;
        this.company = company;
        this.country = country;
        this.phone = phone;
        this.invoice = invoice;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getInvoice() {
        return invoice;
    }

    public void setInvoice(int invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "_id='" + _id + '\'' +
                ", company='" + company + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", invoice=" + invoice +
                '}';
    }
}
