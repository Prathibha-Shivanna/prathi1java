package ExceptionHandling;

public class Handling {

     float bal;
	  public void withdraw(int amnt) throws  InsufficientBalanceException {
		
		  if(bal>0) {
			  bal=bal-amnt;
			  System.out.println("Balance:"+bal);
		  }
		  else
		  
			  throw new InsufficientBalanceException() ;
	  
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Handling hand = new Handling();
        try {
        hand.withdraw(500);
         }
        catch(InsufficientBalanceException e)
        {
        	System.out.println(e);
        }
        }

}


class InsufficientBalanceException extends Exception{
	@Override
	public String toString() {
		return "InsufficientBalanceException [insuffiecient balance to withdraw money]";
	}
}