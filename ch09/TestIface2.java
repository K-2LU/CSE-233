class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callBack(69);

        c = ob;
        c.callBack(42);
    }    
}
