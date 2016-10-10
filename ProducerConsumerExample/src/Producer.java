
public class Producer implements Runnable {

	WareHouse wareHouse;
	
	Producer(WareHouse wareHouse)
	{
		this.wareHouse=wareHouse;
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			int num = (int)(Math.random()*100);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			wareHouse.addItem(num);
			
		}
		

	}

}
