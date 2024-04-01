package br.com.ricardo.desafiopicpay.authorization;

public class UnauthorizedTransactionException extends RuntimeException {

    public UnauthorizedTransactionException(String message) {
        super(message);
    }

}
