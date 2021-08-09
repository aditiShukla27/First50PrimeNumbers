package com.company;

public class Main {

    public static void main(String[] args) {
       //isPrime(45);
        generateNumbers();

        }
        public static void generateNumbers() {
            int i;
            int count = 0;
            for (i = 2; i <= 100050; i++) {
                boolean answer = isPrime(i);
                if (answer == true) {
                    count++;
                    if (count <= 50) {
                        if (count % 5 == 0) {
                            System.out.println(i + " ");
                        } else {
                            System.out.print(i + " ");
                        }
                    }


                }
            }
        }

            public static boolean isPrime ( int checkNum){
                int divider;
                boolean isPrime = true;
                for (divider = 2; divider <= checkNum - 1; divider++) {
                    while (checkNum % divider == 0) {
                        isPrime = false;
                        break;
                    }
                }
                return isPrime;
            }
        }


