package projectQ;


		class MyOwnThread1 extends Thread{
			public void run(){
				try{
				for(int count=1; count<=3;count++){
					System.out.println("Hello All!!!");
					Thread.sleep(3000);
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		}
		public class SleepMethodExample {

			public static void main(String[] args) {
				
					MyOwnThread1 obj=new MyOwnThread1();
					obj.start();
			}

		
	}


