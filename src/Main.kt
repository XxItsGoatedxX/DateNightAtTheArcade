//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val card1 = Card()
    val card2 = Card()
    val game1 = Game(5)
    val game2 = Game(7)
    val terminal1 = Terminal()
    val terminal2 = Terminal()
    terminal1.addCredits(card1, 20)
    terminal1.addCredits(card2, 20)
    println("\n\n>>> Card #1 is used to play Game #1 5 times")
    repeat(5){
        game1.play(card1)
    }
    println("\n\n>>> Card #2 is used to play Game #2 5 times")
    repeat(5){
        game2.play(card2)
    }
    println("\n\n>>> Credits & Tickets will be transferred from Card #1 to Card #2...")
    terminal1.transfer(card1, card2, 20.0, 10)
    terminal1.transfer(card1, card2, 20.0, 10)
    println("\n\n Request prize Candy with Card #2")
    terminal1.requestPrize("Candy", card2)
    println("\n\n Card #1 is used to play Game #1 one more time...")
}