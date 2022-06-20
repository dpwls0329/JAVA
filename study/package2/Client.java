package study.package2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {

    HashMap<String, Computer> computerList = new HashMap<>();
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int check;
        Client client = new Client();

        while(true) {

            System.out.println("1. 등록  2. 목록   3. 삭제   4. 종료");
            check =  client.input.nextInt();

            if(check == 4) break;
            client.input.nextLine();

            switch(check){

                case 1:
                    client.resisterComputer();
                    break;

                case 2:
                    client.getInfo();
                    break;

                case 3:
                    System.out.println("고유번호를 입력하세요.");
                    String name =  client.input.nextLine();
                    client.deleteComputer(name);
            }
            

        } 
    }

    public void resisterComputer(){

        System.out.println("고유번호를 입력하세요.");
        String name = input.nextLine();

        System.out.println("CPU 이름은?");
        CPU cpu = new CPU(input.nextLine());
        
        System.out.println("-----------");

        System.out.println("메모리 크기는?(숫자만 입력(GB))");
        Ram ram = new Ram(input.nextInt());

        System.out.println("-----------");
        
        System.out.println("SSD 용량은?(숫자만 입력(GB))");
        SSD ssd = new SSD(input.nextInt());

        Computer computer = new Computer(name, cpu, ram, ssd);

        System.out.println("-----------");
        System.out.println("cpu: " + computer.cpu + "\nram: " + computer.ram + "\nssd: " + computer.ssd );
        System.out.println("-----------\n");

        this.computerList.put(name,computer);
        System.out.println("등록이 완료 되었습니다.\n");
    }

    public void getInfo() {
        
        for(Map.Entry<String,Computer> entry : this.computerList.entrySet()){
            
            Computer computer = entry.getValue();

            System.out.println("-------------");
            System.out.println("이름 : " + computer.name);
            System.out.println("CPU : " + computer.cpu);
            System.out.println("RAM : " + computer.ram);
            System.out.println("SSD : " + computer.ssd);
        }

        System.out.println("-------------\n");
    }

    public void deleteComputer(String name) {
        if(this.computerList.containsKey(name)) {
            this.computerList.remove(name);
            System.out.println("삭제가 완료되었습니다.\n");
        } else {
            System.out.println("해당 번호가 없습니다.\n");
        }
        

    }
}