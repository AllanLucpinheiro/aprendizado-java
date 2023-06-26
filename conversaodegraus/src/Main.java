import java.util.Scanner;

public class Main {
    public static void menu(){
        Scanner leitura = new Scanner(System.in);
        int opcao =0;
        double temp;
       while (opcao!=7){
           System.out.println("\n1-Conversão: Celsius(ºC) para Fahrenheit(ºF)");
           System.out.println("2-Conversão: Celsius(ºC) para Kelvin(ºK)");
           System.out.println("3-Conversão: Fahrenheit(ºF) para Celsius(ºC)");
           System.out.println("4-Conversão: Fahrenheit(ºF) para Kelvin(ºK)");
           System.out.println("5-Conversão: Kelvin(ºK) para Celsius(ºC)");
           System.out.println("6-Conversão: Kelvin (ºK) para Fahrenheit(ºF)");
           System.out.println("7-Sair");
           opcao = leitura.nextInt();
           switch (opcao){
               case 1:
                   System.out.print("Digite a temperatura em Graus Celsius:");
                    temp = leitura.nextDouble();
                    celsiusFahrenheit(temp);
                  break;
               case 2:
                   System.out.println("Digite a temperatura em Graus Celsius:");
                   temp = leitura.nextDouble();
                    celsiusKelvin(temp);
                   break;
               case 3:
                   System.out.print("Digite a temperatura em Graus Fahrenheit:");
                   temp = leitura.nextDouble();
                   fahrenheitCelsius(temp);
                   break;
               case 4:
                   System.out.print("Digite a temperatura em Graus Fahrenheit:");
                   temp = leitura.nextDouble();
                   fahrheintKelvin(temp);
                   break;
               case 5:
                   System.out.print("Digite a temperatura em Kelvin:");
                   temp = leitura.nextDouble();
                   kelvinCelsius(temp);
                   break;
               case 6:
                   System.out.print("Digite a temperatura em Kelvin:");
                   temp = leitura.nextDouble();
                   kelvinFahrheint(temp);
                   break;
               case 7:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção invalida!");
                   break;
           }
       }
    }
    public static void celsiusFahrenheit(double c){
        double formula;
        formula = (c*9/5)+32;
        System.out.println(c+"ºC"+" Graus Celsius"+" = %.3f"+formula+"ºF"+" Graus Fahrenheit\n");
    }

    public static void celsiusKelvin(double ck){
        double formula;
        double kelvin = 273.15;
        formula = ck + kelvin;
        System.out.println(ck+"ºC"+" Graus Celsius"+" = "+formula+"ºK"+" Kelvin\n");
    }

    public static void fahrenheitCelsius(double f) {
        double formula;
        formula = (f-32)*5/9;
        System.out.println(f+"ºF"+" Graus Fahrenheit" + " = "+ formula +"ºC"+" Graus Celsius\n");
    }
    public static  void fahrheintKelvin(double fk){
        double formula;
        double kelvin = 237.15;
        formula = (fk -32)*5/9+kelvin;
        System.out.println(fk+"ºF"+" Graus Fahrenheit" + " = "+ formula +"ºK"+" Kelvin\n");

    }

    public static void kelvinCelsius(double kc){
        double formula;
        double kelvin = 273.15;
        formula = kc - kelvin;
        System.out.println(kc+"ºK"+" Kelvin"+" = "+formula+"ºC"+" Graus Celsius\n");

    }
    public static void kelvinFahrheint(double kf){
        double formula;
        double kelvin=273.15;
        formula = (kf - kelvin) * 9/5 + 32;
        System.out.println(kf+"ºK"+" Kelvin"+" = "+formula+"ºC"+" Graus Fahrheint\n");
    }

    public static void main(String[] args) {

        System.out.println("**********************************");
        System.out.println("Bem-vindo ao Conversor de Graus");
        System.out.println("**********************************");
        menu();
    }
}