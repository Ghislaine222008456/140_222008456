 class Animals {

    public void AN(){

        System.out.println("ALL LIVING CREATURES ARE ANIMALS");
    }
}
 interface Lion {
    void show ();
}
class Lioness extends Animals {
    public void  LI(){
        System.out.println("THE FEMALE LION WHICH GIVES BIRTH TO CUBS.");
    }
}
class Cub extends Lioness implements Lion{
    public void show (){}
    }

class Family_lions extends Cub {
 public void FLI(){
    System.out.println("AND THEN THEY FORM A FAMILY, A NUCLEAR ONE.");
 }
}
class Output{
    public static void main(String[] args) {
        
    
    Family_lions family_lions= new Family_lions();

    System.out.println();// jump line
    family_lions.AN();//ALL LIVING CREATURES ARE ANIMALS
    family_lions.LI();//THE FEMALE LION WHICH GIVES BIRTH TO CUBS.
    family_lions.FLI();//AND THEN THEY FORM A FAMILY, A NUCLEAR ONE.
    System.out.println();// jump line
    


}
}