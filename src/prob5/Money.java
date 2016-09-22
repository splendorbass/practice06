package prob5;

public class Money {
	private int amount;
	
	public Money( int amount ){
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Money add( Money money ) {
		Money m1 = new Money(this.amount + money.amount);
		return m1;
    }
    public Money minus( Money money ) {
    	Money m1 = new Money(this.amount - money.amount);
    	return m1;
    }
    public Money multiply( Money money ) {
    	Money m1 = new Money(this.amount * money.amount);
    	return m1;
      }
    public Money devide( Money money ) {
    	Money m1 = new Money(this.amount / money.amount);
    	return m1;
    }
    
    @Override
    public boolean equals( Object obj ){
    	if( this == obj ){
    		return true;
    	}
    	if( this.getClass() != obj.getClass() ){
    		return false;
    	}
    	Money money = (Money)obj;
    	if( this.amount != money.getAmount()){
    		return false;
    	}
    	return true;
    }
    
}
