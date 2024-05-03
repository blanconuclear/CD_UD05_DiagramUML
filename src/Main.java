public class Main {
    public static void main(String[] args) {

        // TODO: Crear los siguientes pasos para comprobar el funcionamiento del
        // programa
        // Crear una veterinaria
        Veterinaria veterinaria = new Veterinaria();
        // Crear dos clientes
        Cliente cliente1 = new Cliente("Hugo", "calle coruña", "68930453");
        Cliente cliente2 = new Cliente("Jose", "calle altamira", "6893546343");
        // Agregar clientes a la veterinaria

        veterinaria.agregarCliente(cliente1);
        veterinaria.agregarCliente(cliente2);

        // Crear dos animales
        Animal animal1 = new Animal("Luis", "gato", "montes", cliente1);
        Animal animal2 = new Animal("Arce", "perro", "maltes", cliente2);

        // Agregar animales a la veterinaria
        veterinaria.agregarAnimal(animal1);
        veterinaria.agregarAnimal(animal2);

        // Crear un veterinario

        Veterinario veterinario = new Veterinario();

        // Crear una consulta
        Consulta consulta = new Consulta("23/12/2000", "infección", "favorable", null, veterinario);
        // Asignar la consulta a un animal
        animal1.agregarConsulta(consulta);
        // Imprimir todas las consultas de los animales de la clínica
        veterinaria.imprimirConsultas();
    }

}