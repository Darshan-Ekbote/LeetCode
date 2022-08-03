class MyCalendar {
    
    TreeMap<Integer, Integer> events;

    MyCalendar() {
        events = new TreeMap();
    }

    public boolean book(int start, int end) {
        
        Integer prevEventStart = events.floorKey(start),
                nextEventStart = events.ceilingKey(start);
        //prev event should end before curr event start and 
        //next event should start after end of curr event
        if ((prevEventStart == null || events.get(prevEventStart) <= start) &&
                (nextEventStart == null || end <= nextEventStart)) {
            events.put(start, end);
            return true;
        }
        return false;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */