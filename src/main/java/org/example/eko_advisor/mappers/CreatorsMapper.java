package org.example.eko_advisor.mappers;

import com.fasterxml.jackson.annotation.JsonGetter;

@JsonGetter
public class CreatorsMapper {
    int id;
    String abbr;
    String firstName;
    String lastName;
    String patronymic;
    String phoneNumber;
    String email;
    String img;
}
