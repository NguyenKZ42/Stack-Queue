package giaithuat.dev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

	public class Queue1 {
	

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        Queue<Integer> queue = new LinkedList<>();

	        queue.add(10);
	        queue.add(20);
	        queue.add(30);
	        queue.add(40);
	        queue.add(50);

	        int size = queue.size();
	        System.out.println("Queue co " + size+" so phan tu");

	        System.out.println("Nhap vi tri phan tu muon xuat");
	        int n = sc.nextInt();
	        int phanTu = -1;
	        if (n > 0 && n <= size) {
	            for (int i = 1; i <= n; i++) {
	                phanTu = queue.poll();
	                queue.add(phanTu);
	            }
	        }
	        System.out.println("Vi tri " + n + " la phan tu: " + phanTu);

	        // c, xuất nội dung của queue
	        System.out.println("Noi dung cua queue la: " + queue);

	        // d, loại phần tử thứ n của queue
	        System.out.println("Nhap vi tri noi dung muon loai bo:");
	        int m = sc.nextInt() ;
	        if (m > 0 && m <= size) {
	            for (int i = 1; i <= m; i++) {
	                phanTu = queue.poll();
	            }
	        }
	        System.out.println("Loai bo phan tu o vi tri " + m + " la: " + phanTu);
	        System.out.println("Queue sau khi loai bo phan tu " +phanTu+": " + queue);

	        // e, đảo ngược queue
	        Queue<Integer> reversedQueue = new LinkedList<>();
	        while (!queue.isEmpty()) {
	            reversedQueue.add(queue.poll());
	        }
	        queue = reversedQueue;
	        System.out.println("Queue sau khi dao: " + queue);

	      
	        
	        Queue<String> nhiPhanQueue = new LinkedList<>();
	        for (int number : queue) {
	            String nhiPhanString = Integer.toBinaryString(number);
	            nhiPhanQueue.add(nhiPhanString);
	        }
	        System.out.println("Queue doi thanh so nhi phan: " + nhiPhanQueue);
	    }
	}


