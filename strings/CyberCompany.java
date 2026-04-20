public class CyberCompany {
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";


        for (int i=0; i<s.length(); i++) {
            for (int j=1; j<t.length();j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    System.out.println(true);
                }
            }
        }
        System.out.println(false);
    }
}
