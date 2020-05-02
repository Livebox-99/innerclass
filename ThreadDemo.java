
class ThreadDemo {
	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				for(int i=0;i<=50;i++) System.out.print("t"+i+" ");
			}
		};
		t.start();
		for(int i=0;i<=5;i++) System.out.print("m"+i+" ");
	}
}