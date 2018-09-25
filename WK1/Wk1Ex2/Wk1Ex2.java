class Wk1Ex2 {
    public static void main(String[] args) {

        String argumentOne = args[0];
        String argumentTwoStr = args[1];
        int argumentTwo = Integer.parseInt(argumentTwoStr);
        String argumentThreeStr = args[2];
        char argumentThree = argumentThreeStr.charAt(0);

        Boolean acceptArgOne;
        Boolean acceptArgTwo;
        Boolean acceptArgThree = false;

        switch (argumentOne) {
            case "d": acceptArgOne = true;
                break;

            case "e": acceptArgOne = true;
                break;

            default: acceptArgOne = false;
                break;
        }

        if (argumentTwo > 0 && argumentTwo < 27) acceptArgTwo = true; 
        else acceptArgTwo = false;

        char[] lowerCaseAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                					'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (char letter: lowerCaseAlphabet) {
            if (argumentThree == letter)
                acceptArgThree = true;
        }

        if (acceptArgOne == false) {
        	System.out.println("'" + argumentOne + "'" + " is not a valid first parameter.\n Valid parameters are: d and e.");
        }
        if (acceptArgTwo == false) {
        	System.out.println("'" + argumentTwo + "'" + " is not a valid second parameter.\n Valid parameters are: 1 to 26.");
        }
        if (acceptArgTwo == false) {
        	System.out.println("'" + argumentThree + "'" + " is not a valid third parameter.\n Valid parameters are: lower case a-z.");
        }
        if (acceptArgOne == true && acceptArgTwo == true && acceptArgThree == true) {
        	System.out.println("Thank you. All parameters are valid: " + argumentOne + ", " + argumentTwo + ", " + argumentThree + ".");
        }

    }

}

//Run with 'java Wk1Ex2 d 15 hello'
