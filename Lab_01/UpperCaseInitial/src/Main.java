public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "alice", "bob", "pippo", "pluto"};

        for (String word : words) {
            if (word.length() > 0) {


                String iniziale = String.valueOf(word.charAt(0));
                String substring = word.substring(1);
                String init = iniziale.toUpperCase();
                String finale = init + substring;
                System.out.println(finale);
            }else{
                System.out.println();
            }
        }
    }
}