

class Exercicios {


static String IMC(float altura, float peso){

    float alturaAoQuadrado = (float) Math.pow(altura, 2); 
    float userIMC = peso/alturaAoQuadrado;
    if(userIMC < 17.00){ 
        return String.format("Muito Abaixo do Peso %.2f", userIMC);
    }
    if(userIMC >= 17.00 && userIMC < 18.49){
        return String.format("Abaixo do Peso %.2f", userIMC);
    }
    if(userIMC >= 18.50 && userIMC < 24.99){
        return String.format("Peso Normal %.2f", userIMC);
    }
    if(userIMC >= 24.50 && userIMC < 29.99){
        return String.format("Acima do Peso %.2f", userIMC);
    }
    if(userIMC >= 30 && userIMC < 34.99){
        return String.format("Obesidade I  %.2f", userIMC);
    }
    if(userIMC >= 35 && userIMC < 39.99){
        return String.format("Obesidade II Severa  %.2f", userIMC);
    }

    return String.format("Obesidade III Mórbida", userIMC);

}

static boolean validaIdade(int idade){
    return idade > 0 && idade <= 150;
}
static boolean eMaiorDeIdade(int idade){
    return idade >= 18;
} 

static String eParOuImpar(int number){
    if(number/2 == 0){
        return String.format("O numero %d é par", number);
    }    
    return String.format("O numero %d é impar", number);
}

static String compareNumber(double number1, double number2){
    
    if(number1 > number2){
        return String.format("O numero %f é maior que o %f", number1 , number2);
    }
    if(number1 < number2){
        return String.format("O numero %f é maior que o %f", number2 , number1);
    }
    return String.format("O numero %f é igual ao numero %f", number1 , number2);

}

static String integerType(int value){
String message = "É Neutro";
    if(value > 0){
        message = "É positivo";
        return message;
    }
    if(value < 0){
        message = "É negativo";
        return message;
    }
    return message;
}

static String numberFilterFor10( int value){
    String message = "É 10";
    if(value > 10){
        message = "É maior que 10";
        return message;
    }
    if(value < 10){
        message = "É menor que 10";
        return message;
    }
    return message;
}

static float[] converterMetros(float metros){
    final float a[] = new float[6];
    a[0] = metros / 1000;
    a[1] = metros / 100;
    a[2] = metros / 10;
    a[3] = metros * 10;
    a[4] = metros * 100;
    a[5] = metros * 1000;
    return a;
}

public static void main(final String[] args) {
    //EX 01
    System.out.println("Ex01 " + integerType(1));
    //EX 02
    System.out.println("Ex02 " + numberFilterFor10(1));
    //EX 03
    System.out.println("Ex03 " + compareNumber(2.0, 1.0));
    //EX 04
    System.out.println("Ex04 " + eParOuImpar(5));
    //EX 05
    System.out.println("Ex05 " + eMaiorDeIdade(18));
    //EX 06 
    System.out.println("Ex06 " + validaIdade(151));
    //EX 07
    final float[] a = converterMetros(1);
    System.out.printf("Ex07 %.3f %s %.3f %s %.3f %s %.3f %s %.3f %s %.3f %s \n", a[0], "KM", a[1], "HM", a[2], "DAM", a[3], "DM", a[4], "CM", a[5], "MM" );
    //EX 08 
    System.out.println("Ex08 " + IMC((float) 1.65, (float) 52.0));
}

}