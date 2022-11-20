package Days.day_15;

    class Test {
        static int x = 15;
        static int z = 3;
        static int y;


        static {
            System.out.println("y = " + y);
            int y = 15 + 3;
            System.out.println("y2 = " + y);

        }

            static int r = 15;
            static int c = 3;
            static int m;


            static {
                System.out.println("m = " + m);
                int r = 15 + 3;
                System.out.println("m2 = " + r);
            }

            public static void main(String[] args) {
                System.out.println("args Rahwit Medal");

                System.out.println("y1 = " + y);
                System.out.println("z = " + z);
                System.out.println("y3 = " + (z + x));
                System.out.println(" m= " + m);

            }
        }
