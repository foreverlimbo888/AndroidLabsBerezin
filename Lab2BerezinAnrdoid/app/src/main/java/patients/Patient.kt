package patients

abstract class Patient(val group:BloodGroups)
{

    abstract fun goToWard()

    open fun donateBlood()
    {
        println("donate blood")
    }

    enum class BloodGroups(){
        GroupI, GroupII, GroupIII, GroupIV
    }
}