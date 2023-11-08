// second parent class of student
public interface headmaster {

    void show();
}

class student extends teacher implements headmaster{ // student inherts teacher and headmaster properties

    public void mi(){

        System.out.println("The school is for all");
        System.out.println();
        System.out.println("Students.");
    }

}

class teacher{// parent class of student

    public void show(){
         }

}
class orders extends boards  { // orders inherts boards properties
    public void na(){

        System.out.println("Teacher comes to teach them.");
    }
}
class boards{// class name 

    public void ni(){
        System.out.println("And then they call it a day.");
    }
}

class kl{// object 
   public static void main(String[] args) {
    
   
    
     student first = new student();
     orders middle= new orders();
     boards last= new boards();
    
    first.mi();
    
    middle.na();
    
    last.ni();
    

    
    

}
}