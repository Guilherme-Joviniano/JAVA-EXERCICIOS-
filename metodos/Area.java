class Area{
        //field
        Float pi = (float) Math.PI;

        public Float circulo(float raio){
            return (float) Math.pow((float) raio, 2)*pi;
        }
        public Float retangulo(float base, float altura){
            return base*altura;
        }
        public Float quadrado(float lado){
            return (float) Math.pow(lado,2);
        }
        public Float triangulo(float base, float altura){
            return (base*altura)/2;
        }
    public static void main(String[] args) {
        Area calcArea = new Area();
        System.out.printf(
            "Circulo: %.3f Quadrado: %.3f Retangulo: %.3f Triangulo: %.3f",
            calcArea.circulo( (float) 5.2), 
            calcArea.quadrado( (float) 2.2),
            calcArea.retangulo( (float) 2, (float) 5),
            calcArea.triangulo((float) 2, (float) 2)
        );
    }
}           
