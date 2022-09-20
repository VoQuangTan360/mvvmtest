package com.fatherofapps.androidbase.data.models

data class Lesson(var id:Int,
                  var channelName:String,
                  var idTeacher:Int,
                  var idStudent:Int,
                  var timeStart:String,
                  var timeEnd:String,
                  var status:String,
                  var realTimeStart:String,
                  var realTimeEnd:String)
