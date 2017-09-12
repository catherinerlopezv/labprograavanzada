package org.eclipse.che.examples;

public class Resultado implements Chudnovsky{
    
    public  double calcularPi(int y)
{       
    if(y==0)
        return Pi(y);
        
    else {
    double resultado1= (Pi(y));
    double resultado2= (Pi(y-1));
    double resultadoT= resultado1+resultado2;
    return resultadoT;

    }

}

public double Pi(int y)
{
    double numerador=(factorial(6*y)*((545140134*y)+13591409));
    double denominador =(factorial(3*y)*Math.pow(factorial(y), 3)*Math.pow(-640320, (3*y)));
    double Pi=(numerador/denominador);
    return Pi;
}

 public double factorial(int v)
 {
    if (v==0)
       return 1;
    else
       return v*(factorial(v-1));
}


}
