package br.kroton.poc.dto;

/**
 * @author erick.cellani
 */
public class Token {

    private String token;

    public Token(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "token='" + token + '\'' +
                '}';
    }
}
