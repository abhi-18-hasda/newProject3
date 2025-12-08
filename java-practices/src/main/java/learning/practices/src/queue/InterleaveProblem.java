package learning.practices.src.queue;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveProblem {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        interleave(q);
    }

    private static void interleave(Queue<Integer> q) {
        if(q.isEmpty()){
            return;
        }
        int size = q.size()/2;
        Queue<Integer> firstHalf = new LinkedList<>();
        int count  = 0;
        while(count != size){
            firstHalf.add(q.poll());
            count++;
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.poll());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.poll();
        }
    }
}
