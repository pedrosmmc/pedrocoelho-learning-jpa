package com.pedrocoelho.learningjpa.domain;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Notes {
    private String notes;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notes notes1 = (Notes) o;
        return Objects.equals(notes, notes1.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notes);
    }

    @Override
    public String toString() {
        return "Notes{" +
                "notes='" + notes + '\'' +
                '}';
    }
}

