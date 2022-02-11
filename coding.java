public class Interview {
    public static class PassData {
        //fill this in
        //you need to model how many entries are allowed in total and how many entries are allowed in a single day
    }

    public static void main(String [] args) {
        PassData allowed = new PassData();
        PassData deniedDay = new PassData();
        PassData deniedPass = new PassData();

        System.out.println(allowedEntry(allowed, 2, 5));
        System.out.println(allowedEntry(deniedDay, 2, 2));
        System.out.println(allowedEntry(deniedPass, 1, 3));
    }

    public static boolean allowedEntry(PassData pass, int entriesToday, int totalEntries) {
        //entriesToday is how many times TODAY that this customer has tried to enter this attraction
        //totalEntries is how many times IN TOTAL that this customer has tried to enter this attraction
        return false;
    }
}

