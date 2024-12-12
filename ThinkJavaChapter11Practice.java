public class ThinkJavaChapter11Practice {
    public class Time {
        private int hour;
        private int minute;
        private double second;

        public void Time() {
            this.hour = 0;
            this.minute = 0;
            this.second = 0.0;
        }

        public Time(int hour, int minute, double second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        public int getHour() {
            return this.hour;
        }

        public int getMinute() {
            return this.minute;
        }

        public double getSecond() {
            return this.second;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public void setMinute(int minute) {
            this.minute = minute;
        }

        public void setSecond(double second) {
            this.second = second;
        }
    }

    public class TimeClient {
        public void main(String[] args) {
            Time time = new Time(11, 59, 59.9);
            System.out.println(time.hour);
            System.out.println(time.getHour());
            System.out.println(time.minute);
            System.out.println(time.getMinute());
            System.out.println(time.second);
            System.out.println(time.getSecond());
        }
    }
}