package com.desafio.api.util;

public class UrlUtil {
    public static String buildAlias(String url) {
        String novaUrlEncurtada = url;
        novaUrlEncurtada = novaUrlEncurtada.replace("https://www.", "");
        novaUrlEncurtada = novaUrlEncurtada.replace("http://www.", "");
        novaUrlEncurtada = novaUrlEncurtada.replace("https://", "");
        novaUrlEncurtada = novaUrlEncurtada.replace("http://", "");

        novaUrlEncurtada = novaUrlEncurtada.substring(0, novaUrlEncurtada.indexOf("/"));
        return novaUrlEncurtada;
    }
}
