class AnotherClient implements Callback {
    public void callBack (int p)    {
        System.out.println("Another version of callback");
        System.out.println("p squared is: " + (p*p));
    }
}
