package epam_java_online.chapter5.FlowerComposotion.Server;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestReg {


    public static void main(String[] args) {

        CheckerInputData checkerInputData = new CheckerInputData();

        System.out.println(checkerInputData.checkNameOrSurname("YURY"));
        System.out.println(checkerInputData.checkNameOrSurname("KLIMCHUK"));
        System.out.println(checkerInputData.checkNameOrSurname("YURY KLIMCHUK"));
    }

}

class CheckerInputData {

    Pattern nameAndSurnamePattern = Pattern.compile("[A-Z]+");
    Pattern emailPattern = Pattern.compile("[A-Z]+");


    CheckerInputData(){

    }

    public boolean checkNameOrSurname(String str) {
        return nameAndSurnamePattern.matcher(str).matches();
    }

    public boolean checkEmail(String email) {
        return emailPattern.matcher(email).matches();
    }

}
