import java.util.*;
 
class ½Ã°¢ {
 
  public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int answer=0;
 
		for(int i=0;i<=n;i++){
        
			for(int j=0;j<60;j++){
            
				for(int k=0;k<60;k++){
					String tmpStr="";
					tmpStr+=i;
					tmpStr+=j;
					tmpStr+=k;
					if(tmpStr.contains("3")){
						answer++;
					}
				}
                
			}
            
		}
        
		System.out.print(answer);
		
  }
 
}