package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void function() {

        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        assertFalse(SILab2.function(new User(null, "password", "user@email.com"), new ArrayList<>(List.of(
                new User("Somebody", "passwordd", "somebody@mail.com"),
                new User("Somebodyy", "passwordd", "sonemodyy@mail.com")
        ))));

        assertFalse(SILab2.function(new User("Someone", "passwr", "someone_mail"),null));

        assertFalse(SILab2.function(new User("Somebody2", "pass word", "somebody2@mail.com"), new ArrayList<>(List.of(
                new User("Somebody2", "pass word", "somebody2@mail.com"),
                new User("Somebody2", "pass word", "somebody2@mail.com")
        ))));

        assertFalse(SILab2.function(new User("Somebody3", "password!", "user_mail"), null));
    }
    @Test
    void function2(){
        RuntimeException ex;
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex=assertThrows(RuntimeException.class, () -> SILab2.function(new User("User", null, "username@gmail.com"), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex=assertThrows(RuntimeException.class, () -> SILab2.function(new User("User", "password", null), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

       assertFalse(SILab2.function(new User("User2", "password", "user2@gmail.com"), new ArrayList<>()));

    }



}