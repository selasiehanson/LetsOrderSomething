package com.soundlabz.orderings.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by selasiehanson on 20/10/2015.
 */
@Entity
public class User {

    @Id
    private Long id;

    @NotNull
    private String username;

    @NotNull
    private String email;

    @NotNull
    private String password;
}
