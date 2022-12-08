class Clock
{
    int hours,minutes,seconds;
    Clock()
    {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }
    Clock(int h,int m,int s)
    {
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }
    Clock(int sec)
    {
        minutes = sec/60;
        seconds = sec%60;
        hours = minutes/60;
        minutes = minutes%60;
    }
    void setClock(int sec)
    {
        minutes = sec/60;
        seconds = sec%60;
        hours = minutes/60;
        minutes = minutes%60;
    }
    int getHours()
    {
        return hours;
    }
    int getMinutes()
    {
        return minutes;
    }
    int getSeconds()
    {
        return seconds;
    }
    void setHours(int h)
    {
        this.hours = h;
    }
    void setMinutes(int m)
    {
        this.minutes = m;
    }
    void setSeconds(int s)
    {
        this.seconds = s;
    }
    void tick()
    {
        this.seconds +=1;
        if (seconds >= 60)
        {
            minutes+=1;
            {
                if(minutes >=60)
                {
                    hours+=1;
                    if(hours>=24)
                        hours-=24;
                    minutes-=60;
                }
            }
            seconds-=60;
        }
    }
    void addClock(Clock obj)
    {
        this.hours += obj.hours;
        this.minutes += obj.minutes;
        this.seconds += obj.seconds;
        if (this.seconds >= 60)
        {
            this.minutes +=1;
            this.seconds -=60;
        }
        if (this.minutes >=60)
        {
            this.hours += this.minutes/60;
            this.minutes %= 60;
        }
        if(this.hours >= 24)
            this.hours %= 24;
    }
    String ToString()
    {
        String time = "";
        if (hours < 10)
            time = time + 0 + hours;
        else
            time = time + hours;
        time = time + ":";
        if (minutes < 10)
            time = time + 0 + minutes;
        else
            time = time + minutes;
        time = time + ":";
        if (seconds < 10)
            time = time + 0 + seconds;
        else
            time = time + seconds;
        return time;
    }
    void tickdown()
    {
        this.seconds +=1;
        if (seconds >= 60)
        {
            minutes+=1;
            {
                if(minutes >=60)
                {
                    hours+=1;
                    if(hours>=24)
                        hours-=24;
                    minutes-=60;
                }
            }
            seconds-=60;
        }
    }
    Clock subtractClock(Clock obj)
    {
        Clock obj2 = new Clock(hours,minutes,seconds);
        obj2.hours -= obj.hours;
        obj2.minutes -= obj.minutes;
        obj2.seconds -= obj.seconds;
        if (obj2.seconds < 0)
        {
            obj2.minutes -=1;
            obj2.seconds +=60;
        }
        if (obj2.minutes < 0)
        {
            obj2.hours -= 1;
            obj2.minutes += 60;
        }
        if (obj2.hours < 0)
            obj2.hours -= 24;
        return obj2;
    }
}

public class ClockDemo_Ass2 
{
    public static void main(String args[])
    {
        Clock firstClock = new Clock(12350);
        for(int i=1;i<=10;i++)
        {
            firstClock.tick();
            System.out.println("Time in clock1 after tick " + i + " : " + firstClock.ToString());
        }
        Clock secondClock = new Clock(10,25,38);
        for(int i=1;i<=10;i++)
        {
            secondClock.tick();
            System.out.println("Time in clock2 after tick " + i + " : " + secondClock.ToString());
        }
        firstClock.addClock(secondClock);
        System.out.println("Time in 1st Clock : " + firstClock.ToString());
        System.out.println("Time in 2nd Clock : " + secondClock.ToString());
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("Difference of Times = " + thirdClock.ToString());
    }
}