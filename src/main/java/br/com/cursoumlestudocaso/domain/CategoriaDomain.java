package br.com.cursoumlestudocaso.domain;


import java.io.Serializable;
import java.util.Objects;

public class CategoriaDomain implements Serializable {
    private static final long serialVersionUID = 4732478121400421512L;

    private Integer id;
    private String name;

    public CategoriaDomain() {
    }

    public CategoriaDomain(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriaDomain that = (CategoriaDomain) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
