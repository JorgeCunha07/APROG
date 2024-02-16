import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        int n, ing, ingRef, pizza, pizzaReff, digP, digI, cont = 0, i;
        boolean gosta = true;
        String pizzass = "";
        Scanner ler = new Scanner(System.in);

        ing = ler.nextInt();
        n = ler.nextInt();

        if(n > 0) {
            for(i = 0; i < n; i++) {
                pizza = ler.nextInt();
                pizzaReff = pizza;
                while(pizzaReff > 0) {
                    ingRef = ing;
                    digP = pizzaReff % 10;
                    pizzaReff /= 10;
                    if(ingRef != 0) {
                        while(ingRef > 0) {
                            digI = ingRef % 10;
                            ingRef /= 10;
                            if(digP == digI)
                                gosta = false;
                        }
                    } else {
                        if(digP == ingRef)
                            gosta = false;
                    }
                }
                if(gosta) {
                    if(!pizzass.contains("" + pizza)) {
                        cont++;
                        if(cont != 1)
                            pizzass = pizzass + "\n";
                        pizzass = pizzass + "Sugestao #" + (cont) + ":" + pizza;
                    }

                }
                gosta = true;
            }
            if(!pizzass.equals(""))
                System.out.println(pizzass);
        }
    }
}