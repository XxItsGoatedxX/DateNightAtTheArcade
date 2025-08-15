class Terminal {
    var candy = PrizeCategory("Candy", 10, 1)
    var hat = PrizeCategory("Hat", 10, 2)
    var david = PrizeCategory("David", 10, 3)
    var prizes = listOf<PrizeCategory>(candy, david, hat)

    //Transfers credit and tickets between cards
    fun transfer(card1: Card, card2: Card, transferCreditAmount: Double, transferTicketAmount: Int): String {
        if(card1.creditBalance < transferCreditAmount) {
            return "Not enough credits!"
        }
        if(card1.ticketBalance < transferTicketAmount) {
            return "Not enough tickets!"
        }
        card1.creditBalance -= transferCreditAmount
        card1.ticketBalance -= transferTicketAmount
        card2.creditBalance += transferCreditAmount
        card2.ticketBalance += transferTicketAmount
        return "$$transferCreditAmount and $transferTicketAmount tickets were transferred from card ${card1.cardID} to card ${card2.cardID}"
    }

    //Returns a string containing the details of a card
    fun display(card: Card): String {
        return "Card ID: ${card.cardID}, Card Balance: ${card.creditBalance}, Card Tickets: ${card.ticketBalance}"
    }

    //Math function to convert cash to credit
    fun cashToCredit(cash: Int): Int {
        return cash * 2
    }

    //Checks and returns the balance of a card
    fun checkCardBalance(card: Card): Double {
        return card.creditBalance
    }

    fun requestPrize(prizename: String, card: Card): String {
        var prize = PrizeCategory()
        if (findPrize(prizename).name == "") {
            prize = findPrize(prizename)
        }
        if (card.ticketBalance <= prize.ticketsRequired) {
            return "Invalid ticket amount"
        } else {
            card.ticketBalance -= prize.ticketsRequired
            return "Congratulations!! Here is your ${prize.name}"
        }
    }
    //Find a prize by name
    fun findPrize(prizeName: String): PrizeCategory {
        for (prizeCategory in prizes) {
            if (prizeCategory.name == prizeName) {
                return prizeCategory
            }

        }
        return PrizeCategory()
    }
    //Add credits to a card
    fun addCredits(card1: Card, funds: Int) {
        card1.creditBalance += funds
    }
}
