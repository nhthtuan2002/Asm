package com.assignment.assignmentwcd.entity.myenum;

public enum AccountStatus {
    USER(0),ADMIN(1),SUPER_ADMIN(2);
    private final int value;
    AccountStatus(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static AccountStatus getAccountStatus(int value){
        for(AccountStatus role : AccountStatus.values()){
            if(role.getValue() == value){
                return role;
            }
        }
        return USER;
    }
}
