package com.worthy.run;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * @author worthy
 * @create 2022-05-31 15:24
 */
public class TimerEvent {
    private static final long serialVersionUID = -6966030226883961108L;

    @JsonProperty(value = "Message")
    private String Message;

    @JsonProperty(value = "Time")
    private String Time;

    @JsonProperty(value = "TriggerName")
    private String TriggerName;

    @JsonProperty(value = "Type")
    private String Type;

    public String getType(){
        return this.Type;
    }

    public String getTriggerName(){
        return this.TriggerName;
    }

    public String getTime(){
        return this.Time;
    }

    public String getMessage(){
        return this.Message;
    }

    public TimerEvent() {}

    @Override
    public String toString() {
        return "TimerEvent{" +
                "type=" + Type +
                "triggerName=" + TriggerName +
                "time=" + Time +
                "message=" + Message +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimerEvent that = (TimerEvent) o;
        return Objects.equals(this.Message, that.Message) && Objects.equals(this.Time, that.Time)
                && Objects.equals(this.Type, that.Type) && Objects.equals(this.TriggerName, that.TriggerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this);
    }

    @Override
    public TimerEvent clone() {
        try {
            return (TimerEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone()", e);
        }
    }
}
