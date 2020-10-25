package lab_5_example_07_03;

class Example3 {
	
        private int a;
        private int b;
       
        
        Example3(){
  
        	System.out.println("Example3()");
        	
        }
        
        Example3(int a){
        	
        	System.out.println("Example3(int a)");
        	this.a = a;
        }
        
        Example3(int a, int b){
        	
        	System.out.println("Example3(int a,int b)");
        	this.a = a;
        	this.b = b;
        }
        
        void result() {
        	
        	System.out.println("a= " +a);
        	System.out.println("b= " +b);
        }
}
