public class TimeClient extends ThinkJavaChapter11Practice {

    public void main(String[] args) {
        ThinkJavaChapter11Practice.Time time = new ThinkJavaChapter11Practice.Time(11, 59, 59.9);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }

}
