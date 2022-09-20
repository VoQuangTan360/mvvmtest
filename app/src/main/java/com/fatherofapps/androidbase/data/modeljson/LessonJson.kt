package com.fatherofapps.androidbase.data.modeljson

import com.fatherofapps.androidbase.data.models.Lesson

data class LessonJson(var id:Int,
                      var channelName:String,
                      var idTeacher:Int,
                      var idStudent:Int,
                      var timeStart:String,
                      var timeEnd:String,
                      var status:String,
                      var realTimeStart:String,
                      var realTimeEnd:String){
    fun toLesson(): Lesson {
        return Lesson(
            id=id,
            channelName=channelName,
            idTeacher=idTeacher,
            idStudent=idStudent,
            timeStart=timeStart,
            timeEnd=timeEnd,
            status=status,
            realTimeStart=realTimeStart,
            realTimeEnd = realTimeEnd,

        )
    }
}
