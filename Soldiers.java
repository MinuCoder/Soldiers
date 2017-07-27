/**
 * Created by 민우 on 2017-07-21.
 */
import java.util.ArrayList;

public class Soldiers {
    public static int getSurvivingIndex(int n, int k) {
        ArrayList<Integer> soldiers = new ArrayList<>();
        // 군인 세우기
        for (int soldierNumber=1; soldierNumber<=n; soldierNumber++){
//            soldiers.add(new Integer(soldierNumber));
            soldiers.add(soldierNumber);
        }

        // 군인 죽이기
        int killIndex=0;
        while (soldiers.size()>1){
            killIndex=(killIndex+k-1)%soldiers.size();
            System.out.println(soldiers.remove(killIndex)+"번 군사가 죽었습니다.");
        }
        return soldiers.get(0);
    }

    public static void main(String[] args) {
        System.out.println("김신은 " + getSurvivingIndex(20, 5) + "번 자리에 서있으면 됩니다.");
    }
}
