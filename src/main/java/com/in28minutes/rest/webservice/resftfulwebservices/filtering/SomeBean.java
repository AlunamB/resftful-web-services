package com.in28minutes.rest.webservice.resftfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;
@JsonFilter("SomeBeanFilter")
public class SomeBean {

    private String field1;

    private String field2;

    private String field3;
    public SomeBean(String value1, String value2, String value3) {
        this.field1=value1;
        this.field2=value2;
        this.field3=value3;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    @Override
    public String toString() {
        return "SomeBean{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}