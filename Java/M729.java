class MyCalendar {
    TreeMap<Integer, Integer> map;
    public MyCalendar() {
        map  = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        if (map.floorKey(start) != null) {
            int target = map.get(map.floorKey(start));
            if (target > start) return false;
        }
        if (map.lowerKey(end) != null && map.lowerKey(end) >= start) return false;
        map.put(start, end);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
