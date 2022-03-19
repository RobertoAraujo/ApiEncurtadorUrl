package com.desafio.api.dominio;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Url implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private String url;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataUpdate;

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

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataUpdate() {
        return dataUpdate;
    }

    public void setDataUpdate(LocalDateTime dataUpdate) {
        this.dataUpdate = dataUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Url url1 = (Url) o;
        return Objects.equals(id, url1.id) && Objects.equals(url, url1.url) && Objects.equals(dataEntrada, url1.dataEntrada) && Objects.equals(dataUpdate, url1.dataUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, dataEntrada, dataUpdate);
    }

    @Override
    public String toString() {
        return "Url{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", dataEntrada=" + dataEntrada +
                ", dataUpdate=" + dataUpdate +
                '}';
    }
}
