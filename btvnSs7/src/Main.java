import Mt.Account;
import Mt.PersonAccount;
import Mt.SavingAccount;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account obj=new Account();
        int current =0;
        PersonAccount obj2;
        do {
            System.out.println("**************menu*************");

            System.out.println("1. nhập thông tin");
            System.out.println("2. nạp tiền vào");
            System.out.println("3. rút tiền ra");
            System.out.println("4. tính lãi xuất theo tháng");
            System.out.println("Mời bạn nhập lệnh");
            int x=Integer.parseInt(scanner.nextLine());

            switch (x){
                case 1:
                    System.out.println("mời bạn nhạp vào tên:");
                    String name = scanner.nextLine();
                    System.out.println("mời bạn nhạp vào ID:");
                    int no = Integer.parseInt(scanner.nextLine());
                    System.out.println("mời bạn nhạp vào số tiền muốn gủi:");
                    int money = Integer.parseInt(scanner.nextLine());
                     obj = new Account(no,name,money);
                    System.out.println(obj.toString());
                     current= obj.getBalance();
                    break;
                case 2 :
                    System.out.println("mòi bạn nhập vào só tiền muốn gửi");
                    int feee = Integer.parseInt(scanner.nextLine());

                     obj2 =new PersonAccount(obj.getAccountNo(),obj.getCustomerName(), current,feee);
                    System.out.println( obj2.deposite());
                    // obj2.load();
                    current = current+feee;
                    break;
                case 3:
                    System.out.println("mòi bạn nhập vào só tiền muốn rút");
                    int fee = Integer.parseInt(scanner.nextLine());

                     obj2 =new PersonAccount(obj.getAccountNo(),obj.getCustomerName(), current,fee);
                    System.out.println( obj2.withDraw());
                    // obj2.load();
                    current = current-fee;
                    break;
                case 4:
                    System.out.println("mời ban nhập vào sô thắng muốn gửi tiết kiệm");
                    int month = Integer.parseInt(scanner.nextLine());
                    SavingAccount obj3 = new SavingAccount(obj.getAccountNo(),obj.getCustomerName(),current,month);
                    System.out.println( obj3.toString());;
            }


        }while (true);
    }
}