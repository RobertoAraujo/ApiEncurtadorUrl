package com.desafio.api.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Url implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String url;

    public Url() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Url url1 = (Url) o;
        return Objects.equals(id, url1.id) && Objects.equals(url, url1.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        return "Url{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
