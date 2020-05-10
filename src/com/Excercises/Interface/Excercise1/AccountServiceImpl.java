package com.Excercises.Interface.Excercise1;

class AccountServiceImpl implements AccountService{
    Account[] accounts;
    long x=0;
    public AccountServiceImpl(Account[] accounts){
        this.accounts = accounts;
    }
    public Account findAccountByOwnerId(long id){

        for(Account account:accounts){
            User user = account.getOwner();
            long id2 = user.getId();
            if(id2==id){
                return account;
            }
        }
        return null;
    }

    public long countAccountsWithBalanceGreaterThan(long value){
        for(Account account:accounts){
            long balance = account.getBalance();
            if(balance>value){
                x++;
            }

        }
        return x;
    }
}
