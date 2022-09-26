public class ganjilGenap {
    public static void main(String[] args) {
        //membuat variabel dengan array
        int[] bilangan={1,2,3,4,5,6,7,8,9,10};
        System.out.print("Bilangan Genap :");
        //mengambil data array dengan perulangan for
        for(int i=0; i<bilangan.length; i++){
            //jika data array bilangan habis dibagi 2 = 0
            if(bilangan[i]% 2 ==0){
                System.out.print(bilangan[i] + " ");
            }
        }
        System.out.println("");
        System.out.print("Bilangan ganjil :");
        for(int i=0; i<bilangan.length; i++){
            //jika data array bilangan tidak habis dibagi 2 = 0
            if(bilangan[i] % 2!=0){
                System.out.print(bilangan[i] +" ");
            }
        }
        System.out.println("");
    }
}
