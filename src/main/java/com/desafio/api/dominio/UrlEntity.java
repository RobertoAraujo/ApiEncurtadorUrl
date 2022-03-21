package com.desafio.api.dominio;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class UrlEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String url;
    @Column
    private String urlEncurtada;

    public UrlEntity() {
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

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UrlEntity urlEntity = (UrlEntity) o;
        return Objects.equals(id, urlEntity.id) && Objects.equals(url, urlEntity.url) && Objects.equals(urlEncurtada, urlEntity.urlEncurtada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, urlEncurtada);
    }

    @Override
    public String toString() {
        return "UrlEntity{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", urlEncurtada='" + urlEncurtada + '\'' +
                '}';
    }
}
