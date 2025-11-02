package com.harsha.day2;

public class Theftclaim extends Claim{
    void approveclaim(){
        boolean theft =true;
        boolean is_warranty=false;

        if(theft == true && is_warranty==true){
            System.out.println("Claim is approved");
        }
        else {
            System.out.println("Claim not approved");
        }
    }
}
