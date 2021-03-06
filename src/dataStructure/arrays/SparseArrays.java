package dataStructure.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SparseArrays {
    static int[] matchingStrings(String[] strings, String[] queries) {

        int[] arr = new int[queries.length];
        int count = 0;
//        int[] count = new int[1];

//        IntStream.range(0,queries.length).forEach(i->{
//                IntStream.range(0,strings.length).forEach(j->{
//                    if (queries[i].equals(strings[j])) count[0]++;
//                });
//                arr[i] = count[0];
//                count[0]=0;
//        });

        for (int i = 0; i < queries.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (queries[i].equals(strings[j]))  count++;
            }
            arr[i] = count;
            count=0;
        }

        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file.txt"));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }


        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
