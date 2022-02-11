package com.marketkurly.clonekurly.domain.member;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
public enum Gender{
    FEMALE,MALE,OTHERS;


}
