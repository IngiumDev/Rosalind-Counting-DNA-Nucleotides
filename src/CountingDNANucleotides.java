public class CountingDNANucleotides {
    public static void main(String[] args) {
        countDNANucleotides("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"); // Sample input: 20 12 17 21
    }

    public static void countDNANucleotides(String sequence) {
        char[] bases = new char[]{'a', 'c', 'g', 't'}; // Feel free to add some new bases here...
        int[] count = new int[bases.length];
        for (char base : sequence.toCharArray()) {
            base = Character.toLowerCase(base); // Works with upper case and lower case
            for (int i = 0; i < count.length; i++) {
                if (base == bases[i]) {
                    count[i] += 1;
                }
            }
        }
        for (int j : count) System.out.print(j + " ");
    }
}