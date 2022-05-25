public class loops {
    public static void main(String[] args) {
        String name = "noah";

        for (int i = 0; i < name.length(); i++) {
            for (int q = 0; q < name.length(); q++) {
                for (int w = 0; w < name.length(); w++) {
                    for (int e = 0; e < name.length(); e++) {
                        System.out.println("" + name.charAt(i) + name.charAt(q) + name.charAt(w) + name.charAt(e));
                    }
                }
            }
        }
    }
}
