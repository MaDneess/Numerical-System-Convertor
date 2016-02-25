package sample;

public class ButtonAction {
    public static void button_0(){
        if(!(Main.answer.charAt(0) == '0' && Main.answer.length() == 1)){
            Main.answer += "0";
        }
    }
    public static void button_1(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "1";
        }else{
            Main.answer += "1";
        }
    }
    public static void button_2(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "2";
        }else{
            Main.answer += "2";
        }
    }
    public static void button_3(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "3";
        }else{
            Main.answer += "3";
        }
    }
    public static void button_4(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "4";
        }else{
            Main.answer += "4";
        }
    }
    public static void button_5(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "5";
        }else{
            Main.answer += "5";
        }
    }
    public static void button_6(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "6";
        }else{
            Main.answer += "6";
        }
    }
    public static void button_7(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "7";
        }else{
            Main.answer += "7";
        }
    }
    public static void button_8(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "8";
        }else{
            Main.answer += "8";
        }
    }
    public static void button_9(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "9";
        }else{
            Main.answer += "9";
        }
    }
    public static void button_a(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "A";
        }else{
            Main.answer += "A";
        }
    }
    public static void button_b(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "B";
        }else{
            Main.answer += "B";
        }
    }
    public static void button_c(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "C";
        }else{
            Main.answer += "C";
        }
    }
    public static void button_d(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "D";
        }else{
            Main.answer += "D";
        }
    }
    public static void button_e(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "E";
        }else{
            Main.answer += "E";
        }
    }
    public static void button_f(){
        if(Main.answer.charAt(0) == '0' && Main.answer.length() == 1) {
            Main.answer = "F";
        }else{
            Main.answer += "F";
        }
    }
    public static void buttonEquals(){
        if(Main.actionAdded) {
            if (Main.action == Main.ACTION.ADD) {
                Main.numbers += "+";
            }
            if (Main.action == Main.ACTION.SUBTRACT) {
                Main.numbers += "-";
            }
            if (Main.action == Main.ACTION.MULTI) {
                Main.numbers += "*";
            }
            if (Main.action == Main.ACTION.DIVIDE) {
                Main.numbers += "/";
            }
            if(Main.state == Main.STATE.DECIMAL){
                Main.numbers += Main.answer;
            }else{
                Main.numbers += Action.decAns;
            }
            Main.answer = ((Long.toString(Action.calculation(Main.numbers))));
            Main.numbers = "";
            Action.start = 0;
            Action.end = 0;
            if(Main.state == Main.STATE.HEX){
                Action.decAns = Main.answer;
                Action.toHex(Long.parseLong(Main.answer));
                Main.answer = Action.hexAns;
            }
            if(Main.state == Main.STATE.OCTAL){
                Action.decAns = Main.answer;
                Action.toOctal(Long.parseLong(Main.answer));
                Main.answer = Action.octAns;
            }
            if(Main.state == Main.STATE.BINARY){
                Action.decAns = Main.answer;
                Action.toBinary(Long.parseLong(Main.answer));
                Main.answer = Action.binAns;
            }
        }
    }
    public static void clear(){
        Main.answer = "0";
        Action.binAns = "0";
        Action.octAns = "0";
        Action.hexAns = "0";
        Action.start = 0;
        Action.end = 0;
        Main.actionAdded = false;
        Main.action = Main.ACTION.NO_ACTION;
    }
    public static void del(){
        if(Main.answer.length() > 0) {
            Main.answer = Main.answer.substring(0, Main.answer.length() - 1);
        }
        if(Main.answer.length() <= 0){
            clear();
        }
    }
    public static void clearInput(){
        Action.decAns = Action.binAns = Action.hexAns = Action.octAns = Main.answer = "0";
    }
    public static void negate(){

    }
    public static void plus(){
        Main.actionAdded = true;
        Main.action = Main.ACTION.ADD;
        if(Main.state == Main.STATE.DECIMAL){
            Main.numbers = Main.answer;
        }else{
            Main.numbers = Action.decAns;
        }
        Main.answer = "0";
    }
    public static void minus(){
        Main.actionAdded = true;
        Main.action = Main.ACTION.SUBTRACT;
        if(Main.state == Main.STATE.DECIMAL){
            Main.numbers = Main.answer;
        }else{
            Main.numbers = Action.decAns;
        }
        Main.answer = "0";
    }
    public static void multi(){
        Main.actionAdded = true;
        Main.action = Main.ACTION.MULTI;
        if(Main.state == Main.STATE.DECIMAL){
            Main.numbers = Main.answer;
        }else{
            Main.numbers = Action.decAns;
        }
        Main.answer = "0";
    }
    public static void div(){
        Main.actionAdded = true;
        Main.action = Main.ACTION.DIVIDE;
        if(Main.state == Main.STATE.DECIMAL){
            Main.numbers = Main.answer;
        }else{
            Main.numbers = Action.decAns;
        }
        Main.answer = "0";
    }
}
