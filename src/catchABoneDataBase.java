import java.util.ArrayList;
import java.util.Iterator;

public class catchABoneDataBase {
    ArrayList<Integer> scores  = new ArrayList<>();
    public catchABoneDataBase(){

    }
    public void addWin(int score){
        if(scores.isEmpty()){
            scores.add(0);
            scores.add(0);
        }
        scores.add(0,score);
    }
    public void addLose(int score){
        if(scores.isEmpty()){
            scores.add(0);
            scores.add(0);
        }
        for (int i = 0; i < scores.size()-1; i++) {
            if(score >= scores.get(i)){
                scores.add(i,score);
                break;
            }
            if(score<=scores.get(i) && score>=scores.get(i+1)){
                scores.add(i+1,score);
                break;
            }
        }
    }


    public ArrayList<Integer> getHistory(){
        return scores;
    }
    public boolean hasnotPlayed(){
        return scores.isEmpty();
    }
}
