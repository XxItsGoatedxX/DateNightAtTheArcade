class Terminal {


    fun transfer(card1: Card, card2: Card, transferCreditAmount : Double, transferTicketAmount : Int) : String{
        card1.creditBalance -= transferCreditAmount
        card1.ticketBalance -= transferTicketAmount
        card2.creditBalance += transferCreditAmount
        card2.ticketBalance += transferTicketAmount
        return "$$transferCreditAmount and $transferTicketAmount tickets were transferred from card ${card1.cardID} to card ${card2.cardID}"
    }
    fun display(card: Card): String {
        return "Card ID: ${card.cardID}, Card Balance: ${card.creditBalance}, Card Tickets: ${card.ticketBalance}"
    }
    fun cashToCredit(cash: Int) : Int{
        return cash * 2
    }
    fun checkCardBalance(card: Card): Double{
        return card.creditBalance
    }
}