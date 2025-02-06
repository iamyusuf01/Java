public class Conditionals {
    public static void main(String[] args) {
        int salary = 25400;
            // if(salary > 10000){
            //     salary = salary + 2000;
            //     System.out.println("New salary after adding 2000 is: " + salary);
            // } else {
            //     salary = salary + 1000;
            //     System.out.println("New salary after adding 1000 is: " + salary);
            // }

            //Multiple if-else 
            if(salary > 10000){
                salary += 2000; //salary = salary + 2000
            }else if(salary > 20000){
                salary += 3000; //salary = salary + 3000

            } else {
                salary += 1000; //salary = salary + 1000
            }
        System.out.println(salary);
    }
}
