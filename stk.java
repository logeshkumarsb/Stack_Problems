public class stk {
    private int[] arr;
    public stk(){
      arr=new int[10];
    }
    int top1=0;
    int top2=5;
    public void push1(int val){
        if(top1==top2){
            System.out.println("Stack is full");
            return;
        } 
        if(top1<top2){
            arr[top1++]=val;
         }
    }
    public void push2(int val){
        if(top2==arr.length){
            System.out.println("Stack is full");
            return;
        } 
        if(top1<top2&&top2<arr.length){
            arr[top2]=val;
            top2++;
         }
    }
   public int pop1(){
       if(top1<0){
           return -1;
       }
       int temp=arr[top1];
       top1--;
       return temp; 
   }
   public int pop2(){
    if(top2<(arr.length/2)){
        return -1;
    }
    int temp=arr[top2];
    top2--;
    return temp; 
    }
    public void display1(){
        for(int i=0;i<top1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public void display2(){
        for(int i=arr.length/2;i<top2;i++){
            System.out.print(arr[i]+" ");
        }
              System.out.println();
    }
    public static void main(String[] args) {
            stk s1=new stk();
            stk s2=new stk();
              s1.push1(10);
              s1.push1(20);
              s1.display1();
              s1.pop1();
              s1.display1();
              s2.push2(30);
              s2.push2(30);
              s2.push2(30);
              s2.display2();
              s2.pop2();
              s2.display2();
    }
}
