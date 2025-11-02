package com.harsha.day2;

public class Accidentclaim extends Claim{
    void approveclaim(){
        double Claimamt=24000;
        if(Claimamt<25000){
            System.out.println("Claim approved");
        }
        else {
            System.out.println("Claim not approved");
        }
    }
}
