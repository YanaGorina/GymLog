package com.example.gymlog.db.typeConverters;

import androidx.room.TypeConverter;

import java.util.Date;


public class DateTypeConverter {
    @TypeConverter
    public long dateDateToLong(Date date){
        return date.getTime();
    }

    @TypeConverter
    public Date convertLongToDate(long time){
        return new Date(time);
    }
}
