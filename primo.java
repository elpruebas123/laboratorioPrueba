public class Primo{
    public static void main(String[] args){
        int n=7;
        boolean esPrimo = true;

        if (n<=1){
            esPrimo = false;
        }else{
            for(int i =2; i<n; i++){
                if(n%i==0){
                    esPrimo = false;
                    break;
                }
            }
        }
        if(esPrimo){
            System.out.println("es primo")
        }else{
            System.out.println("no es primo")
        }
    }
}