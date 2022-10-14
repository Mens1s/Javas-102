package D_Interface;

public class ABank implements IBank {
    private String bankaAdi;
    private String terminalID;
    private String password;

    public ABank(String bankaAdi, String terminal_id, String password){
        this.bankaAdi = bankaAdi;
        this.terminalID = terminal_id;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("User ip : " + ipAddress);
        System.out.println("Machine ip : " + this.hostIpAdress);
        System.out.println(this.getBankaAdi()+" 'ina basarili baglanti kuruldu!");
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean payment(double price, String cardNumber, String expiryDate, String CVC){
        System.out.println("Islem basarili oldu!");
        return false;
    }
    public String getBankaAdi() {return bankaAdi;}
    public void setBankaAdi(String bankaAdi) {this.bankaAdi = bankaAdi;}

    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}

    public String getTerminalID() {return terminalID;}
    public void setTerminalID(String terminal_id) {this.terminalID = terminal_id;}
}
