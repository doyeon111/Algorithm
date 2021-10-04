import java.util.Scanner; 
class 상하좌우 { 
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in); // 공간의 크기 입력받기 
		int n = sc.nextInt(); sc.nextLine(); // 이동할 계획서 입력받기 
		String move = sc.nextLine(); 
		String[] plan = move.split(" "); // 초기화 
		
		int x = 1; 
		int y = 1; // 이동하기 
		
		for(int i = 0; i < plan.length; i ++){ 
			if("L".equals(plan[i])){ 
				y -= 1; 
				if(y == 0) y += 1; 
			}else if("R".equals(plan[i])){ 
				y += 1; 
				if(y == n+1) y -= 1; 
			}else if("U".equals(plan[i])){ 
				x -= 1; 
				if(x == 0) x += 1; 
			}else if("D".equals(plan[i])){ 
				x += 1; 
				if(x == n+1) x -= 1; 
			} 
		} System.out.println(x + " " + y); 
	}
}

