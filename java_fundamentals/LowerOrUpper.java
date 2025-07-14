class LowerOrUpper{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character:"); 
        char a = scan.next().charAt(0);
        if (a >= 'a' && a <= 'z') {
            System.out.println("Lower Case");
        } else if (a >= 'A' && a <= 'Z') {
            System.out.println("Upper Case");
        } else {
            System.out.println("Not an alphabet");
        }
    }}
