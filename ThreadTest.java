class ThreadTest {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<=50;i++) {
					System.out.print("t"+i+" ");
				}
			}
		}).start();
		for(int i=0;i<=50;i++) System.out.print("m"+i+" ");
	}
}