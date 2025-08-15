//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val card1 = Card()
    val card2 = Card()
    val game1 = Game(5)
    val game2 = Game(7)
    val terminal1 = Terminal()
    val terminal2 = Terminal()
    println(terminal1.addCredits(card1, 100))
    println(terminal1.addCredits(card2, 20))
    println("\n\n>>> Card #1 is used to play Game #1 5 times")
    repeat(5){
        println(game1.play(card1))
    }
    println("\n\n>>> Card #2 is used to play Game #2 5 times")
    repeat(5){
        println(game2.play(card2))
    }
    println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Card #2...")
    println(terminal1.transfer(card1, card2, 20.0, 10))
    println(terminal1.transfer(card1, card2, 20.0, 10))
    println("\n\nRequest prize Candy with Card #2")
    println(terminal1.requestPrize("Candy", card2))
    println("\n\nCard #1 is used to play Game #1 one more time...")
    println(game1.play(card1))
    println("\n\n>>> Request different prizes with Card #1 and Card #2...")
    println(terminal1.requestPrize("Candy", card1))
    println(terminal1.requestPrize("Hat", card2))
    println(terminal1.requestPrize("Candy", card2))
    println(terminal1.requestPrize("David", card2))
    println(terminal1.requestPrize("Candy", card2))
    println(terminal1.requestPrize("Candy", card2))
}