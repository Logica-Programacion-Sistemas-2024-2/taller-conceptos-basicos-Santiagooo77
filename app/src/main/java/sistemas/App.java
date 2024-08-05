import java.util.Scanner;
import java.lang.Math;
package sistemas;
public class App;

    
    // Diseñe un algoritmo para saludar al usuario: Hola usuario. El nombre del usuario es ingresado por teclado
    public class SaludarUsuario {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario ingresar su nombre
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
    
            // Saludar al usuario 
            String saludo = "Hola " + nombre + ".";
    
            System.out.println(saludo);
        }
    }

    // Diseñe un algoritmo que lea por teclado una velocidad en Km/seg y la convierta a metros/seg y a metros/hora
    // retorne el valor en formato string (metrosPorSeg + "|" + metrosPorHora)
    public class ConversorVelocidad {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario ingresar la velocidad en Km/seg
            System.out.print("Ingrese la velocidad en Km/seg: ");
            double kmPorSeg = scanner.nextDouble();
    
            // Convertir la velocidad a metros/seg
            double metrosPorSeg = kmPorSeg * 1000 / 3600; // 1 Km = 1000 m, 1 seg = 1/3600 hora
    
            // Convertir la velocidad a metros/hora
            double metrosPorHora = kmPorSeg * 3600 * 1000; // 1 Km = 1000 m, 1 hora = 3600 seg
    
            // Devolver el resultado en formato string
            String resultado = String.format("%.2f m/seg | %.2f m/h", metrosPorSeg, metrosPorHora);
    
            System.out.println(resultado);
        }
    }

    // Solicitar al usuario ingresar una cantidad expresada en cc (centímetros cúbicos) y devolver su cantidad en litros
        public class ConversorVolumen {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario ingresar la cantidad en centímetros cúbicos (cc)
            System.out.print("Ingrese la cantidad en centímetros cúbicos (cc): ");
            double centimetrosCubicos = scanner.nextDouble();
    
            // Convertir la cantidad a litros
            double litros = centimetrosCubicos / 1000.0; // 1 litro = 1000 cc
    
            // Mostrar el resultado
            System.out.printf("La cantidad en litros es: %.2f L%n", litros);
        }
    }

    // Solicitar al usuario ingresar una cantidad en dólares y convertirla a pesos según la TRM del día
        public class ConvertirDolaresAPesos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Pedir la cantidad en dólares al usuario
            System.out.print("Ingrese la cantidad en dólares: ");
            double cantidadDolares = scanner.nextDouble();
    
            // Convertir la cantidad en dólares a pesos según la TRM del día
            double trm = 4110.37; // TRM del día (1 USD = 4110.37 COP)
            double cantidadPesos = cantidadDolares * trm;
    
            System.out.println("La cantidad en pesos es: " + cantidadPesos);
        }
    }
        

    // Solicitar al usuario ingresar la temperatura en grados centígrados y convertirla en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5)
    public class ConversorTemperatura {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario ingresar la temperatura en grados centígrados
            System.out.print("Ingrese la temperatura en grados centígrados: ");
            double centigrados = scanner.nextDouble();
    
            // Convertir la temperatura a grados Fahrenheit
            double fahrenheit = 32 + (9 * centigrados / 5);
    
            System.out.printf("La temperatura en grados Fahrenheit es: %.2f°F%n", fahrenheit);
        }
    }

    // Solicitar al usuario ingresar Nro de Días nro de horas nro de minutos y nro segundos y convertir todo a segundos.
    public class ConversorTiempo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar al usuario ingresar los valores
            System.out.print("Ingrese el número de días: ");
            int dias = scanner.nextInt();
    
            System.out.print("Ingrese el número de horas: ");
            int horas = scanner.nextInt();
    
            System.out.print("Ingrese el número de minutos: ");
            int minutos = scanner.nextInt();
    
            System.out.print("Ingrese el número de segundos: ");
            int segundos = scanner.nextInt();
    
            // Convertir los valores a segundos
            int totalSegundos = dias * 24 * 60 * 60; // Convertir días a segundos
            totalSegundos += horas * 60 * 60; // Convertir horas a segundos
            totalSegundos += minutos * 60; // Convertir minutos a segundos
            totalSegundos += segundos; // Agregar segundos
    
            // Mostrar el resultado
            System.out.println("El total de segundos es: " + totalSegundos);
        }
    }

    // Un usuario tiene un sistema de báscula para pesar camiones, dado el peso de un camión debe sacar el peso neto de la carga en kilos y toneladas
    // retorne el valor en formato string (pesoEnKg + "|" + pesoEnToneladas)
    public class CalculadoraPeso {
    public static String calcularPesoNeto(double pesoBruto, double pesoCamion) {
        Scanner scanner = new Scanner(System.in);  
        // Calcular peso neto en kilos
        double pesoNetoEnKg = pesoBruto - pesoCamion;

        // Calcular peso neto en toneladas
        double pesoNetoEnToneladas = pesoNetoEnKg / 1000;

        // Formatear resultado
        return String.format("%.2f|%.2f", pesoNetoEnKg, pesoNetoEnToneladas);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double pesoBruto = 25000; // Peso bruto del camión (kg)
        double pesoCamion = 5000; // Peso del camión vacío (kg)

        String resultado = calcularPesoNeto(pesoBruto, pesoCamion);
        System.out.println(resultado);
    }
}

    // Diseñe un algoritmo que calcule el tiempo necesario para alcanzar un destino dado por el usuario quien además ingresará la velocidad promedio en kilómetros/hora y la distancia en kilómetros
        public static int calcularTiempoViaje(double distancia, double velocidadKilometros, double velocidadHora) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ingresar velocidad promedio y distancia
            System.out.print("Ingrese la velocidad promedio (km/h): ");
            double velocidad = scanner.nextDouble();
    
            System.out.print("Ingrese la distancia al destino (km): ");
            double distancia = scanner.nextDouble();
    
            // Calcular tiempo necesario
            double tiempo = distancia / velocidad;
    
            // Mostrar resultado
            System.out.printf("El tiempo necesario para alcanzar el destino es: %.2f horas%n", tiempo);
        }
    }

    // Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. El piloto desea un algoritmo que ingresando 4 rutas y el kilometraje de cada ruta obtenga la cantidad de combustible que debe tanquear en el avión.
    public static int calcularCombustible(double ruta1, double ruta2, double ruta3, double ruta4) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ingresar rutas y kilometraje de cada ruta
            double[] rutas = new double[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese el kilometraje de la ruta " + (i + 1) + ": ");
                rutas[i] = scanner.nextDouble();
            }
    
            // Calcular total de kilometraje
            double totalKm = 0;
            for (double ruta : rutas) {
                totalKm += ruta;
            }
    
            // Calcular combustible necesario para recorrer el total de kilometraje
            double combustibleNecesario = totalKm / 60.8;
    
            // Agregar combustible para despegue y aterrizaje
            combustibleNecesario += 1.2 + 0.4;
    
            // Convertir a toneladas
            combustibleNecesario /= 0.2;
    
            // Mostrar resultado
            System.out.printf("El avión debe tanquear %.2f toneladas de combustible.%n", combustibleNecesario);
        }
    }

    // Diseñar un algoritmo que calcule el peso neto en la luna de un peso terrestre ingresado por teclado. La gravedad de la Luna es de alrededor del 17% más que la de la tierra
    public static int calcularPesoLunar(double pesoTierra) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ingresar peso terrestre
            System.out.print("Ingrese su peso terrestre (en kg): ");
            double pesoTerrestre = scanner.nextDouble();
    
            // Calcular peso neto en la luna (17% menos que en la tierra)
            double pesoLuna = pesoTerrestre * 0.83; // 1 - 0.17 = 0.83
    
            // Mostrar resultado
            System.out.printf("Su peso neto en la luna es: %.2f kg%n", pesoLuna);
        }
    }

    // Diseñar un algoritmo que calcule el saldo que debe haber en una taquilla de un banco. El cajero deberá ingresar la base el total de recaudos y el total de retiros
    public static int calcularSaldoTaquilla(double base, double ingresos, double retiros) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ingresar base inicial
            System.out.print("Ingrese la base inicial: ");
            double baseInicial = scanner.nextDouble();
    
            // Ingresar total de recaudos
            System.out.print("Ingrese el total de recaudos: ");
            double totalRecaudos = scanner.nextDouble();
    
            // Ingresar total de retiros
            System.out.print("Ingrese el total de retiros: ");
            double totalRetiros = scanner.nextDouble();
    
            // Calcular saldo final
            double saldoFinal = baseInicial + totalRecaudos - totalRetiros;
    
            // Mostrar resultado
            System.out.printf("El saldo que debe haber en la taquilla es: %.2f%n", saldoFinal);
        }
    }

    // Diseñe un algoritmo para calcular la propina en un restaurante(10%) el impuesto al consumo (8%) y el valor final que deberá pagar ingresando el valor de la comida.
    // retorne el valor en formato string (propina + "|" + impuesto + "|" + total)
    public static String calcularCuentaRestaurante(double costoComida) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ingresar valor de la comida
            System.out.print("Ingrese el valor de la comida: ");
            double valorComida = scanner.nextDouble();
    
            // Calcular propina (10%)
            double propina = valorComida * 0.10;
    
            // Calcular impuesto al consumo (8%)
            double impuesto = valorComida * 0.08;
    
            // Calcular valor final
            double valorFinal = valorComida + propina + impuesto;
    
            // Mostrar resultados en formato string
            String resultado = String.format("%.2f|%.2f|%.2f", propina, impuesto, valorFinal);
            System.out.println(resultado);
        }
    }
    
       
    // Diseñar un algoritmo que obtenga los puntos finales de un equipo de fútbol (puntuación según lineamientos de Fifa) a partir de los datos ingresados por teclado: Número de partidos ganados número de partidos perdidos número de partidos empatados.
    public static int calcularPuntosFutbol(int ganados, int perdidos, int empatados) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Ingresar número de partidos ganados, perdidos y empatados
            System.out.print("Ingrese número de partidos ganados: ");
            int partidosGanados = scanner.nextInt();
            System.out.print("Ingrese número de partidos perdidos: ");
            int partidosPerdidos = scanner.nextInt();
            System.out.print("Ingrese número de partidos empatados: ");
            int partidosEmpatados = scanner.nextInt();
    
            // Calcular puntos finales según lineamientos de la FIFA
            int puntosFinales = partidosGanados * 3 + partidosEmpatados * 1;
    
            System.out.printf("Los puntos finales del equipo son: %d%n", puntosFinales);
        }
    }

    // Elaborar un algoritmo que dadas todas las 5 notas y los 5 porcentajes para una materia calcule la nota final.
    public static int calcularNotaFinal(double nota1, double nota2, double nota3, double nota4, double nota5,)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar porcentajes de cada evaluación
        System.out.print("Ingrese porcentaje de la primera evaluación: ");
        double porcentaje1 = scanner.nextDouble();
        System.out.print("Ingrese porcentaje de la segunda evaluación: ");
        double porcentaje2 = scanner.nextDouble();
        System.out.print("Ingrese porcentaje de la tercera evaluación: ");
        double porcentaje3 = scanner.nextDouble();
        System.out.print("Ingrese porcentaje de la cuarta evaluación: ");
        double porcentaje4 = scanner.nextDouble();
        System.out.print("Ingrese porcentaje de la quinta evaluación: ");
        double porcentaje5 = scanner.nextDouble();

        // Ingresar notas de las 4 primeras evaluaciones
        System.out.print("Ingrese nota de la primera evaluación: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Ingrese nota de la segunda evaluación: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Ingrese nota de la tercera evaluación: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Ingrese nota de la cuarta evaluación: ");
        double nota4 = scanner.nextDouble();

        // Calcular nota total actual
        double notaTotalActual = (nota1 * porcentaje1 / 100) + (nota2 * porcentaje2 / 100) + (nota3 * porcentaje3 / 100) + (nota4 * porcentaje4 / 100);

        // Calcular nota necesaria para aprobar
        double notaNecesaria = (3 - notaTotalActual) / (porcentaje5 / 100);

        System.out.printf("La nota necesaria para aprobar es: %.2f%n", notaNecesaria);
    }

    // Elaborar un algoritmo que dados los 5 porcentajes de una materia y las 4 primeras notas calcule cuánto tiene que sacar para ganar si el puntaje mínimo es 3.
    public class NotaMinima {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Pedir los porcentajes de cada nota
            System.out.println("Ingrese los porcentajes de cada nota (5 en total):");
            double[] porcentajes = new double[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Porcentaje nota " + (i + 1) + ": ");
                porcentajes[i] = scanner.nextDouble();
            }
    
            // Pedir las primeras 4 notas
            System.out.println("Ingrese las primeras 4 notas:");
            double[] notas = new double[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }
    
            // Calcular la nota mínima necesaria
            double notaMinima = calcularNotaMinima(porcentajes, notas);
    
            System.out.println("La nota mínima necesaria para ganar es: " + notaMinima);
        }
    
        /**
         * Calcula la nota mínima necesaria para ganar considerando los porcentajes y las primeras 4 notas.
         *
         * @param porcentajes Los porcentajes de cada nota (5 en total).
         * @param notas       Las primeras 4 notas.
         * @return La nota mínima necesaria para ganar.
         */
        public static double calcularNotaMinima(double[] porcentajes, double[] notas) {
            double sumaPorcentajes = 0;
            double sumaNotas = 0;
    
            // Calcular la suma de los porcentajes y las notas
            for (int i = 0; i < 4; i++) {
                sumaPorcentajes += porcentajes[i];
                sumaNotas += notas[i] * porcentajes[i] / 100;
            }
    
            // Calcular la nota mínima necesaria
            double notaMinima = (3 - sumaNotas) / (porcentajes[4] / 100);
    
            return notaMinima;
        }
    }

    // Se requiere un algoritmo para calcular el salario a pagar a un trabajador con los siguientes datos ingresados por teclado: cantidad de horas normales laboradas cantidad de horas extras diurnas laboradas cantidad de horas extras nocturnas laboradas valor de la hora normal. El valor de las horas extras diurnas tienen un recargo adicional del 15% sobre la hora normal. El valor de las horas extras nocturnas tienen un recargo adicional del 35% sobre la hora normal.
    public class SalarioTrabajador {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Pedir los datos al usuario
            System.out.print("Ingrese la cantidad de horas normales laboradas: ");
            double horasNormales = scanner.nextDouble();
    
            System.out.print("Ingrese la cantidad de horas extras diurnas laboradas: ");
            double horasExtrasDiurnas = scanner.nextDouble();
    
            System.out.print("Ingrese la cantidad de horas extras nocturnas laboradas: ");
            double horasExtrasNocturnas = scanner.nextDouble();
    
            System.out.print("Ingrese el valor de la hora normal: ");
            double valorHoraNormal = scanner.nextDouble();
    
            // Calcular el salario a pagar
            double salario = calcularSalario(horasNormales, horasExtrasDiurnas, horasExtrasNocturnas, valorHoraNormal);
    
            System.out.println("El salario a pagar es: " + salario);
        }
    
        /**
         * Calcula el salario a pagar a un trabajador considerando las horas normales, horas extras diurnas y nocturnas, y el valor de la hora normal.
         *
         * @param horasNormales      La cantidad de horas normales laboradas.
         * @param horasExtrasDiurnas La cantidad de horas extras diurnas laboradas.
         * @param horasExtrasNocturnas La cantidad de horas extras nocturnas laboradas.
         * @param valorHoraNormal    El valor de la hora normal.
         * @return El salario a pagar.
         */
        public static double calcularSalario(double horasNormales, double horasExtrasDiurnas, double horasExtrasNocturnas, double valorHoraNormal) {
            // Calcular el valor de las horas extras diurnas y nocturnas
            double valorHoraExtraDiurna = valorHoraNormal * 1.15;
            double valorHoraExtraNocturna = valorHoraNormal * 1.35;
    
            // Calcular el salario a pagar
            double salario = (horasNormales * valorHoraNormal) + (horasExtrasDiurnas * valorHoraExtraDiurna) + (horasExtrasNocturnas * valorHoraExtraNocturna);
    
            return salario;
        }
    }

    // Diseñe un algoritmo que calcule el área de un triángulo rectángulo.
    public static int calcularAreaTriangulo(double base, double altura) {
        public static double calcularAreaTriangulo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();
    
            double area = (base * altura) / 2;
    
            return area;
        }
    
        public static void main(String[] args) {
            double area = calcularAreaTriangulo();
            System.out.printf("El área del triángulo es: %.2f unidades cuadradas%n", area);
        }
    }

    // Diseñe un algoritmo que calcule el perímetro de un cuadrado.
        public class PerimetroCuadrado {
            public static double calcularPerimetroCuadrado() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble();
        
                double perimetro = 4 * lado;
        
                return perimetro;
            }
        
            public static void main(String[] args) {
                double perimetro = calcularPerimetroCuadrado();
                System.out.printf("El perímetro del cuadrado es: %.2f unidades%n", perimetro);
            }
    }

    // Diseñe un algoritmo que calcule el volumen de un cilindro.
        public class VolumenCilindro {
            public static double calcularVolumenCilindro() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el radio del cilindro: ");
                double radio = scanner.nextDouble();
                System.out.print("Ingrese la altura del cilindro: ");
                double altura = scanner.nextDouble();
        
                double volumen = Math.PI * Math.pow(radio, 2) * altura;
        
                return volumen;
            }
        
            public static void main(String[] args) {
                double volumen = calcularVolumenCilindro();
                System.out.printf("El volumen del cilindro es: %.2f unidades cúbicas%n", volumen);
            }
    }

    // Diseñe un algoritmo que calcule el área del círculo. El radio se pide por teclado.
    public static int calcularAreaCirculo(double radio) {
            public static double calcularAreaCirculo() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el radio del círculo: ");
                double radio = scanner.nextDouble();
        
                double area = Math.PI * Math.pow(radio, 2);
        
                return area;
            }
        
            public static void main(String[] args) {
                double area = calcularAreaCirculo();
                System.out.printf("El área del círculo es: %.2f unidades cuadradas%n", area);
            }
        
    }

