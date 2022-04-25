class MeineKlasse {
    public static void meineMethode() {
        System.out.println("Hallo Welt");
    }

    public static void main(String[] args) {
        System.out.println("Ich habe diese Argumente bekommen: ");
        for (int i = 0; i < args.length; i = i + 1) {
            System.out.println("    * " + args[i]);
        }
        
        meineMethode();
    }

}
