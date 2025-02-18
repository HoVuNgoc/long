
package javaapplicationt3;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho động vật Dog
        System.out.println("Enter information for Dog:");
        System.out.print("ID: ");
        String dogId = scanner.nextLine();
        System.out.print("Source: ");
        String dogSource = scanner.nextLine();
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String dogDateInput = scanner.nextLine();
        Date dogDateOfBirth = new Date(dogDateInput); // Chuyển đổi chuỗi thành Date
        System.out.print("Color: ");
        String dogColor = scanner.nextLine();
        System.out.print("Breed: ");
        String dogBreed = scanner.nextLine();

        Dog dog1 = new Dog(dogId, dogSource, dogDateOfBirth, dogColor, dogBreed);

        // Nhập thông tin cho động vật Cat
        System.out.println("Enter information for Cat:");
        System.out.print("ID: ");
        String catId = scanner.nextLine();
        System.out.print("Source: ");
        String catSource = scanner.nextLine();
        System.out.print("Date of Birth (YYYY-MM-DD): ");
        String catDateInput = scanner.nextLine();
        Date catDateOfBirth = new Date(catDateInput); // Chuyển đổi chuỗi thành Date
        System.out.print("Color: ");
        String catColor = scanner.nextLine();
        System.out.print("Breed: ");
        String catBreed = scanner.nextLine();

        Cat cat1 = new Cat(catId, catSource, catDateOfBirth, catColor, catBreed);

        // Tạo danh sách động vật
        AnimalList animalList = new AnimalList();

        // Sử dụng instanceof để thêm Dog hay Cat vào danh sách
        if (dog1 instanceof Animal) {
            animalList.addAnimal(dog1);
        }

        if (cat1 instanceof Animal) {
            animalList.addAnimal(cat1);
        }

        // Gọi phương thức displayAll() để hiển thị thông tin và hành động của mỗi con vật
        animalList.displayAll();

        scanner.close();  // Đảm bảo đóng scanner sau khi sử dụng
    }
}