interface AreaFiguras {
    //field
    Float pi = (float) Math.PI;

    default public Float circulo(float raio){
        return (float) Math.pow((float) raio, 2)*pi;
    }
    default public Float retangulo(float base, float altura){
        return base*altura;
    }
    default public Float quadrado(float lado){
        return (float) Math.pow(lado,2);
    }
    default public Float triangulo(float base, float altura){
        return (base*altura)/2;
    }
}