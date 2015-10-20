package com.soundlabz.orderings.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;

/**
 * Created by selasiehanson on 20/10/2015.
 */
@Entity
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;


}
