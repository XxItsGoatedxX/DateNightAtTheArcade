class PrizeCategory {
    var name = ""
    var ticketsRequired = 0
    var count = 0

    constructor() {

    }
    constructor(name: String, ticketsRequired: Int, count: Int) {
        this.name = name
        this.ticketsRequired = ticketsRequired
        this.count = count
    }
}