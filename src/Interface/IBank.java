package Interface;

public interface IBank {
    final String hostIpAdress = "127.0.0.1";

    boolean connect(String ipAddress);
    boolean payment(double price, String cardNumber, String date, String cvc);

}
