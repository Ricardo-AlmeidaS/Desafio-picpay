package br.com.ricardo.desafiopicpay.authorization;

public record Authorization(
        String message) {
    public boolean isAuthorized() {
        return message.equals("Authorized");
    }
}
