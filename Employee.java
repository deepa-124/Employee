public class Employee {
        String name;
        int id;
        double salary;
        String city;
        public Employee(String name,int id,double salary,String city){
            this.name=name;
            this.id=id;
            this.salary=salary;
            this.city=city;
        }
        public void displayInfo(){
            System.out.println("Employee name"+name);
            System.out.println("Employee id"+id);
            System.out.println("Employee salary"+salary);
            System.out.println("Employee City"+city);
        }
        public static void main(String[]args){
            Employee emp1=new Employee("xyz",101,23444.0,"Dharwad");
            emp1.displayInfo();
        }
    }
