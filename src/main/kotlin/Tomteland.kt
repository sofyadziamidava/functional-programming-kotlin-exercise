/*
Tomtarna på Nordpolen har en strikt chefs-hierarki
Högsta chefen för allt är "Tomten"
Under "Tomten" jobbar "Glader" och "Butter"
Under "Glader" jobbar "Tröger", "Trötter"och "Blyger"
Under "Butter" jobbar "Rådjuret", "Nyckelpigan", "Haren" och "Räven"
Under "Trötter" jobbar "Skumtomten"
Under "Skumtomten" jobbar "Dammråttan"
Under "Räven" jobbar "Gråsuggan" och "Myran"
Under "Myran" jobbar "Bladlusen"
Er uppgift är att illustrera tomtens arbetshierarki i en lämplig datastruktur.
(Det finns flera tänkbara datastrukturer här)
Skriv sedan en funktion där man anger ett namn på tomten eller någon av hens underhuggare som
inparameter.
Funktionen listar sedan namnen på alla underlydandesom en given person har
Expempel: Du anger "Trötter" och får som svar ["Skumtomten", "Dammråttan"]"
För att bli godkänd på uppgiften måste du använda rekursion.
 */

class Tomteland {

    val t1 = "Tomten"
    val t2 = "Glader"
    val t3 = "Butter"
    val t4 = "Tröger"
    val t5 = "Trötter"
    val t6 = "Blyger"
    val t7 = "Rådjuret"
    val t8 = "Nyckelpigan"
    val t9 = "Haren"
    val t10 = "Räven"
    val t11 = "Skumtomten"
    val t12 = "Dammråttan"
    val t13 = "Gråsuggan"
    val t14 = "Myran"
    val t15 = "Bladlusen"

    val l1 = mutableListOf(t2, t3)
    val l2 = mutableListOf(t4, t5, t6)
    val l3 = mutableListOf(t7, t8, t9, t10)
    val l4 = mutableListOf(t11)
    val l5 = mutableListOf(t12)
    val l6 = mutableListOf(t13, t14)
    val l7 = mutableListOf(t15)

    val relationships = mapOf(t1 to l1, t2 to l2, t3 to l3, t5 to l4, t11 to l5, t10 to l6, t14 to l7)

    fun getUnderlings(currentName: String, res: MutableList<String>): List<String> {

        val temp = relationships.get(currentName)
        if (temp != null) {
            for (r in temp) {
                res.add(r)
                if (relationships.containsKey(r)) {
                    getUnderlings(r, res)
                }
            }

        }
        return res

    }


}

fun main() {

}



