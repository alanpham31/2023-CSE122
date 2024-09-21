// Author: Alan Pham
// TA: Kevin Nguyen
// Date: Oct 4 2023
// This is a program that takes DNA and returns the  
// nucleotide that appears most frequently in that DNA

public class DNA {
    public static void main(String[] args) {
        String dna = "ATGCGCACTATGGTAG";
        String mostCommon = mostCommonNucleotide(dna);
        System.out.println(dna + " => " + mostCommon);
    }
    
    // TODO write your mostCommonNucleotide and helper methods here
    
    // method to find most common nucleotide
    public static String mostCommonNucleotide(String dna) {
        int countA = 0, countC = 0, countG = 0, countT = 0;

        // loop through dna to count nucleotides
        for (char nucleotide : dna.toCharArray()) {
            if (nucleotide == 'A') {
                countA++;
            }
            else if (nucleotide == 'C') {
                countC++;
            }
            else if (nucleotide == 'G') {
                countG++;
            }
            else if (nucleotide == 'T') {
                countT++;
            }
            else {
            }
        }

        char prevalentNucleotide = ' ';
        int maxCount = 0;

        // determine which nucleotide is most common
        if (countA > maxCount) {
            maxCount = countA;
            prevalentNucleotide = 'A';
        }
        if (countC > maxCount) {
            maxCount = countC;
            prevalentNucleotide = 'C';
        }
        if (countG > maxCount) {
            maxCount = countG;
            prevalentNucleotide = 'G';
        }
        if (countT > maxCount) {
            maxCount = countT;
            prevalentNucleotide = 'T';
        }
        // value of most common nucleotide = maxCount

        String t = String.valueOf(prevalentNucleotide);
        return t;
    }
}