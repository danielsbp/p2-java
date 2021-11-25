public class Programa {
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();

        retangulo.setSide1(6);
        retangulo.setSide2(2);

        System.out.println("Nome da figura:" + retangulo.getNomeFigura());
        System.out.println("Area da figura:"+retangulo.getArea());
        System.out.println("Perimetro da figura:"+retangulo.getPerimetro());

    }
}