public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println("String Concatenation Performance Test");

        long time1 = testStringConcatenation();
        System.out.println("Time taken using String: " + time1 + " ns");

        long time2 = testStringBuilderConcatenation();
        System.out.println("Time taken using StringBuilder: " + time2 + " ns");

        long time3 = testStringBufferConcatenation();
        System.out.println("Time taken using StringBuffer: " + time3 + " ns");
    }
    private static long testStringConcatenation() {
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str += "a";
        }
        return System.nanoTime() - startTime;
    }

    private static long testStringBuilderConcatenation() {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        return System.nanoTime() - startTime;
    }

    private static long testStringBufferConcatenation() {
        long startTime = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sb.append("a");
        }
        return System.nanoTime() - startTime;
    }
}
//output
//  String Concatenation Performance Test
//Time taken using String: 45577689600 ns
//Time taken using StringBuilder: 7985800 ns
//Time taken using StringBuffer: 19861600 ns