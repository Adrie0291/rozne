package org.example;
// Jeśli dana liczba jest kwadratem liczby X, program wypisuje kwadrat liczby X+1, w przeciwnym przypadku wypisuje -1
public class NextSquares {
    public static void main(String[] args) {
        long number = 900L;
        System.out.println(findNextSquare3(number));
    }

    public static long findNextSquare(long sq) {

        boolean kwadrat = false;
        long i;
        for (i = 0L; i < 99999999L; i++) {
            if (i * i == sq) {
                kwadrat = true;
                break;
            } else {
                kwadrat = false;
            }
        }
        if (kwadrat) {
            return (i + 1) * (i + 1);
        } else {
            return -1L;
        }
    }

    public static long findNextSquare2(long sq) {
        long root = (long) Math.sqrt(sq);
        return root * root == sq ? (root + 1) * (root + 1) : -1;
    }

    public static long findNextSquare3(long sq) {
        long r = (long) Math.sqrt(sq);
        if (r * r != sq)
            return -1;
        return ((r + 1) * (r + 1));
    }
}
