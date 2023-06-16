public class I {
    public static void main(String args[]) {
        State UP = new State();
        UP.rule();

    }
    
}

class Country {
    void rule() {
         System.out.println("Article 370");
    }
}

class State extends Country {
    void bill() {
        System.out.println("New Bill Pass");
    }
}
