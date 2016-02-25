package sample;

public class Action {
    public static String binAns = "0";
    public static String octAns = "0";
    public static String hexAns = "0";
    public static String decAns = "0";

    public static boolean firstNumber = true;
    public static int start = 0;
    public static int end = 0;

    public static void toBinary(long number){
        boolean added = false;
        long bin = 0;

        while(number != 0){
            bin = number % 2;
            number /= 2;
            if(!added){
                binAns = "" + bin;
                added = true;
            }else {
                binAns += bin;
            }
        }
        String newString = "";
        for(int i=binAns.length()-1; i>-1; i--){
            newString += binAns.charAt(i);
        }
        if(!newString.isEmpty()){
            binAns = newString;
        }
    }

    public static void toOctal(long number){
        boolean added = false;
        long bin = 0;

        while(number != 0){
            bin = number % 8;
            number /= 8;
            if(!added) {
                octAns = ""+bin;
                added = true;
            }else{
                octAns += bin;
            }
        }
        String newString = "";
        for(int i=octAns.length()-1; i>-1; i--){
            newString += octAns.charAt(i);
        }
        if(!newString.isEmpty()){
            octAns = newString;
        }
    }

    public static void toHex(long number){
        boolean added = false;
        long bin = 0;

        while (number != 0){
            bin = number % 16;
            number /= 16;
            if(!added) {
                added = true;
                if(bin > 9) {
                    if(bin == 15){
                        hexAns = "F";
                    }
                    if(bin == 14){
                        hexAns = "E";
                    }
                    if(bin == 13){
                        hexAns = "D";
                    }
                    if(bin == 12){
                        hexAns = "C";
                    }
                    if(bin == 11){
                        hexAns = "B";
                    }
                    if(bin == 10){
                        hexAns = "A";
                    }
                }else{
                    hexAns = "" + bin;
                }
            }else{
                if(bin > 9){
                    if(bin == 15){
                        hexAns += "F";
                    }
                    if(bin == 14){
                        hexAns += "E";
                    }
                    if(bin == 13){
                        hexAns += "D";
                    }
                    if(bin == 12){
                        hexAns += "C";
                    }
                    if(bin == 11){
                        hexAns += "B";
                    }
                    if(bin == 10){
                        hexAns += "A";
                    }
                }else{
                    hexAns += bin;
                }
            }
        }
        String newString = "";
        for(int i=hexAns.length()-1; i>-1; i--){
            newString += hexAns.charAt(i);
        }
        if(!newString.isEmpty()){
            hexAns = newString;
        }
    }

    public static void binToDec(String binNum) {
        long binN = Long.valueOf(binNum);
        long decNum = 0;
        int p = 0;
        while(true){
            if(binN == 0){
                break;
            }else{
                long power = 1;
                long bin = binN % 10;
                for(int i=0; i<p; i++){
                    power *= 2;
                }
                decNum += power*bin;
                p++;
                binN /= 10;
            }
        }

        decAns = "" + decNum;
    }

    public static void octToDec(String octNum){
        long octN = Long.valueOf(octNum);
        long decNum = 0;
        int p = 0;
        while(true){
            if(octN == 0){
                break;
            }else{
                long power = 1;
                long oct = octN % 10;
                for(int i=0; i<p; i++){
                    power *= 8;
                }
                decNum += power*oct;
                p++;
                octN /= 10;
            }
        }
        decAns = "" + decNum;
    }

    public static void hexToDec(String hexNum){
        String digits = "0123456789ABCDEF";
        long decNum = 0;
        for (int i = 0; i < hexNum.length(); i++) {
            char hex = hexNum.charAt(i);
            int temp = digits.indexOf(hex);
            decNum = 16*decNum + temp;
        }
        decAns = "" + decNum;
    }

    public static long calculation(final String numbers){
        long numA;
        long numB;
        long answer = 0;
        try{
            numA = getNumber(numbers);
        }catch(StringIndexOutOfBoundsException e){
            numA = 0;
        }
        firstNumber = false;
        end +=1;
        start = end;
        try {
            numB = getNumber(numbers);
        }catch(StringIndexOutOfBoundsException e){
            numB = 0 ;
        }
        firstNumber = true;
        if (Main.action == Main.ACTION.ADD){
            answer = numA + numB;
        }
        if (Main.action == Main.ACTION.SUBTRACT){
            answer = numA - numB;
        }
        if (Main.action == Main.ACTION.MULTI){
            answer = numA * numB;
        }
        if (Main.action == Main.ACTION.DIVIDE){
            answer = numA / numB;
        }
        return answer;
    }
    private static long getNumber(String numbers){
        long number;
        while(Character.isDigit(numbers.charAt(end))){
            end+= 1;
            if(end>=numbers.length()){
                break;
            }
        }
        return number = Long.parseLong(numbers.substring(start, end));
    }
}
