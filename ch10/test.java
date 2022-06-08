class test {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("demo");
            // System.out.println("try");
        } catch (Exception e) {
            System.out.println("Reached");
        }
    }
}