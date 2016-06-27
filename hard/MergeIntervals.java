import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Use sorting.
 */
public class MergeIntervals {
	public class Interval {
		int start;
		int end;

		Interval() {start = 0; end = 0;}
		Interval(int s, int e) {start = s; end = e;}
	 }

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> merged = new ArrayList<Interval>();
        
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }    
        });
        
        Interval interval = null;
        for (int i = 0; i < intervals.size(); i++) {
            if (i == 0 || intervals.get(i).start > interval.end) {
                interval = new Interval(intervals.get(i).start, intervals.get(i).end);
                merged.add(interval);
            } else {
                if (intervals.get(i).end > interval.end) {
                    interval.end = intervals.get(i).end;
                }
            }
        }
        return merged;
    }
    
}
