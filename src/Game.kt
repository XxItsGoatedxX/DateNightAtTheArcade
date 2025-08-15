import kotlin.random.Random
class Game {
    var creditsRequired = 0

    constructor(){
    }
    constructor(creditsRequired: Int) {
        this.creditsRequired = creditsRequired
    }

    fun swipeCard(card: Card) : String{
        if(creditsRequired > card.creditBalance){
            return "This game requires $creditsRequired, your card has insufficient funds"
        }
        val randomTickets = Random.nextInt(1, 100)
        card.creditBalance -= creditsRequired
        card.ticketBalance += randomTickets
        return "Card: ${card.cardID} Tickets won: $randomTickets Card credit: ${card.creditBalance}"
    }
}