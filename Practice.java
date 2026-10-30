/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


  

    public class Practice {
// NUMBER 1 PROBLEM

        public static void main(String[] args) {
            int results = oddeven(20);
            System.out.println(results);
        }

        static int oddeven(int oddeven) {
            int status;

            if (oddeven % 2 == 0) {
                status = 1;
            } else {
                status = 0;
            }
            return status;

        }
    }
// PROBLEM NUMBER 2
    public static int classifyTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }

        if (a == b && b == c) {
            return 1;
        } else if (a == b || a == c || b == c) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {

        System.out.println(classifyTriangle(3, 3, 3));
        System.out.println(classifyTriangle(5, 5, 8));
        System.out.println(classifyTriangle(4, 5, 6));
        System.out.println(classifyTriangle(1, 2, 3));
        System.out.println(classifyTriangle(-1, 5, 5));
    }
