import java.util.Scanner;

class ThisDemo {
    int value;
    
    void setValue(int value){
	this.value=value;
     }
    // TODO: Define setValue(int value)
    // Use 'this.value = value' to resolve naming conflict
    void display(){
	System.out.println("Value: " + value);
	}

    // TODO: Define display() to print "Value: " + value
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the integer input
        int value=sc.nextInt();
	ThisDemo d=new ThisDemo();
	d.setValue(value);
	d.display();
        // TODO: Create ThisDemo object
        // TODO: Call setValue() with the input
        // TODO: Call display()
    }
}
