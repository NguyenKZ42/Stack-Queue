package giaithuat.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(2);
		s.push(10);
		s.push(56);
		s.push(392);
		
		System.out.println("2.");
		int count = s.size();
		System.out.println("a. so phan tu cua stack la " + count);
		
		System.out.println("b. nhap so phan tu muon suat");
		int n = sc.nextInt();
		if (n > s.size() || n < 1) {
            System.out.println("Phan tu khong hop le!");
        } else {
            int i = 1;
            for (int x : s) {
                if (i == n) {
		System.out.println("phan tu trong stack " + x);
		break;
                }
                i++;
            }
        }
		System.out.println("c. noi dung cua stack " + s);
		
		System.out.println("d. nhap phan tu muon loai ");
		int phanTuMuonLoai = sc.nextInt();
		if(phanTuMuonLoai>s.size() || n < 1) {
			System.out.println("Phan tu khong hop le!");
		}else {
			int i = 1;
			for(int x : s) {
				if(i == n) {
			
		int phanTuBiLoai = s.remove(phanTuMuonLoai-1);
		System.out.println("Loai phan tu " + phanTuBiLoai);
		System.out.println("Noi dung cua stack sau khi loai phan tu do " + x);
		break;
		}
				i++;
		}
		}
		
		
		System.out.println("4.");
		Stack<Integer>tempStack= new Stack<Integer>();
		while(!s.isEmpty()) {
			tempStack.push(s.pop());
		
		}s = tempStack;
		System.out.println("Dao stack " + s);
		
		System.out.println("8.");
		Queue<String> nhiPhanStack = new LinkedList<>();
        for (int number : s) {
            String nhiPhanString = Integer.toBinaryString(number);
            nhiPhanStack.add(nhiPhanString);
        }
        System.out.println("Stack doi thanh so nhi phan: " + nhiPhanStack);
    }
	

}