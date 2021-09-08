public class HomeWork2 {
    public static void main(String[] args) {
        // Task 1
        int a = -1, b = 0;
        if (a > b)
            System.out.println("a is bigger than b");
        else if (a < b)
            System.out.println("a is smaller than b ");
        else
            System.out.println("they are equal");
        System.out.println();

// Task 2
        char firstWord = 'b', secondWord = 'a', thirdWord = 'l';
        if (secondWord > firstWord && secondWord > thirdWord) {
            System.out.print(secondWord + ">");
            if (firstWord > thirdWord)
                System.out.print(firstWord + ">" + thirdWord);
            else
                System.out.print(thirdWord + ">" + firstWord);
        } else if (firstWord > secondWord && firstWord > thirdWord) {
            System.out.print(firstWord + ">");
            if (secondWord > thirdWord)
                System.out.println(secondWord + ">" + thirdWord);
            else
                System.out.println(thirdWord + ">" + secondWord);
        } else if (thirdWord > firstWord && thirdWord > secondWord) {
            System.out.print(thirdWord + ">");
            if (secondWord > firstWord)
                System.out.println(secondWord + ">" + firstWord);
            else
                System.out.println(firstWord + ">" + secondWord);
        }
//        Task 3. version 1

//        boolean redIsHitFromBehind, blackIsHitFromBehind;
//        redIsHitFromBehind = false;
//        blackIsHitFromBehind = false;
//        if (redIsHitFromBehind)
//            System.out.println("Red");
//        else if (blackIsHitFromBehind)
//            System.out.println("black");
//        else
//            System.out.println("Invalid state");

//        Task 3.version 2
        boolean redIsHitFromBehind, blackIsHitFromBehind;
        redIsHitFromBehind = true;
        blackIsHitFromBehind = false;
        if (redIsHitFromBehind == true && blackIsHitFromBehind == true || redIsHitFromBehind == false && blackIsHitFromBehind == false )
            System.out.println("Invalid state");
        else if (blackIsHitFromBehind)
            System.out.println("black");
        else
            System.out.println("Red");
    }

}
