import jdk.jfr.internal.test.DeprecatedMethods.counter

class Card {
    var cardID = 0
    var creditBalance = 0.0
    var ticketBalance = 0

    companion object{
        private var counter = 0
    }

    init {
        counter++
        cardID = counter
    }
}