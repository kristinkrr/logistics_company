package com.example.LogisticCompany.dto.person;

import com.example.LogisticCompany.dto.user.UserDtoResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class PersonDtoResponse extends BasePersonDtoResponse{
    private UserDtoResponse user;
}
