public class Principal {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        circulo.setRaio(13);
        System.out.println("\n" + "A área do circulo é: "+ circulo.calcularArea());

        Quadrado quadrado = new Quadrado(12, 51);
        System.out.println("A área do quadrado é: " + quadrado.calcularArea());

        Triangulo triangulo = new Triangulo(5, 5);
        System.out.println("A área do triângulo é: " + triangulo.calcularArea() + "\n");

    }
}
