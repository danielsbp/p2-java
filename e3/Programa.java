public class Programa {
    
    public static void main(String[] args) {
        
        Carro voyage = new Carro();

        voyage.setPlaca("HVG6649");
        voyage.setMarca("VOLKSWAGEM");
        voyage.setAno(2016);
        voyage.setModelo("VOYAGE");
        
        System.out.println();

        System.out.println("Marca: "+voyage.getMarca());
        System.out.println("Placa: "+voyage.getPlaca());
        System.out.println("Ano: "+voyage.getAno());
        System.out.println("Modelo: "+voyage.getModelo());
    }
    
}