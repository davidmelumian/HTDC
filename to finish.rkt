;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-intermediate-lambda-reader.ss" "lang")((modname |to finish|) (read-case-sensitive #t) (teachpacks ((lib "batch-io.rkt" "teachpack" "2htdp"))) (htdp-settings #(#t constructor repeating-decimal #f #t none #f ((lib "batch-io.rkt" "teachpack" "2htdp")) #f)))
class Time {
    int hours;
    int minutes;
    Time (int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
}


class Departure {
    String name;
    Time t;
    Departure (String name, Time t){
        this.name=name;
        this.t=t;
    }

}