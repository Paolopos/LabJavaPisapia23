public class Main {
    public static void main(String[] args) {
        String[] words = {"", "a", "sasso", "pippo", "test"};

        for (String word : words) {
            int position = -1;
            if (word.length() > 1) {
                String substring = word.substring(0,1);
                position = word.indexOf(substring,1);

                System.out.println(position);

            } else {
                System.out.println(position);
            }

        }
    }
}