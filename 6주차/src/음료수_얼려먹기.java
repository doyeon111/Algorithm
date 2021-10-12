import java.io.*;
import java.util.Scanner;

public class �����_����Ա� {

    public static int N,M;
    public static int [][] graph = new int [1000][1000];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // N, M �Է�
        N = scanner.nextInt();
        M = scanner.nextInt();
        scanner.nextLine(); //���� ����


        // 2���� ����Ʈ�� �� ���� �Է� �ޱ�
        for(int i=0; i <N; i++){
            String str = scanner.nextLine();
            for(int j=0; j<M; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        scanner.close();

        //���� ���(��ġ)�� ���Ͽ� ����� ä���
        int result = 0;
        // 2���� ����Ʈ�� �� ���� �Է� �ޱ�
        for(int i=0; i <N; i++){
            for(int j=0; j<M; j++){
                //���� ��ġ���� DFS ����
                if(dfs(i, j)){
                    result+=1;
                }
            }
        }

        System.out.println(result);


    }

    // DFS�� Ư�� ��带 �湮�ϰ� �����¿�� ����� ��� ���鵵 �湮
    public static boolean dfs(int x, int y){
        // �־��� ������ ����� ��쿡�� ����
        if(x <= -1 || x>= N || y <= -1 || y >= M)
            return false;

        //���� ��带 ���� �湮���� �ʾҴٸ�
        if(graph[x][y] == 0){
            //�ش� ��� �湮 ó��
            graph[x][y] = 1;
            dfs(x -1, y);
            dfs(x, y -1);
            dfs(x + 1, y );
            dfs(x, y + 1);
            return true;
        }
        return false;
    }
}