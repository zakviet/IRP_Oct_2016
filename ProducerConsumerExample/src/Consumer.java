
public class Consumer implements Runnable {

	WareHouse wareHouse;
	Consumer(WareHouse wareHouse)
	{
		this.wareHouse=wareHouse;
	}
	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			wareHouse.removeItem();
		}

	}

}
