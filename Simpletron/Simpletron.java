import java.util.Scanner;

public class Simpletron {
    private static final int SIZEMEM = 100;

    private static final int READ = 10;
    private static final int WRITE = 11;
    private static final int LOAD = 20;
    private static final int STORE = 21;
    private static final int ADD = 30;
    private static final int SUBTRACT = 31;
    private static final int DIVIDE = 32;
    private static final int MULTIPLY = 33;
    private static final int MODULE = 34;
    private static final int POWER = 35;
    private static final int BRANCH = 40;
    private static final int BRANCHNEG = 41;
    private static final int BRANCHZERO = 42;
    private static final int HALT = 43;

    private static int[] memory = new int[SIZEMEM];
    private static int accumulator = 0;
    private static int counter = 0;
    private static int operationCode = 0;
    private static int operand = 0;
    private static int instructionRegister = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            clearAll();
            System.out.println("*** Bienvenido a Simpletron! ***");
            System.out.println("*** Por favor introduzca su programa una instrucción ***");
            System.out.println("*** (o dato) a la vez.  Presentaré ***");
            System.out.println("*** la localidad y un signo de interrogación (?). ***");
            System.out.println("*** Después usted tecleará la palabra para esa localidad. ***");
            System.out.println("*** Para detener la introducción de su programa, ***");
            System.out.println("*** teclee el centinela -9999. ***\n");

            try {
                do {
                    do {
                        System.out.print(counter + " ? ");
                        memory[counter] = scanner.nextInt();
                    } while (memory[counter] < -9999 || memory[counter] > 9999);
                    counter++;
                } while (memory[counter - 1] != -9999);
                counter = 0;

                System.out.println("\n*** Se ha completado la carga del programa ***");
                System.out.println("*** Inicia la ejecución del programa ***\n");

                while (operationCode != HALT) {
                    instructionRegister = memory[counter];
                    operationCode = instructionRegister / SIZEMEM;
                    operand = instructionRegister % SIZEMEM;

                    switch (operationCode) {
                        case READ:
                            System.out.print(" ? ");
                            memory[operand] = scanner.nextInt();
                            counter++;
                            break;
                        case WRITE:
                            System.out.println(memory[operand]);
                            counter++;
                            break;
                        case LOAD:
                            accumulator = memory[operand];
                            overflow();
                            counter++;
                            break;
                        case STORE:
                            memory[operand] = accumulator;
                            counter++;
                            break;
                        case ADD:
                            accumulator += memory[operand];
                            overflow();
                            counter++;
                            break;
                        case SUBTRACT:
                            accumulator -= memory[operand];
                            overflow();
                            counter++;
                            break;
                        case DIVIDE:
                            if (memory[operand] == 0)
                                throw new ArithmeticException("Error: División por cero.");
                            else {
                                accumulator /= memory[operand];
                                overflow();
                                counter++;
                            }
                            break;
                        case MULTIPLY:
                            accumulator *= memory[operand];
                            overflow();
                            counter++;
                            break;
                        case MODULE:
                            if (memory[operand] == 0)
                                throw new ArithmeticException("Error: División por cero.");
                            else {
                                accumulator %= memory[operand];
                                overflow();
                                counter++;
                            }
                            break;
                        case POWER:
                            accumulator = power(accumulator, memory[operand]);
                            overflow();
                            counter++;
                            break;
                        case BRANCH:
                            counter = operand;
                            break;
                        case BRANCHNEG:
                            if (accumulator < 0)
                                counter = operand;
                            break;
                        case BRANCHZERO:
                            if (accumulator == 0)
                                counter = operand;
                            break;
                        case HALT:
                            System.out.println("\n*** Ha terminado la ejecución de Simpletron ***\n");
                            emptyingMemory();
                            break;
                        default:
                            System.out.println("\n*** Instrucción inválida en tiempo de ejecución ***\n");
                            operationCode = HALT;
                            emptyingMemory();
                    }
                }
            } catch (ArithmeticException ex) {
                System.err.println("\n*** Terminación anormal de Simpletron ***");
                System.err.println("*** OCURRIÓ UNA EXCEPCIÓN ***");
                System.err.println(ex.getMessage());
                emptyingMemory();
                operationCode = 43;
            }scanner.close();
        } 
    }

    private static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    private static void clearAll() {
        for (int loc = 0; loc <= 99; loc++) {
            memory[loc] = 0;
        }
        accumulator = 0;
        counter = 0;
        operationCode = 0;
        operand = 0;
    }

    private static void overflow() {
        if (accumulator < -9999 || accumulator > 9999) {
            throw new ArithmeticException("Error: Desbordamiento en el acumulador.");
        }
    }

    private static void emptyingMemory() {
        System.out.println("\nREGISTROS:");
        System.out.println("acumulador               " + (accumulator >= 0 ? "+" : "") + accumulator);
        System.out.println("contador                 " + counter);}
    }