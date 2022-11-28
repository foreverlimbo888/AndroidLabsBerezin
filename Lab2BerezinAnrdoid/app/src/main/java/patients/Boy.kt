package patients

class Boy(group: BloodGroups, private val donateBlood:Boolean, private val whatRhFactor:Boolean): Patient(group), toСured
{

    override fun goToWard() {
    }

    override fun donateBlood() {
        if(donateBlood)
            super.donateBlood()
        else
            println("do not donate blood")
    }

    override fun whatRhFactor() {
        if(whatRhFactor)
            println("Blood is positive")
        else
            println("Blood is negative")
    }


    fun patientInfo()
    {
        print("Group: $group, Did donate blood? - $donateBlood, ")
        whatRhFactor()
    }

}