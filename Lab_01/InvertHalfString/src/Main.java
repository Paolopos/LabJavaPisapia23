public class Main {
    public static void main(String[] args) {
        String[] words = {"c", "ac", "ciao", "pippo"};

        for (String word : words) {
            String result;

            if(word.length()>1) {
                String prima = word.substring(0,word.length()/2);
                String seconda = word.substring(word.length()/2);

                result = seconda+prima;


                System.out.println(result);
            }
            else {
                System.out.println("Stringa corta");
            }
        }
    }
}