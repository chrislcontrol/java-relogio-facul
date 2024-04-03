package models;

public class Watch {
    private int hour, second, minutes;

    public Watch() {
        this(0, 0, 0);
    }


    public Watch(int hour, int second, int minutes) {
        this.hour = hour;
        this.second = second;
        this.minutes = minutes;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) throws Exception {
        if (hour < 0 || hour > 23) {
            throw new Exception("Hour must be a positive integer within 24");
        }
        this.hour = hour;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) throws Exception {
        if (second < 0 || second > 59) {
            throw new Exception("Second must be a positive integer within 60");
        }
        this.second = second;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) throws Exception {
        if (second < 0 || second > 59) {
            throw new Exception("Minute must be a positive integer within 60");
        }
        this.minutes = minutes;
    }

    public void increaseOneSecond() throws Exception {
        if (this.second == 59) {
            this.increaseOneMinute();
            this.setSecond(0);
            return;
        }

        this.second++;
    }

    public void increaseOneMinute() throws Exception {
        if (this.minutes == 59) {
            this.increaseOneHour();
            this.setMinutes(0);
            return;
        }

        this.minutes++;
    }

    public void increaseOneHour() throws Exception {
        if (this.hour == 23) {
            this.setHour(0);
            return;
        }
        this.setHour(this.hour + 1);
    }

    public void decreaseOneHour() throws Exception {
        if (this.hour == 0) {
            this.setHour(23);
            return;
        }

        this.hour--;
    }

    public void decreaseOneMinute() throws Exception {
        if (this.minutes == 0) {
            this.setMinutes(59);
            this.decreaseOneHour();
            return;
        }

        this.minutes--;
    }

    public void decreaseOneSecond() throws Exception {
        if (this.second == 0) {
            this.setSecond(59);
            this.decreaseOneMinute();
            return;
        }

        this.second--;
    }

    public int getTotalSeconds() {
        return ((this.hour * 60) * 60) * 60;
    }

    public void printCurrentHour() {
        String hour = this.hour < 10
                ? "0" + this.hour
                : "" + this.hour;
        String minute = this.minutes < 10
                ? "0" + this.minutes
                : "" + this.minutes;
        String seconds = this.second < 10
                ? "0" + this.second
                : "" + this.second;
        System.out.printf("Hora atual: %s:%s:%s%n", hour, minute, seconds);
    }
}


