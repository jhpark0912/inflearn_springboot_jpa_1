package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcodes;

    protected Address() {
    }

    public Address(String city, String street, String zipcodes) {
        this.city = city;
        this.street = street;
        this.zipcodes = zipcodes;
    }
}
