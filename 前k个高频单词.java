import java.util.*;

class  CmpKV implements Comparator<Map.Entry<String,Integer>>{
    public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2){
        if(o2.getValue() > o1.getValue()){
            return 1;
        }
        if(o2.getValue() == o1.getValue() && o1.getKey().compareTo(o2.getKey()) > 0){
            return 1;
        }
        if(o2.getValue() == o1.getValue() && o1.getKey().compareTo(o2.getKey()) == 0){
            return 0;
        }
        return -1;
    }
}

public class Main {
    // 1.统计每个单词出现的次数--->单词--->次数
    // 2.创建一个堆（优先级队列），然后将单词-次数插入到优先级队列中
    //   默认为小堆
    //   前k个最大--->小堆
    //   前k个最小--->大堆
    //   TOP-K解决：
    //              a.先构造包含k个元素的堆
    //              b.用剩余的元素依次和堆顶元素比较，检测是否需要插入
    // 3.取前k个单词

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> m = new HashMap<>();
        for(int i = 0;i < words.length;++i){
            m.put(words[i],m.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<Map.Entry<String,Integer>> p = new PriorityQueue<>(new CmpKV());
        for(Map.Entry<String,Integer> e : m.entrySet()){
            p.offer(e);
        }

        List<String> lRet = new ArrayList<>(k);
        for(int i = 0;i < k;++i){
            lRet.add(p.poll().getKey());
        }
        return lRet;

    }
}
