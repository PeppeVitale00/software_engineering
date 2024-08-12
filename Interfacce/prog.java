public class prog {

    public static void main(String[] args) {
        IAccount a = new AccountV2();
        System.out.println(a.getBalance());
        a.setBalance(100);
        System.out.println(a.getBalance());
    
    }
}

